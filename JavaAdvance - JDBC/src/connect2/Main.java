package connect2;

public class Main {
	public static void main(String[] args) {
		
		
		Connect connect = new Connect();
		connect.openConnect("jdbc:mysql://localhost/bank", "root", "123456");
		
		connect.makeRequest("select * from client");
		connect.closeConnect();
		
	}

}
