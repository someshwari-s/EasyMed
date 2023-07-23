

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddArogya extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddArogya() {
        super();
       
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{
			PrintWriter out=response.getWriter();

		int id=0; ;
		String mail =request.getParameter("email");

		String uname = request.getParameter("name");
		String password = request.getParameter("password");
		String s = request.getParameter("specialist");
		
		
			Connection con=Conc.getConnect();
			
			
			PreparedStatement ps = con.prepareStatement("insert into arogya values(?,?,?,?)");
			 ps.setInt(1, id);
			 ps.setString(2, mail);
			 ps.setString(3, uname);
			 ps.setString(4, password);
		
			 int n=ps.executeUpdate();
			//ResultSet rs=ps.executeQuery();
			if (n>=1)
			{
				out.println("<script type=\"text/javascript\">");
			    out.println("alert('Inserted successsfully');");
			    out.println("location='AddArogya.html';");
			    out.println("</script>");	
			}
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
