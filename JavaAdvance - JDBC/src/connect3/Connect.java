package connect3;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {

	Connection connection;

	public void doConnection() throws SQLException {
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "123456");
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement("select * from client");
		ResultSet resultSet = preparedStatement.executeQuery();

		

		while (resultSet.next()) {
			for (int i = 1; i < tableSize("select * from client"); i++) {

				System.out.print(resultSet.getString(i) + " ");

			}
			System.out.println();
		}

	}
	
	
	public int tableSize(String query) throws SQLException{
		query = "select * from client";
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "123456");
		PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();

		int c = 0;
		try {
			while (resultSet.next()) {
				c++;
			}
		} catch (SQLException e) {
		} finally {
			c--;
		}
		
		
		return c;
	}

}
