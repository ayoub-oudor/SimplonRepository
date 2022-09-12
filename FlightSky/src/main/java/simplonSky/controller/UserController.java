package simplonSky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simplonSky.entity.User;
import simplonSky.service.UserService;



@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/User") 
public class UserController { 
	 
    @Autowired
    private UserService UserService;
	

    
	@PostMapping("/registerNewUser")
	public User AddUser(@RequestBody User User) {
		UserService.save(User);
		return User;
	} 
    @DeleteMapping("/deleteNewUser/{roll}")
    public long deleteUser(@PathVariable long roll) {
        UserService.delete(roll);
        return roll;
    }
	@PostMapping("/updateNewUser/{roll}")
	public User updateUser(@RequestBody User User,@PathVariable long roll) {
		UserService.update(User, roll);
		return User;
	}
    @RequestMapping("/listUsers")
    public List<User> List() {
    	return UserService.getAll();
    }
    @RequestMapping("/listUser/{roll}")
    public User getUser(@PathVariable long roll) {
    	return UserService.getById(roll);     
    } 
    @GetMapping({"/forAdmin"})
    public String forAdmin() {
		return "This URL is only accessible to ADMIN";
    }
    @GetMapping({"/forTicketResponsable"})
    public String forTicketResponsable() {
		return "This URL is only accessible to Tickets Responsable";
    }
    @GetMapping({"/forVolResponsable"})
    public String forVolResponsable() {
		return "This URL is only accessible to Vols Responsable";
    }
    @GetMapping({"/forUser"})
    public String forUser() {
		return "This URL is only accessible to USERS";
    }
}
