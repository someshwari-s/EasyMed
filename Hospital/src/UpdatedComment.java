

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import get.Geta;
import get.arogyaname;


/**
 * Servlet implementation class UpdateComment
 */
public class UpdatedComment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatedComment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cid =Geta.getId();
		System.out.println("ddd"+cid);
		String sid =arogyaname.getId();
		PrintWriter out=response.getWriter();

		String comment=request.getParameter("comment");
		System.out.println(comment);
		try {
			Connection con=Conc.getConnect();
			/*PreparedStatement pstmt= con.prepareStatement("update patient set Acomment=? where id='"+cid+"'");
			
				pstmt.setString(1, sid+":"+comment);
				System.out.println("comment");

			int n=pstmt.executeUpdate();*/
			
			 PreparedStatement ps = con.prepareStatement("insert into comment values(?,?,?,?)");
			 ps.setInt(1, 0);
			 ps.setInt(2, cid);
			 ps.setString(3,sid+"::"+comment);
			 ps.setString(4,"");
			 
			 
			 int n=ps.executeUpdate();
			
			
				 if(n>0)
					 
				 {
					 out.println("<script type=\"text/javascript\">");
					    out.println("alert('Update comment');");
					    out.println("location='ArogyaComment.jsp';");
					    out.println("</script>"); }
				 else{

					 out.println("bye");

					 
				 }
				} catch (SQLException e) {
					
						e.printStackTrace();
					}
			
	}
	}


