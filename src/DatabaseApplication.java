import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseApplication {
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/sistema?serverTimezone=UTC", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
