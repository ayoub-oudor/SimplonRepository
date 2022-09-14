package SoussHealthOnlineStore.controller;

import java.util.List;

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

import SoussHealthOnlineStore.entity.Admin;
import SoussHealthOnlineStore.entity.Client;
import SoussHealthOnlineStore.entity.User;
import SoussHealthOnlineStore.service.AdminService;
import SoussHealthOnlineStore.service.ClientService;
import SoussHealthOnlineStore.service.UserService;


@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/User") 
public class UserController { 
	 
    @Autowired
    private UserService userService;
    @Autowired
    private AdminService adminService;
    @Autowired
    private ClientService clientService;
    
    //register
	@PostMapping("/registerNewUser")
	public ResponseEntity<String> AddUser(@Valid @RequestBody User user) {
		userService.save(user);
		return ResponseEntity.ok("User is valid");
	}
	@PostMapping("/registerNewAdmin")
	public ResponseEntity<String> AddAdmin(@Valid @RequestBody Admin admin) {
		adminService.save(admin);
		return ResponseEntity.ok("Admin is valid");
	}
	@PostMapping("/registerNewClient")
	public ResponseEntity<String> AddClient(@Valid @RequestBody Client client) {
		clientService.save(client);
		return ResponseEntity.ok("Client is valid");
	}
	//delete
    @DeleteMapping("/deleteNewUser/{roll}")
    public ResponseEntity<String> deleteUser(@PathVariable long roll) {
        userService.delete(roll);
        return ResponseEntity.ok("User is deleted");
    }
    @DeleteMapping("/deleteNewAdmin/{roll}")
    public ResponseEntity<String> deleteAdmin(@PathVariable long roll) {
        adminService.delete(roll);
        return ResponseEntity.ok("Admin is deleted");
    }
    @DeleteMapping("/deleteNewClient/{roll}")
    public ResponseEntity<String> deleteClient(@PathVariable long roll) {
        clientService.delete(roll);
        return ResponseEntity.ok("Client is deleted");
    }
    //update
	@PostMapping("/updateNewUser/{roll}")
	public ResponseEntity<String> updateUser(@RequestBody User user,@PathVariable long roll) {
		userService.update(user, roll);
		return ResponseEntity.ok("User is updated");
	}
	@PostMapping("/updateNewAdmin/{roll}")
	public ResponseEntity<String> updateAdmin(@RequestBody Admin admin,@PathVariable long roll) {
		adminService.update(admin, roll);
		return ResponseEntity.ok("Admin is updated");
	}
	@PostMapping("/updateNewClient/{roll}")
	public ResponseEntity<String> updateClient(@RequestBody Client client,@PathVariable long roll) {
		clientService.update(client, roll);
		return ResponseEntity.ok("Client is updated");
	}
	//lists
	@GetMapping("/listUsers")
    public List<User> List() {
		return userService.getAll();
    }
	@GetMapping("/listAdmins")
    public List<Admin> List1() {
		return adminService.getAll();
    }
	@GetMapping("/listClients")
    public List<Client> List2() {
		return clientService.getAll();
    }
	
	//list
    @GetMapping("/listUser/{roll}")
    public ResponseEntity<User> getUser(@PathVariable long roll) {
    	 User user = userService.getById(roll);   
    	 return ResponseEntity.ok(user);
    }
    @GetMapping("/listAdmin/{roll}")
    public ResponseEntity<Admin> getAdmin(@PathVariable long roll) {
    	 Admin admin = adminService.getById(roll);   
    	 return ResponseEntity.ok(admin);
    }
    @GetMapping("/listClient/{roll}")
    public ResponseEntity<Client> getClient(@PathVariable long roll) {
    	 Client client = clientService.getById(roll);   
    	 return ResponseEntity.ok(client);
    }
    ///////////////
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
