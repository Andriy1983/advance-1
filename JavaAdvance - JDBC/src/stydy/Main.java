package stydy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws SQLException {
		
		
		String url = "jdbc:mysql://localhost/new_schema";
		String user = "root";
		String password = "123456";
		
		Connection connection = DriverManager.getConnection(url, user, password);
		
//		connection.prepareStatement("create table if not exists abc (id int, name varchar(50))").executeUpdate();
		
//		connection.prepareStatement("insert into abc (id,name) values (1,'a'),(2,'b'),(3,'c')").executeUpdate();
		
		ResultSet resultSet = connection.prepareStatement("select * from abc").executeQuery();
		int x = resultSet.getMetaData().getColumnCount();
		System.out.println(x +"!");
		
		while (resultSet.next()) {
			for (int i = 1; i <= x; i++) {
				
				System.out.println(resultSet.getString(i));
			}
			
		}
		
		connection.close();
	}
}
