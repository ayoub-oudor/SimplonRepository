package simplonSky.controller;

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

import simplonSky.entity.Avion;
import simplonSky.service.AvionService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/Avion") 
public class AvionController { 
	 
    @Autowired
    private AvionService AvionService;
    
    
    //REGISTER
	@PostMapping("/registerNewAvion")
	public ResponseEntity<String> AddAvion(@Valid @RequestBody Avion Avion) {
		AvionService.save(Avion);
		return ResponseEntity.ok("Avion is valid");
	}

	//DELETE
    @DeleteMapping("/deleteNewAvion/{roll}")
    public ResponseEntity<String> deleteAvion(@PathVariable long roll) {
        AvionService.delete(roll);
        return ResponseEntity.ok("Avion is deleted");
    }

    //UPDATE
	@PostMapping("/updateNewAvion/{roll}")
	public ResponseEntity<String> updateAvion(@RequestBody Avion Avion,@PathVariable long roll) {
		AvionService.update(Avion, roll);
		return ResponseEntity.ok("Avion is updated");
	}

	//SHOW LIST
	@GetMapping("/listAvion")
    public List<Avion> List1() {
		return AvionService.getAll();
    }

	//SHOW LISTS
    @GetMapping("/listResponsableBillet/{roll}")
    public ResponseEntity<Avion> getResponsableBillet(@PathVariable long roll) {
    	Avion Avion = AvionService.getById(roll);   
    	 return ResponseEntity.ok(Avion);
    }

  
}
