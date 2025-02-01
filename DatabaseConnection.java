import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/javaconnection";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1111";

    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Connection conn = connect();
        if (conn != null) {
            System.out.println("Connected to PostgreSQL!");
        } else {
            System.out.println("Connection failed.");
        }
    }
}
