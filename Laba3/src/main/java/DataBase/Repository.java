package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public abstract class Repository<T> {

    protected abstract String getInsertSQL();

    protected abstract void setInsertParameters(PreparedStatement statement, T object) throws SQLException;

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
}
