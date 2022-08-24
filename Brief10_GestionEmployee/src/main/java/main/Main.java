package main;

import dao.AdminDao;
import dao.EmployeeDao;
import entity.Admin;
import entity.Employee;

public class Main { 
	public static void main(String[] args) {
         EmployeeDao dao = new EmployeeDao();
         Employee employee = new Employee(1,"Ayoub", "pass", "12-08-2022", "12-08-2022",20000);
         //dao.saveUser(employee); 
         //dao.updateUser(employee);
         //dao.getUser(1);
         dao.getUser("Ayoub","pass");
         //dao.getAllUser();
         
	}  
} 
 //grace nahomi ndri

