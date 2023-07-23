<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page  import="java.sql.*" %>
    <%@page import="get.Get"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title></title>

    <link href="https://fonts.googleapis.com/css?family=Muli:400,600,700&display=swap" rel="stylesheet">

    <!-- Template CSS -->
    <link rel="stylesheet" href="assets/css/style-starter.css">
  </head>
  <!--Start of Tawk.to Script-->
<script type="text/javascript">
var Tawk_API=Tawk_API||{}, Tawk_LoadStart=new Date();
(function(){
var s1=document.createElement("script"),s0=document.getElementsByTagName("script")[0];
s1.async=true;
s1.src='https://embed.tawk.to/6059b3c6067c2605c0bb4ca3/1f1f6cgb4';
s1.charset='UTF-8';
s1.setAttribute('crossorigin','*');
s0.parentNode.insertBefore(s1,s0);
})();
</script>
<!--End of Tawk.to Script-->
  <body>
<section class="w3l-bootstrap-header">
  <nav class="navbar navbar-expand-md navbar-light py-3">
    <div class="container">
      <a class="navbar-brand" href="index.html"><img src="assets/images/award.png" class="img-fluid" width="52px">
        GraminArogya</a>
      <!-- if logo is image enable this   
    <a class="navbar-brand" href="#index.html">
        <img src="image-path" alt="Your logo" title="Your logo" style="height:35px;" />
    </a> -->
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        Menu
      </button>

      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav ml-auto">
          
         
         <li class="nav-item">
            <a class="nav-link" href="DoctorLogin.html">LogOut</a>
          </li>
        </ul>
      </div>
      <a href="#domain" class="domain ml-3" data-toggle="modal" data-target="#DomainModal">
        
      </a>
    </div>
  </nav>
</section>

<!-- Domain Modal -->
<div class="modal right fade" id="DomainModal" tabindex="-1" role="dialog" aria-labelledby="DomainModalLabel2">
  <div class="modal-dialog" role="document">
    <div class="modal-content">

      <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
          aria-hidden="true">&times;</span></button>

      <div class="modal-body">
        <div class="modal__content">
          <h2 class="logo"><img src="assets/images/award.png" class="img-fluid"> Medpill</h2>
          <!-- if logo is image enable this   
          <h2 class="logo">
            <img src="image-path" alt="Your logo" title="Your logo" style="height:35px;" />
          </h2> -->
          <p class="mt-md-3 mt-2">Lorem ipsum dolor sit amet, elit. Eos expedita ipsam at fugiat ab.</p>
          <div class="widget-menu-items mt-sm-5 mt-4">
            <h5 class="widget-title">Menu Items</h5>
            <nav class="navbar p-0">
              <ul class="navbar-nav">
                <li class="nav-item active">
                  <a class="nav-link" href="index.html">Home</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="about.html">About</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="services.html">Services</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="contact.html">Contact</a>
                </li>
              </ul>
            </nav>
          </div>
          <div class="widget-social-icons mt-sm-5 mt-4">
            <h5 class="widget-title">Contact Us</h5>
            <ul class="icon-rounded address">
              <li>
                <p> #135 block, Barnard St. Brooklyn, <br>NY 10036, USA</p>
              </li>
              <li class="mt-3">
                <p><span class="fa fa-phone"></span> <a href="tel:+404-11-22-89">+1-2345-345-678-11</a></p>
              </li>
              <li class="mt-2">
                <p><span class="fa fa-envelope"></span> <a
                    href="mailto:medpillhospital@mail.com">medpillhospital@mail.com</a></p>
              </li>
              <li class="top_li1 mt-2">
                <p><span class="fa fa-clock-o"></span> <a href="mailto:medpillhospital@mail.com">Mon - Sun 09:00 - 21:00
                  </a></p>
              </li>
            </ul>
          </div>
          <div class="widget-social-icons mt-sm-5 mt-4">
            <h5 class="widget-title">Follow Us</h5>
            <ul class="icon-rounded">
              <li><a class="social-link twitter" href="#url" target="_blank"><i class="fa fa-twitter"></i></a></li>
              <li><a class="social-link linkedin" href="#url" target="_blank"><i class="fa fa-linkedin"></i></a></li>
              <li><a class="social-link tumblr" href="#url" target="_blank"><i class="fa fa-tumblr"></i></a></li>
            </ul>
          </div>


        </div>
      </div>
    </div>
    <!-- //modal-content -->
  </div>
  <!-- //modal-dialog -->
</div>
<!-- //Domain modal -->


<section class="ftco-section">
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-md-6 text-center mb-5">
					<h2 class="heading-section"></h2>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="table-wrap">
						<table class="table table-striped">
							<thead>
         <tr>
         										<td><h3><b>PID</b></h3></td>
                                                 <td><h3><b>NAME</b></h3></td>
                                                   <td><h3><b>Age</b></h3></td>
                                                    <td><h3><b>BP</b></h3></td>
                                                    <td><h3><b>Diabetes</b></h3></td>
                                                    <td><h3><b>Temp</b></h3></td>
                                                    <td><h3><b>Weight</b></h3></td>
                                                 <td><h3><b>Disease</b></h3></td>
                                                 
                                                   
                                                    
                                                    
                                                   

         </tr>
         
                                          <%
                                          String abc=null;
                                          String abcd=null;

                                          try{
                                       
                                         Connection con=null;
                                          Class.forName("com.mysql.jdbc.Driver");
      									System.out.println("Class execute");
      									con=DriverManager.getConnection("jdbc:mySql://localhost:3306/hospital","root","");
      									Statement stmt=con.createStatement();
      									int id=Integer.parseInt(request.getParameter("id"));
      									Get.setId(id);
      									//request.getRequestDispatcher("UpdateComment").forward(request, response);
      									System.out.println(id);

      									ResultSet rs=stmt.executeQuery("select * from patient where id='"+id+"'");
      									
                                          while(rs.next()){
                                        	  abcd=rs.getString(10);
                                        	  
                                        	 
                                        	  %>
                                          <tbody>
                                                    <tr>
		                                                       <td><%out.print(rs.getInt(1)); %></td>
							                                   <td><%out.print(rs.getString(2)); %></td>
							                                   <td><%out.print(rs.getInt(3)); %></td>
							                                   <td><%out.print(rs.getString(4)); %></td>
							                                   <td><%out.print(rs.getString(5)); %></td>
							                                   <td><%out.print(rs.getInt(6)); %></td>
							                                   	<td><%out.print(rs.getInt(7)); %></td>
							                                   <td><%out.print(rs.getString(8)); %></td>
                                   							  
                                   
                                   
                                                    </tr>
                                          </tbody>
                                                   <% System.out.println("ok");    
                                                   }
                                                   //connection.close();
                                                   } catch (Exception e) {
                                                   e.printStackTrace();
                                                   }
                                                   %>
         
</thead>

	
	</table>
	
	<div class="table-wrap">
						<table class="table table-striped">
							<thead>
         <tr>
         										<td><h3><b>Patient Id</b></h3></td>
                                                 <td><h3><b>Aarogya Comment</b></h3></td>
                                                   <td><h3><b>Doctor Comment</b></h3></td>
                                                    
                  
         </tr>
         
                                          <%
                                          String s1=null;
                                          String s2=null;

                                          try{
                                       
                                         Connection con=null;
                                          Class.forName("com.mysql.jdbc.Driver");
      									System.out.println("Class execute");
      									con=DriverManager.getConnection("jdbc:mySql://localhost:3306/hospital","root","");
      									Statement stmt=con.createStatement();
      									int id=Integer.parseInt(request.getParameter("id"));
      									Get.setId(id);
      									//request.getRequestDispatcher("UpdateComment").forward(request, response);
      									System.out.println(id);

      									ResultSet rs=stmt.executeQuery("select * from comment where pid='"+id+"'");
      									
                                          while(rs.next()){
                                        	  s2=rs.getString(10);
                                        	  
                                        	 
                                        	  %>
                                          <tbody>
                                                   <tr>
		                                                       <td><%out.print(rs.getInt(1)); %></td>
							                                   <td><%out.print(rs.getString(3)); %></td>
							                                   <td><%out.print(rs.getString(4)); %></td>
							                                  
                                   							  
                                   
                                   
                                                    </tr>
                                          </tbody>
                                                   <% System.out.println("ok");    
                                                   }
                                                   //connection.close();
                                                   } catch (Exception e) {
                                                   e.printStackTrace();
                                                   }
                                                   %>
         
</thead>

	
	</table>
	
	
	
	
	
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="w3l-apply-6" id="appointment">
	<!-- /apply-6-->
	<div class="apply-info py-5">
		<div class="container py-lg-5 py-sm-3">
			<div class="apply-grids-info row">
				<div class="apply-gd-left col-lg-5">
					
					
					<div class="mt-lg-5 mt-4">
						<div class="sub-apply mt-5">
							<div class="apply-sec-info">
								<%-- <div class="appyl-sub-icon-info">
									<h5><a href="#">Arogya Comment</a></h5>
									<p><%=abc %></p>
								</div> --%>
								
							</div>
						</div>
						<div class="sub-apply mt-5">
							<div class="apply-sec-info">
															
								<%-- <div class="appyl-sub-icon-info">
									<h5><a href="DoctorComment.jsp">Doctor Comment</a></h5>
									<p><%=abcd %></p>
								</div> --%>
							</div>
							
						</div>
					</div>
				</div>
				<div class="apply-gd-right offset-lg-1 col-lg-6 mt-lg-0 mt-5">
					<div class="apply-form p-sm-5 p-4">
						<h5>Upload Prescription</h5>
						
						<form  method="post" action="${pageContext.request.contextPath}/UploadP" 
						enctype="multipart/form-data">
							
							<div class="form-group">
							 <label>Attach Prescription</label>
								<input type="file" class="form-control" id="email1" name="file" required>
							</div>
							<button type="submit" class="btn btn-primary submit">Submit Now</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</section>
	

	<script src="js/jquery.min.js"></script>
  <script src="js/popper.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/main.js"></script>				
				
				
				</div>

    <script>
      // When the user scrolls down 20px from the top of the document, show the button
      window.onscroll = function () {
        scrollFunction()
      };

      function scrollFunction() {
        if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
          document.getElementById("movetop").style.display = "block";
        } else {
          document.getElementById("movetop").style.display = "none";
        }
      }

      // When the user clicks on the button, scroll to the top of the document
      function topFunction() {
        document.body.scrollTop = 0;
        document.documentElement.scrollTop = 0;
      }
    </script>
    <!-- /move top -->

    <script src="assets/js/jquery-3.3.1.min.js"></script>
    
    <script src="assets/js/green-audio-player.js"></script>

    <script>
        document.addEventListener('DOMContentLoaded', function() {
            new GreenAudioPlayer('.ready-player-1', { stopOthersOnPlay: true });
        });
    </script>

    <!-- video popup -->
    <script>
      $('#notify').change(function () {
        if ($('#notify').is("Active")) {
          $('body').css('overflow', 'hidden');
        } else {
          $('body').css('overflow', 'auto');
        }
      });
    </script>
    <!-- //video popup -->

    <script src="assets/js/owl.carousel.js"></script>
    <!-- script for banner slider-->
    <script>
      $(document).ready(function () {
        $('.owl-one').owlCarousel({
          loop: true,
          margin: 0,
          nav: false,
          responsiveClass: true,
          autoplay: false,
          autoplayTimeout: 5000,
          autoplaySpeed: 1000,
          autoplayHoverPause: false,
          responsive: {
            0: {
              items: 1,
              nav: false
            },
            480: {
              items: 1,
              nav: false
            },
            667: {
              items: 1,
              nav: true
          },
            1000: {
              items: 1,
              nav: true
            }
          }
        })
      })
    </script>
    <!-- //script -->
    
  <!-- disable body scroll which navbar is in active -->
  <script>
    $(function () {
      $('.navbar-toggler').click(function () {
        $('body').toggleClass('noscroll');
      })
    });
  </script>
  <!-- disable body scroll which navbar is in active -->

    <script src="assets/js/bootstrap.min.js"></script>

    </body>

    </html>