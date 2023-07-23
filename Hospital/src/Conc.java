import java.sql.Connection;
import java.sql.DriverManager;



public class Conc 
{
	static Connection con=null;
	public static Connection getConnect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			Connection con=Conc.getConnect();
			
			
		}
		
		return con;
	}
	

}
