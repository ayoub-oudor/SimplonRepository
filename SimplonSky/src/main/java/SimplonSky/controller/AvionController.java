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

import simplonSky.entity.Avion;
import simplonSky.service.AvionService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*")
public class AvionController { 
	 
    @Autowired
    private AvionService AvionService;
    
    
    //REGISTER
	@PostMapping("/Avion")
	public ResponseEntity<String> AddAvion(@Valid @RequestBody Avion Avion) {
		AvionService.save(Avion);
		return ResponseEntity.ok("Avion is valid");
	}

	//DELETE
    @DeleteMapping("/Avion/{id}")
    public ResponseEntity<String> deleteAvion(@PathVariable long id) {
        AvionService.delete(id);
        return ResponseEntity.ok("Avion is deleted");
    }

    //UPDATE
	@PostMapping("/Avion/{id}")
	public ResponseEntity<String> updateAvion(@PathVariable long id, @RequestBody Avion Avion) {
		AvionService.update(Avion, id);
		return ResponseEntity.ok("Avion is updated");
	}

	//SHOW LIST
	@GetMapping("/Avion")
    public List<Avion> List1() {
		return AvionService.getAll();
    }

	//SHOW LISTS
    @GetMapping("/Avion/{id}")
    public ResponseEntity<Avion> getResponsableBillet(@PathVariable long id) {
    	Avion Avion = AvionService.getById(id);   
    	 return ResponseEntity.ok(Avion);
    }

  
}
