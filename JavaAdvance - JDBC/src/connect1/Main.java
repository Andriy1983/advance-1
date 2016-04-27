package connect1;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import com.mysql.jdbc.Connection;

public class Main {
	private static String url = "jdbc:mysql://localhost/bank";
	private static String user = "root";
	private static String password = "123456";

	public static void main(String[] args) throws SQLException {
		Connection connection = (Connection) DriverManager.getConnection(url, user, password);
//		PreparedStatement preparedStatement = connection.prepareStatement(
//				"create table if not exists person (`id` int not null auto_increment, `name` varchar(80), primary key(id))");
//		preparedStatement.execute();
//		ResultSet resultSet = preparedStatement.executeQuery("select * from client");
		
//		ResultSet resultSet = connection.prepareStatement("").executeQuery("select * from client"); //2

		
		
//		while(resultSet.next()){
//			System.out.print(resultSet.getString("LastName") + " ");
//			System.out.println(resultSet.getInt("Age"));
//		}
		
//		preparedStatement = (PreparedStatement) connection.prepareStatement("INSERT INTO person(id,name) values(?,?)");
//		Person p  = new Person("Serj" ,28);
//		preparedStatement.setInt(1, 1);// id 
//		preparedStatement.setString(2, p.getName());
//		preparedStatement.execute();
		
	
		PreparedStatement statementNew =connection.prepareStatement("select * from ? where education = ?");
		statementNew.setString(1, "high");
		
		
		ResultSet set=statementNew.executeQuery();
		
		while (set.next()){
			System.out.print(set.getString(1) + " ");
			System.out.print(set.getString(2)+ " ");
			System.out.print(set.getString(3)+ " ");
			System.out.print(set.getString(4)+ " ");
			System.out.println();
		}
		
		
		connection.close();
		

	}

}
