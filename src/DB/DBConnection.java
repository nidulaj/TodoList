package DB;
//import
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static String url = "jdbc:mysql://localhost:3306/todolistdb?useSSL=false&serverTimezone=UTC";
    private static String user = "root";
    private static String pass = "2003";
    private static Connection con;

    public static Connection getConnection() {
        try {
            // Use the updated MySQL Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Database connected successfully.");
        } catch (Exception e) {
            // Log a more descriptive error message
            System.err.println("Database connection failed: " + e.getMessage());
        }
        return con;
    }
}
