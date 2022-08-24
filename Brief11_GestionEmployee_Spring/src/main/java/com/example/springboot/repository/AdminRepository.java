<<<<<<< HEAD
package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

	 public Admin findByUsernameAndPassword(String username, String password);
 
=======
package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

	 public Admin findByUsernameAndPassword(String username, String password);
 
>>>>>>> fbf558e1d5a02f2cb34c27c924b1e54a4f44962a
}