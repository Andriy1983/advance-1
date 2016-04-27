package connect4;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/logos2", "root", "123456");
		ResultSet res = connection.prepareStatement("select * from teachers").executeQuery();
		while (res.next()) {
			// System.out.println(res.getInt(1));
			System.out.println(res.getString(1));
			System.out.println(res.getString(2));
			System.out.println(res.getString(3));
			System.out.println(res.getString(4));

		}
		System.out.println("******************");

		PreparedStatement preparedStatement = connection.prepareStatement("select *from teachers where t_id = ?");
		preparedStatement.setInt(1, 5);
		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			System.out.println(resultSet.getString(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
			System.out.println(resultSet.getString(4));
		}
		/* удаление */
		// PreparedStatement preparedStatement2 =
		// connection.prepareStatement("DELETE from teachers where t_id = ?");
		// preparedStatement2.setInt(1, 7);
		// preparedStatement2.executeUpdate();
		//
		//
		// ResultSet resultSet2 = preparedStatement2.executeQuery("select * from
		// teachers");
		// while(resultSet2.next()){
		// System.out.println(resultSet2.getString(1));
		// System.out.println(resultSet2.getString(2));
		// System.out.println(resultSet2.getString(3));
		// System.out.println(resultSet2.getString(4));
		// }
		System.out.println("-----------------------------");
		CallableStatement callableStatement = connection.prepareCall("call selecting_all(12000)");
		ResultSet set = callableStatement.executeQuery();
		while(set.next()){
			System.out.println(set.getString(1));
			System.out.println(set.getString(2));
			System.out.println(set.getString(3));
			System.out.println(set.getString(4));
		}

		connection.close();
	}

}
