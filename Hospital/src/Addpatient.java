

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import get.arogyaname;

public class Addpatient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static String s1;
   
    public Addpatient() {
        super();
       
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id =0;
		String uname = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String s = request.getParameter("Bp");
		String d = request.getParameter("diabetes");
		int temp = Integer.parseInt(request.getParameter("temp"));
		int w = Integer.parseInt(request.getParameter("weight"));

		s1 = request.getParameter("symptoms1");
		String s2 = request.getParameter("symptoms2");
		String s3 = request.getParameter("symptoms3");
		String adhar=request.getParameter("adhar");
		String c1 = null;
		String c2 = null;
		System.out.println("hello 5678\n");
		try 
		{
			Connection con=Conc.getConnect();
			PrintWriter out=response.getWriter();
			
			
			String Query="SELECT col1 FROM `ohas_dataset` Where symptoms in ('"+s1+"','"+s2+"','"+s3+"') group by col1 having count(symptoms)=(select max(sym_count) from(select col1,count(symptoms)as sym_count from ohas_dataset where symptoms in ('"+s1+"','"+s2+"','"+s3+"') group by col1 )t)";
			/*System.out.println("hello 1234\n"+Query);
			Statement st1 = con.createStatement();
			ResultSet rs1=st1.executeQuery(Query);		
			while(rs1.next())
			{			
				System.out.println("hello 1234\n"+Query);
			}*/
			
			
			PreparedStatement ps1;
			ps1 = con.prepareStatement(Query);
			ResultSet rs=ps1.executeQuery();
			ArrayList al=new ArrayList();
			if(rs.next())
			{			
				al.add(rs.getString(1));
			}
			System.out.println("Detected Dieseases : "+al);
			PreparedStatement ps2 = con.prepareStatement("SELECT * FROM doctor WHERE specialist=? ORDER BY RAND() LIMIT 1");
			ps2.setString(1, al.get(0).toString());
			ResultSet rs2 = ps2.executeQuery();
			String demail=null;
			if(rs2.next())
			{
				System.out.println(adhar);
				demail = rs2.getString("mail");
				 PreparedStatement ps = con.prepareStatement("insert into patient(id,name,age,bp,diabetes,temprature,weight,specialist,did,predisease,aid,adhar) values(?,?,?,?,?,?,?,?,?,?,?,?)");
				 ps.setInt(1, id);
				 ps.setString(2, uname);
				 ps.setInt(3, age);
				 ps.setString(4, s);
				 ps.setString(5, d);
				 ps.setInt(6, temp);
				 ps.setInt(7, w);
				 ps.setString(8, al.get(0).toString());
				 ps.setString(9, demail);
				 ps.setString(10, al.toString());
				 ps.setString(11, arogyaname.getAemail());
				 ps.setString(12, adhar);
				 
				 int n=ps.executeUpdate();
				 out.println("<script type=\"text/javascript\">");
				    out.println("alert('Patient Added Successfully');");
				    out.println("location='ArogyaMenu.jsp';");
				    out.println("</script>");
			}
			else
			{
				 out.println("<script type=\"text/javascript\">");
				    out.println("alert('Docter not available for detected disease');");
				    out.println("location='ArogyaMenu.jsp';");
				    out.println("</script>");
				   
			}
			
			
				
				}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
