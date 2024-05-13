package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class Repository<T> {

    protected abstract String getInsertSQL();

    protected abstract void setInsertParameters(PreparedStatement statement, T object) throws SQLException;

    protected abstract String getSelectSQL();

    protected abstract T getSelectObject(ResultSet resultSet) throws SQLException;

    public void insert(List<T> objects) throws SQLException {
        Connection connection = null;
        String insertSQL = getInsertSQL();
        try {
            connection = DatabaseConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(insertSQL);
            connection.setAutoCommit(false);
            for (T object : objects) {
                setInsertParameters(statement, object);
                statement.addBatch();
            }
            statement.executeBatch();
            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
            if (connection != null) {
                connection.rollback();
            }
            throw e;
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    public List<T> select() throws SQLException {
        List<T> objects = new ArrayList<>();
        Connection connection = null;
        String selectSQL = getSelectSQL();
        try {
            connection = DatabaseConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(selectSQL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                objects.add(getSelectObject(resultSet));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            if (connection != null) {
                connection.rollback();
            }
            throw e;
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
        return objects;
    }
}
