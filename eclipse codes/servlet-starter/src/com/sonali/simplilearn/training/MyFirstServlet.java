package com.sonali.simplilearn.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Our First Servlet", urlPatterns = { "/first" }, initParams = {
		@WebInitParam(name = "jdbcDriver", value = "com.mysql.cj.jdbc.Driver") })
public class MyFirstServlet extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() called..");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		// Fetch a value from the request
		String userName = request.getParameter("userName");
		String userAddress = request.getParameter("userAddress");
		
		if(userName.trim().equals("admin")) {
//			Get a reference to the RequestDispatcher
			RequestDispatcher theDispatcher = request.getRequestDispatcher("other");
//			response.getWriter().println("Welcome Admin to your home page...");

//			Forward the request
			
//			theDispatcher.forward(request, response);
			theDispatcher.include(request, response);
//			response.getWriter().println("Welcome Admin to your home page...");
           }
		else {
//			Redirect back to the home page
//			response.sendRedirect("index.html");
			RequestDispatcher theDispatcher = request.getRequestDispatcher("index.html");
			
			response.getWriter().println("Invalid username, please login with the right credentials...");
			
//			theDispatcher.forward(request, response); //49 msg will not come thats why use include
			theDispatcher.include(request, response);
			
			
//			response.getWriter().println("Invalid username...");
		}
		
			
//		response.getWriter().println("Welcome : " + userName + ", your address is : " + userAddress);
	}
//	
//	 // Automatically called for get type of requests
//	  
//	 @Override protected void doGet(HttpServletRequest req, HttpServletResponse
//	  resp) throws ServletException, IOException {
//	  
//	  System.out.println("doGet() called...");// Display on the console // set the
//	  content type resp.setContentType("text/html");
//	 
//	 * // Get a reference to the print writer PrintWriter out = resp.getWriter();
//	  
//	 * // Write something back to the client
//	  out.println("<h2>Welcome client, we are processing your request now...</h2>"
//	  ); }
//	 
//	 * // This method is automatically called for post type of requests
//	  
//	  @Override protected void doPost(HttpServletRequest req, HttpServletResponse
//	  resp) throws ServletException, IOException { doGet(req, resp); } }
//	  
//	  @Override public void service(ServletRequest req, ServletResponse resp)
//	  throws ServletException, IOException {
//	  
//	 *// Get a reference to the servletConfig object ServletConfig config =
//	  getServletConfig();
//	  
//	  // Get params out of config for this servlet String dbDriver =
//	  config.getInitParameter("jdbcDriver"); System.out.println("Driver : " +
//	 dbDriver);
//	 
//	  try { Class.forName(dbDriver); } catch (ClassNotFoundException e) {
//	  System.out.println("Can't load the Driver : " +e.getMessage()); }
//	 
//	

//	 System.out.println("Inside service() now..");
//	 
//	 * // Set the content type resp.setContentType("text/html");
//	  
//	 *// Get a reference to the PrintWriter Object PrintWriter out=
//	 resp.getWriter();
//	 
//	 out.println("service() handles both types of request");
//	 
//	 out.println("Servlet Name : " + config.getServletName());
//	 out.println("Servlet Name : " + config.getServletContext()); }
//	 

	@Override
	public void destroy() {

		System.out.println("Inside destroyed()...");
	}
}
