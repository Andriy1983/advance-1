package connect2;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Connection;

public class Connect {

	Connection connection ;
	PreparedStatement preparedStatement;

	public void openConnect(String url, String user, String password) {
		try {
			this.connection = (Connection) DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Problems in opening connection");

		}

	}

	public void makeRequest(String requestFromDB) {
		try {
			//почему интерфейс? что он может делать?как так?
			preparedStatement = connection.clientPrepareStatement(requestFromDB);
			System.out.println(preparedStatement.getClass());
			ResultSet result = preparedStatement.executeQuery();
			
			
			while (result.next()) {
				System.out.println(result.getString("LastName"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("bad request");
		}
	}

	public void closeConnect() {
		try {
			this.connection.close();
		} catch (SQLException e) {
			System.out.println("Problems in close connection");
		}

	}

}
