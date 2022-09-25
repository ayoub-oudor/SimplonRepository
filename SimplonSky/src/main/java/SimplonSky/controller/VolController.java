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

import simplonSky.entity.Vol;
import simplonSky.service.VolService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api") 
@CrossOrigin(origins = "*")
public class VolController { 
	 
    @Autowired
    private VolService VolService;
    
    
    //REGISTER
	@PostMapping("/Vol")
	public ResponseEntity<String> AddVol(@Valid @RequestBody Vol Vol) {
		VolService.save(Vol);
		return ResponseEntity.ok("Vol is valid");
	}

	//DELETE
    @DeleteMapping("/Vol/{id}")
    public ResponseEntity<String> deleteVol(@PathVariable long id) {
        VolService.delete(id);
        return ResponseEntity.ok("Vol is deleted");
    }

    //UPDATE
	@PostMapping("/Vol/{id}")
	public ResponseEntity<String> updateVol(@RequestBody Vol Vol,@PathVariable long id) {
		VolService.update(Vol, id);
		return ResponseEntity.ok("Vol is updated");
	}

	//SHOW LIST
	@GetMapping("/Vol")
    public List<Vol> List1() {
		return VolService.getAll();
    }

	//SHOW LISTS
    @GetMapping("/Vol/{id}")
    public ResponseEntity<Vol> getResponsableBillet(@PathVariable long id) {
    	Vol Vol = VolService.getById(id);   
    	 return ResponseEntity.ok(Vol);
    }

  
}
