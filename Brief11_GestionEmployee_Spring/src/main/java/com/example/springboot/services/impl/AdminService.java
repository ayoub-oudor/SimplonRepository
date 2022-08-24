<<<<<<< HEAD
package com.example.springboot.services.impl;

import com.example.springboot.model.Admin;
import com.example.springboot.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

	@Service
	public class AdminService {

	    @Autowired
	    private AdminRepository adminRepo;

	    public Admin login(String username, String password) {
	        Admin admin = adminRepo.findByUsernameAndPassword(username, password);
	        return admin ;  
	    }

	} 
	
=======
package com.example.springboot.services.impl;

import com.example.springboot.model.Admin;
import com.example.springboot.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

	@Service
	public class AdminService {

	    @Autowired
	    private AdminRepository adminRepo;

	    public Admin login(String username, String password) {
	        Admin admin = adminRepo.findByUsernameAndPassword(username, password);
	        return admin ;  
	    }

	} 
	
>>>>>>> fbf558e1d5a02f2cb34c27c924b1e54a4f44962a
