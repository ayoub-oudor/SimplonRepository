<<<<<<< HEAD
package package1;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
	
	private static String url = "jdbc:postgresql://localhost:5432/gestion_produits";
	private static String user = "postgres";
	private static String password = "18014733"; 
	private static Connection  connect;
	 
	public static Connection getConnect() { 

	try 
	    {
	      Class.forName("org.postgresql.Driver"); 
	      connect = DriverManager.getConnection(url,user,password);
	      System.out.println("connected to postgresql service ");
	     	return connect; 
	    }  
	    catch(Exception e){  
	      System.out.println(e); 
	    }
	return null;
	
  }
	
=======
package package1;
import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
	
	private static String url = "jdbc:postgresql://localhost:5432/gestion_produits";
	private static String user = "postgres";
	private static String password = "18014733"; 
	private static Connection  connect;
	 
	public static Connection getConnect() { 

	try 
	    {
	      Class.forName("org.postgresql.Driver"); 
	      connect = DriverManager.getConnection(url,user,password);
	      System.out.println("connected to postgresql service ");
	     	return connect; 
	    }  
	    catch(Exception e){  
	      System.out.println(e); 
	    }
	return null;
	
  }
	
>>>>>>> fbf558e1d5a02f2cb34c27c924b1e54a4f44962a
}