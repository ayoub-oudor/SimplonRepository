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
@RequestMapping(value = "/User") 
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
	@PostMapping("/registerNewAdmin")
	public ResponseEntity<String> AddAdmin(@Valid @RequestBody Admin admin) {
		adminService.save(admin);
		return ResponseEntity.ok("Admin is valid");
	}
	@PostMapping("/registerNewResponsableBillets")
	public ResponseEntity<String> AddResponsableBillets(@Valid @RequestBody ResponsableBillets responsableBillets) {
		responsableBilletsService.save(responsableBillets);
		return ResponseEntity.ok("ResponsableBillets is valid");
	}
	@PostMapping("/registerNewResponsableVols")
	public ResponseEntity<String> AddResponsableVols(@Valid @RequestBody ResponsableVols responsableVols) {
		responsableVolsService.save(responsableVols);
		return ResponseEntity.ok("ResponsableVols is valid");
	}
	@PostMapping("/registerNewPassenger")
	public ResponseEntity<String> AddPassenger(@Valid @RequestBody Passenger passenger) {
		passengerService.save(passenger);
		return ResponseEntity.ok("Passenger is valid");
	}
	//DELETE
    @DeleteMapping("/deleteNewAdmin/{roll}")
    public ResponseEntity<String> deleteAdmin(@PathVariable long roll) {
        adminService.delete(roll);
        return ResponseEntity.ok("Admin is deleted");
    }
    @DeleteMapping("/deleteNewResponsableBillets/{roll}")
    public ResponseEntity<String> deleteResponsableBillets(@PathVariable long roll) {
        responsableBilletsService.delete(roll);
        return ResponseEntity.ok("ResponsableBillets is deleted");
    }
    @DeleteMapping("/deleteNewResponsableVols/{roll}")
    public ResponseEntity<String> deleteResponsableVols(@PathVariable long roll) {
    	responsableVolsService.delete(roll);
        return ResponseEntity.ok("ResponsableVols is deleted");
    }
    @DeleteMapping("/deleteNewPassenger/{roll}")
    public ResponseEntity<String> deletePassenger(@PathVariable long roll) {
    	passengerService.delete(roll);
        return ResponseEntity.ok("Passenger is deleted");
    }
    //UPDATE
	@PostMapping("/updateNewAdmin/{roll}")
	public ResponseEntity<String> updateAdmin(@RequestBody Admin admin,@PathVariable long roll) {
		adminService.update(admin, roll);
		return ResponseEntity.ok("Admin is updated");
	}  
	@PostMapping("/updateNewResponsableBillets/{roll}")
	public ResponseEntity<String> updateResponsableBillets(@RequestBody ResponsableBillets responsableBillets,@PathVariable long roll) {
		responsableBilletsService.update(responsableBillets, roll);
		return ResponseEntity.ok("ResponsableBillets is updated");
	}
	@PostMapping("/updateNewResponsableVols/{roll}")
	public ResponseEntity<String> updateResponsableVols(@RequestBody ResponsableVols responsableVols,@PathVariable long roll) {
		responsableVolsService.update(responsableVols, roll);
		return ResponseEntity.ok("ResponsableVols is updated");
	}
	@PostMapping("/updateNewPassenger/{roll}")
	public ResponseEntity<String> updateUser(@RequestBody Passenger passenger,@PathVariable long roll) {
		passengerService.update(passenger, roll);
		return ResponseEntity.ok("Passenger is updated");
	}
	//SHOW LIST
	@GetMapping("/listAdmins")
    public List<Admin> List() {
		return adminService.getAll();
    }
	@GetMapping("/listResponsableBillets")
    public List<ResponsableBillets> List1() {
		return responsableBilletsService.getAll();
    }
	@GetMapping("/listResponsableVols")
    public List<ResponsableVols> List2() {
		return responsableVolsService.getAll();
    }
	@GetMapping("/listPassenger")
    public List<Passenger> List3() {
		return passengerService.getAll();
    }
	//SHOW LISTS
    @GetMapping("/listAdmin/{roll}")
    public ResponseEntity<Admin> getAdmin(@PathVariable long roll) {
    	Admin admin = adminService.getById(roll);   
    	 return ResponseEntity.ok(admin);
    }
    @GetMapping("/listResponsableBillet/{roll}")
    public ResponseEntity<ResponsableBillets> getResponsableBillet(@PathVariable long roll) {
    	ResponsableBillets responsableBillets = responsableBilletsService.getById(roll);   
    	 return ResponseEntity.ok(responsableBillets);
    }
    @GetMapping("/listResponsableVols/{roll}")
    public ResponseEntity<ResponsableVols> getResponsableVols(@PathVariable long roll) {
    	ResponsableVols responsableVols = responsableVolsService.getById(roll);   
    	 return ResponseEntity.ok(responsableVols);
    }
    @GetMapping("/listPassenger/{roll}")
    public ResponseEntity<Passenger> getPassenger(@PathVariable long roll) {
    	Passenger passenger = passengerService.getById(roll);   
    	 return ResponseEntity.ok(passenger);
    } 
    //////////////
    @GetMapping({"/forAdmin"})
    public String forAdmin() {
		return "This URL is only accessible to ADMIN";
    }

}
