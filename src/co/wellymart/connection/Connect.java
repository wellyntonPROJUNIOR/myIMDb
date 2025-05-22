// Package where it is located
package co.wellymart.connection;
// Local files imports
import java.sql.Connection;
// External libraries imports
import java.sql.DriverManager;
import java.sql.SQLException;

// Connection to database
public class Connect {
    private static final String url = "jdbc:mysql://localhost:3306/db_imdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String user = "root"; // MySQL co.wellymart.classes.User
    private static final String password = "130507ws"; // co.wellymart.classes.User password

    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(url, user, password);
            }
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
