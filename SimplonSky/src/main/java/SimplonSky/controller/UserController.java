package simplonSky.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<String> AddUser(@Valid @RequestBody User User) {
		UserService.save(User);
		return ResponseEntity.ok("User is valid");
	} 
    @DeleteMapping("/deleteNewUser/{roll}")
    public ResponseEntity<String> deleteUser(@PathVariable long roll) {
        UserService.delete(roll);
        return ResponseEntity.ok("User is deleted");
    }
	@PostMapping("/updateNewUser/{roll}")
	public ResponseEntity<String> updateUser(@RequestBody User User,@PathVariable long roll) {
		UserService.update(User, roll);
		return ResponseEntity.ok("User is updated");
	}
	@GetMapping("/listUsers")
    public ResponseEntity<User> List() {
    	User user = (User) UserService.getAll();
    	return ResponseEntity.ok(user);
    }
    @GetMapping("/listUser/{roll}")
    public ResponseEntity<User> getUser(@PathVariable long roll) {
    	 User user = UserService.getById(roll);   
    	 return ResponseEntity.ok(user);
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
