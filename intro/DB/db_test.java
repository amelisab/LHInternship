package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_test {
	
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	private static final String DB_URL = "jdbc:mysql://localhost:3306/employees";

	static Connection conn = null; 
	
	static final String USER = "root";
	static final String PASS = "root";
	 
	public static Connection getConnection() {
		   
		   try {

			      Class.forName(JDBC_DRIVER);
	
			      conn = DriverManager.getConnection(DB_URL, USER, PASS);
			      
			      System.out.println("done");
				       
			    
			} catch (SQLException e){
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		   
		   return conn;
		   
	   }
	   
	     
	    protected static void disconnect() throws SQLException {
	        if (conn != null && !conn.isClosed()) {
	            conn.close();
	        }
	    }
	   
	    public static void main(String [] args) {
	    	getConnection();
	    	try {
	    		disconnect();
	    	} catch (SQLException e) {
	    		e.printStackTrace();
	    	}
	    	
	    }

}
