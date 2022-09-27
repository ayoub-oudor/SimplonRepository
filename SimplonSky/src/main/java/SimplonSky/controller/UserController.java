package simplonSky.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simplonSky.entity.Admin;
import simplonSky.entity.Passenger;
import simplonSky.entity.ResponsableBillets;
import simplonSky.entity.ResponsableVols;
import simplonSky.service.AdminService;
import simplonSky.service.PassengerService;
import simplonSky.service.ResponsableBilletsService;
import simplonSky.service.ResponsableVolsService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api") 
@CrossOrigin(origins = "*")
public class UserController { 
	 
    @Autowired
    private ResponsableBilletsService responsableBilletsService;
    
    @Autowired
    private ResponsableVolsService responsableVolsService;
    
    @Autowired
    private PassengerService passengerService;
    
    @Autowired
    private AdminService adminService;
    
    //REGISTER
	@PostMapping("/Admin")
	public ResponseEntity<String> AddAdmin(@Valid @RequestBody Admin admin) {
		adminService.save(admin);
		return ResponseEntity.ok("Admin is valid");
	}
	@PostMapping("/ResponsableBillets")
	public ResponseEntity<String> AddResponsableBillets(@Valid @RequestBody ResponsableBillets responsableBillets) {
		responsableBilletsService.save(responsableBillets);
		return ResponseEntity.ok("ResponsableBillets is valid");
	}
	@PostMapping("/ResponsableVols")
	public ResponseEntity<String> AddResponsableVols(@Valid @RequestBody ResponsableVols responsableVols) {
		responsableVolsService.save(responsableVols);
		return ResponseEntity.ok("ResponsableVols is valid");
	}
	@PostMapping("/Passenger")
	public ResponseEntity<String> AddPassenger(@Valid @RequestBody Passenger passenger) {
		passengerService.save(passenger);
		return ResponseEntity.ok("Passenger is valid");
	}
	//DELETE
    @DeleteMapping("/Admin/{id}")
    public ResponseEntity<String> deleteAdmin(@PathVariable long id) {
        adminService.delete(id);
        return ResponseEntity.ok("Admin is deleted");
    }
    @DeleteMapping("/ResponsableBillets/{id}")
    public ResponseEntity<String> deleteResponsableBillets(@PathVariable long id) {
        responsableBilletsService.delete(id);
        return ResponseEntity.ok("ResponsableBillets is deleted");
    }
    @DeleteMapping("/ResponsableVols/{id}")
    public ResponseEntity<String> deleteResponsableVols(@PathVariable long id) {
    	responsableVolsService.delete(id);
        return ResponseEntity.ok("ResponsableVols is deleted");
    }
    @DeleteMapping("/Passenger/{id}")
    public ResponseEntity<String> deletePassenger(@PathVariable long id) {
    	passengerService.delete(id);
        return ResponseEntity.ok("Passenger is deleted");
    }
    //UPDATE
	@PostMapping("/Admin/{id}")
	public ResponseEntity<String> updateAdmin(@RequestBody Admin admin,@PathVariable long id) {
		adminService.update(admin, id);
		return ResponseEntity.ok("Admin is updated");
	}  
	@PostMapping("/ResponsableBillets/{id}")
	public ResponseEntity<String> updateResponsableBillets(@RequestBody ResponsableBillets responsableBillets,@PathVariable long id) {
		responsableBilletsService.update(responsableBillets, id);
		return ResponseEntity.ok("ResponsableBillets is updated");
	}
	@PostMapping("/ResponsableVols/{id}")
	public ResponseEntity<String> updateResponsableVols(@RequestBody ResponsableVols responsableVols,@PathVariable long id) {
		responsableVolsService.update(responsableVols, id);
		return ResponseEntity.ok("ResponsableVols is updated");
	}
	@PostMapping("/Passenger/{id}")
	public ResponseEntity<String> updateUser(@RequestBody Passenger passenger,@PathVariable long id) {
		passengerService.update(passenger, id);
		return ResponseEntity.ok("Passenger is updated");
	}
	//SHOW LIST
	@GetMapping("/Admin")
    public List<Admin> List() {
		return adminService.getAll();
    }
	@GetMapping("/ResponsableBillets")
    public List<ResponsableBillets> List1() {
		return responsableBilletsService.getAll();
    }
	@GetMapping("/ResponsableVols")
    public List<ResponsableVols> List2() {
		return responsableVolsService.getAll();
    }
	@GetMapping("/Passenger")
    public List<Passenger> List3() {
		return passengerService.getAll();
    }
	//SHOW LISTS
    @GetMapping("/Admin/{id}")
    public ResponseEntity<Admin> getAdmin(@PathVariable long id) {
    	Admin admin = adminService.getById(id);   
    	 return ResponseEntity.ok(admin);
    }
    @GetMapping("/ResponsableBillets/{id}")
    public ResponseEntity<ResponsableBillets> getResponsableBillet(@PathVariable long id) {
    	ResponsableBillets responsableBillets = responsableBilletsService.getById(id);   
    	 return ResponseEntity.ok(responsableBillets);
    }
    @GetMapping("/ResponsableVols/{id}")
    public ResponseEntity<ResponsableVols> getResponsableVols(@PathVariable long id) {
    	ResponsableVols responsableVols = responsableVolsService.getById(id);   
    	 return ResponseEntity.ok(responsableVols);
    }
    @GetMapping("/Passenger/{id}")
    public ResponseEntity<Passenger> getPassenger(@PathVariable long id) {
    	Passenger passenger = passengerService.getById(id);   
    	 return ResponseEntity.ok(passenger);
    } 
    //////////////
    @GetMapping({"/forAdmin"})
    public String forAdmin() {
		return "This URL is only accessible to ADMIN";
    }

}
