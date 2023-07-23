package Abc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import get.Get;

/**
 * Servlet implementation class Addpre
 */
@WebServlet("/UploadP")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
maxFileSize = 1024 * 1024 * 10, // 10MB
maxRequestSize = 1024 * 1024 * 50) // 50MB

public class Addpre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addpre() {
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
		// TODO Auto-generated method stub
		try
		 {
			 Class.forName("com.mysql.jdbc.Driver");
			Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","");
				
			int id=Get.getId();
			System.out.println("Hello"+id);
				
					
										  for (Part part : request.getParts()) {
			                String fileName = extractFileName(part);

			                if (fileName != null && fileName.length() > 0) {
			                    // File data
			                    InputStream is = part.getInputStream();
			                    // Write to file
			                    this.writeToDB(con,id,is,fileName);
			                }
			            }
			            con.commit();
			            response.sendRedirect(request.getContextPath() + "/userdashboard.jsp");
	        } catch (Exception e) {
	            e.printStackTrace();
	            request.setAttribute("errorMessage", "Error: " + e.getMessage());
	          response.sendRedirect("DoctorLogin.html");
	        } 
	    }
	 
	    private String extractFileName(Part part) {
	        // form-data; name="file"; filename="C:\Note\file2.zip"
	        String contentDisp = part.getHeader("content-disposition");
	        String[] items = contentDisp.split(";");
	        for (String s : items) {
	            if (s.trim().startsWith("filename")) {
	                
	                String clientFileName = s.substring(s.indexOf("=") + 2, s.length() - 1);
	                clientFileName = clientFileName.replace("\\", "/");
	                int i = clientFileName.lastIndexOf('/');
	                
	                return clientFileName.substring(i + 1);
	            }
	        }
	        return null;
	    }
			   /* private Long getMaxAttachmentId(Connection conn) throws SQLException {
			        String sql = "Select max(a.id) from new a";
			        PreparedStatement pstm = conn.prepareStatement(sql);
			        ResultSet rs = pstm.executeQuery();
			        if (rs.next()) {
			            long max = rs.getLong(1);
			            return max;
			        }
			        return 0L;
			    }
			    
			    */
	    
			 
	
					 
					 
private void writeToDB(Connection con,int id,InputStream is,String fileName) throws SQLException 


					 {
	
	 String sql="UPDATE patient SET pre=?,prename=? WHERE id=?";
					 
	 PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(3,id);
		pstmt.setBlob(1,is);
		pstmt.setString(2,fileName);
		int r=pstmt.executeUpdate();
		
		}
}
