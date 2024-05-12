package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RepositoryManipulationDB {

    public void execute(String query) {

        Connection connection = null;
        try {
            connection = DatabaseConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(query);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
