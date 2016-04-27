package con5;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_Connection {

	Connection connection;
	PreparedStatement preparedStatement;
	CallableStatement callableStatement;

	String url;
	String user;
	String password;

	public void openConnection(String url, String user, String password) {
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void doSelect(String select) {

		try {

			preparedStatement = connection.prepareStatement(select);

			ResultSet resultSet = preparedStatement.executeQuery();
			showResultSet(resultSet);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void doUpdate(String action) {
		try {
			preparedStatement = connection.prepareStatement(action);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void callStoredProcedure(String procedure) {

		try {
			ResultSet resultSet = connection.prepareCall(procedure).executeQuery();
			showResultSet(resultSet);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void callStoredProcedureUpdate(String procedure) {

	
			 try {
				connection.prepareCall(procedure).executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	
	}

	public void showResultSet(ResultSet set) {

		try {
			while (set.next()) {
				for (int i = 1; i <= set.getMetaData().getColumnCount(); i++) {
					System.out.print(set.getString(i) + " ");

				}
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
