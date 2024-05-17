package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RepositoryManipulationDB {

    public void execute(String query) {
        PreparedStatement statement = null;
        Connection connection = null;
        try {
            connection = DatabaseConnection.getConnection();
            statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch (SQLException e) {
             System.out.println("Oшибка при создании таблиц в БД" + e.getMessage());
        } finally {
            try {
                 if(statement != null){
                    statement.close();
                }  
                if (connection != null) {
                    connection.close();
                }
                  
            } catch (SQLException e) {
                 System.out.println("Oшибка при закрытии statement" + e.getMessage());
            }
        }
    }
}
