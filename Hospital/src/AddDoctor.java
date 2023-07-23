

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddDoctor() {
        super();
       
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{
			PrintWriter out=response.getWriter();
			int id1=0;
		String id ="0";
		String uname = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String s = request.getParameter("symptoms1");
		
		
			Connection con=Conc.getConnect();
			
			
			PreparedStatement ps = con.prepareStatement("insert into doctor values(?,?,?,?,?)");
			 ps.setInt(1, id1);
			 ps.setString(2, email);

			 ps.setString(3, uname);
			 ps.setString(4, password);
			 ps.setString(5, s);
			 int n=ps.executeUpdate();
			//ResultSet rs=ps.executeQuery();
			if (n>=1)
			{
				out.println("<script type=\"text/javascript\">");
			    out.println("alert('Done');");
			    out.println("location='AddDoctor.jsp';");
			    out.println("</script>");
			   
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
