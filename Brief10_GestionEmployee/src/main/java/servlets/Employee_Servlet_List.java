package servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.EmployeeDao;
import entity.Employee;



@WebServlet("/Employee_Servlet_List")
public class Employee_Servlet_List extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeDao empDao = new EmployeeDao();
    public Employee_Servlet_List() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("LServed at: ").append(request.getContextPath());
		listEmployee(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void listEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		List <Employee> listEmployee = empDao.getAllUser();
		request.setAttribute("listEmployee",listEmployee);
		response.sendRedirect("employeeList.jsp");
	}
}
