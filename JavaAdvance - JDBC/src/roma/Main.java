package roma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "123456");

		PreparedStatement statement =/*(PreparedStatement)*/  connection.prepareStatement("select * from client where age >?");
		statement.setInt(1, 27);
		ResultSet resultSet = statement.executeQuery();

		while (resultSet.next()) {
			Client client = new Client(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7),
					resultSet.getInt(8));
			System.out.println(client);

		}
	}

}
