package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:postgresql://aws-0-eu-central-1.pooler.supabase.com:5432/postgres";
    private static final String USER = "postgres.gvdaausfozckppqzdnai";
    private static final String PASSWORD = "Russia1812??55";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Не найден класс драйвера" + e.getMessage());
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
