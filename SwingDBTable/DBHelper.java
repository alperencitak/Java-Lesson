package SwingDBTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

    private final String username = "root";
    private final String password = "mysql12345";
    private final String dbUrl = "jdbc:mysql://127.0.0.1:3306/sakila";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, username, password);
    }

    public void showErrorMessage(SQLException exception) {
        System.out.println("Error -> " + exception.getMessage());
        System.out.println("Error code -> " + exception.getErrorCode());
    }
}
