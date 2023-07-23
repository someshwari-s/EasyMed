

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import get.*;

public class DoctorLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DoctorLogin() {
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
			ps = con.prepareStatement("select * from doctor where mail=? and password=?");
			ps.setString(1, a);
			 ps.setString(2, s);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{	
				String dname=rs.getString(3);
			
				doctorname.setId(dname);
				String did=rs.getString("mail");
				System.out.println("THanq");
					
				request.setAttribute("myname",did);
				request.getRequestDispatcher("ViewPatient.jsp").forward(request, response);
				//response.sendRedirect("ViewPatient.jsp");
			}
			else
			{
					out.println("<script type=\"text/javascript\">");
				    out.println("alert('User or password incorrect');");
				    out.println("location='DoctorLogin.html';");
				    out.println("</script>");

			}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
