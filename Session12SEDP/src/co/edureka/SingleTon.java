package co.edureka;

class Connection{
	
	static Connection con = new Connection();
	
	private Connection() {
		System.out.println("Connection Object Constructed");
	}
	
	public static Connection getConnection(){
		return con;
	}
}

public class SingleTon {

	public static void main(String[] args) {
		
		/*Connection con1 = new Connection();
		Connection con2 = new Connection();
		
		System.out.println("con1 is: "+con1);
		System.out.println("con2 is: "+con2);*/

		Connection con1 = Connection.getConnection();
		Connection con2= Connection.getConnection();
		System.out.println("con1 is: "+con1);
		System.out.println("con2 is: "+con2);
		
	}

}
