package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresource.ClassLoaderTemplateResource;

import dao.AdminDao;
import entity.Admin;


public class Admin_Servlet_login extends HttpServlet {
	AdminDao adminDao = new AdminDao();
	private static final long serialVersionUID = 1L;
	
    public Admin_Servlet_login() {
        super();
    } 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        // From Java 10, you can use var instead of declaring the type explicitly
//        var resolver = new ClassLoaderTemplateResource();
//        resolver.setTemplateMode(TemplateMode.HTML);
//        resolver.setCharacterEncoding("UTF-8");
//        resolver.setPrefix("/templates/");
//        resolver.setSuffix(".html");
//
//        var context = new Context();
//        context.setVariable("name", "Najib");
//        context.setVariable("date", LocalDateTime.now().toString());
//
//        var templateEngine = new TemplateEngine();
//        templateEngine.setTemplateResolver(resolver);
//
//        var result = templateEngine.process("index", context);
//        out.println(result);
		//this.getServletContext().getRequestDispatcher("/WEB-INF/Signin_Admin.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//login(request, response);
		doGet(request, response);
		//response.sendRedirect("employeeList.html");
		
	}

	protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("psw");
		boolean result = adminDao.getUser(username, password);
		PrintWriter out = response.getWriter();

		try {
			
			if(result == true) {
				response.sendRedirect("employeeList.html");
//		        RequestDispatcher rd = request.getRequestDispatcher("employeeList.jsp");  
//		        rd.forward(request,response);  
			}
			else {
			       out.println("<script type=\"text/javascript\">");
			       out.println("alert('Username or password incorrect');");
			       out.println("location='Signin_Admin.jsp';");
			       out.println("</script>");
//			        out.print("Sorry username or password error");  
//			        RequestDispatcher rd=request.getRequestDispatcher("Signin_Admin.jsp");  
//			        rd.include(request,response);  
			}
		}
		catch(Exception e){
			e.printStackTrace(); 
		}
		
	}
}
