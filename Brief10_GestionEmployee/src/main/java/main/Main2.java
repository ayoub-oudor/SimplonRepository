package main;

import dao.AdminDao;
import entity.Admin;

public class Main2 {

	public static void main(String[] args) {
		   AdminDao dao = new AdminDao();
		   Admin admin = new Admin("ayoub","1234");
           dao.saveUser(admin);
	} 
	
}
