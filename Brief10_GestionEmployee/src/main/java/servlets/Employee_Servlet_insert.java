package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import entity.Employee;

@WebServlet("/")
public class Employee_Servlet_insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Employee employee = new Employee();
    EmployeeDao Empdao = new EmployeeDao();
    public Employee_Servlet_insert() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		insertEmployee(request, response);
	}
	
	protected void insertEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String birthday = request.getParameter("birthday");
		String hiringdate = request.getParameter("hiring_date");
		double salary = Integer.parseInt(request.getParameter("salary"));

		employee.setUsername(username);
		employee.setPassword(password);
		employee.setBirthday(birthday);
		employee.setHiring_date(hiringdate);
		employee.setSalary(salary);

		try {
			Empdao.saveUser(employee);
			response.sendRedirect("employeeList.jsp");
		}
		catch(Exception e){
			e.printStackTrace(); 
		}
		
	}
}
