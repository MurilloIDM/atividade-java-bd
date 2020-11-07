import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDAO {
	
	public void insert (Account account) throws SQLException {
		Connection connection = DatabaseApplication.getConnection();
		String sql = "INSERT INTO Conta (titular, numero, agencia, limite, saldo) VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, account.getHolder());
		stmt.setLong(2, account.getNumber());
		stmt.setLong(3, account.getAgency());
		stmt.setDouble(4, account.getLimit());
		stmt.setDouble(5, account.getBalance());
		stmt.execute();
		stmt.close();
		connection.close();
	}

	public void listing () throws SQLException {
		Connection connection = DatabaseApplication.getConnection();
		String sql = "SELECT * FROM Conta";
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		ResultSet resultTable = stmt.executeQuery();
		
		while (resultTable.next()) {
			System.out.println("\n===============");
			System.out.printf("ID: %d\n", resultTable.getInt("id"));
			System.out.printf("Titular: %s\n", resultTable.getString("titular"));
			System.out.printf("Número: %d\n", resultTable.getLong("numero"));
			System.out.printf("Agência: %d\n", resultTable.getLong("agencia"));
			System.out.printf("Limite: %.2f\n", resultTable.getFloat("limite"));
			System.out.printf("Saldo: %.2f\n", resultTable.getFloat("saldo"));
		}
		
		resultTable.close();
		stmt.close();
		connection.close();
	}
	
	public void update (Account account, int id) throws SQLException {
		Connection connection = DatabaseApplication.getConnection();
		String sql = "UPDATE Conta SET titular=?, numero=?, agencia=?, limite=?, saldo=? WHERE id=" + id;
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, account.getHolder());
		stmt.setLong(2, account.getNumber());
		stmt.setLong(3, account.getAgency());
		stmt.setDouble(4, account.getLimit());
		stmt.setDouble(5,  account.getBalance());
		stmt.execute();
		stmt.close();
		connection.close();
	}
	
	public void delete (int id) throws SQLException {
		Connection connection = DatabaseApplication.getConnection();
		String sql = "DELETE FROM Conta WHERE id=" + id;
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.execute();
		stmt.close();
		connection.close();
		
	}
	
}
