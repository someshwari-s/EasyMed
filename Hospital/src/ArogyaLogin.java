

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import get.arogyaname;


public class ArogyaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ArogyaLogin() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String a=request.getParameter("aid");
		String s=request.getParameter("password");
		try 
		{
			Connection con=Conc.getConnect();
			PrintWriter out=response.getWriter();
			PreparedStatement ps;
			ps = con.prepareStatement("select * from arogya where mail=? and password=?");
			ps.setString(1, a);
			 ps.setString(2, s);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{			 String id=rs.getString(3);
						arogyaname.setId(id);
						arogyaname.setAemail(a);

				out.println("<script type=\"text/javascript\">");
			    out.println("alert('Login Successfull');");
			    out.println("location='ArogyaLogin.html';");
			    out.println("</script>");
				response.sendRedirect("ArogyaMenu.jsp");
				
			}
			else
			{
				out.println("<script type=\"text/javascript\">");
			    out.println("alert('User or password incorrect');");
			    out.println("location='ArogyaLogin.html';");
			    out.println("</script>");
			}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
