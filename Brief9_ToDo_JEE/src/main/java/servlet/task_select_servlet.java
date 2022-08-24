package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Tache;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import dao.implement_dao_task;


public class task_select_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	implement_dao_task imp = new implement_dao_task();
	Tache tache = new Tache();

    public task_select_servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		listTask(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		
		
		
	}
	
	protected void listTask(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Set<Tache> listTask = imp.select();
		request.setAttribute("listTask",listTask);
		response.sendRedirect("task_List.jsp");
		
	}



}
