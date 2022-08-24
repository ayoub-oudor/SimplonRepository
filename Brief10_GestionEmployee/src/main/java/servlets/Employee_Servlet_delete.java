package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import entity.Employee;

/**
 * Servlet implementation class Employee_Servlet_delete
 */
@WebServlet("/Employee_Servlet_delete")
public class Employee_Servlet_delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Employee employee = new Employee();
    EmployeeDao Empdao = new EmployeeDao();

    public Employee_Servlet_delete() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("DServed at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		try {
			Delete(request, response);
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}
	

	private void Delete(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Empdao.deleteUser(id);
		response.sendRedirect("employeeList.jsp");
		
	}
}
