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

import simplonSky.entity.Billet;
import simplonSky.service.BilletService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api") 
@CrossOrigin(origins = "*")
public class BilletController { 
	 
    @Autowired
    private BilletService BilletService;
    
    
    //REGISTER
	@PostMapping("/Billet")
	public ResponseEntity<String> AddBillet(@Valid @RequestBody Billet Billet) {
		BilletService.save(Billet);
		return ResponseEntity.ok("Billet is valid");
	}

	//DELETE
    @DeleteMapping("/Billet/{roll}")
    public ResponseEntity<String> deleteBillet(@PathVariable long roll) {
        BilletService.delete(roll);
        return ResponseEntity.ok("Billet is deleted");
    }

    //UPDATE
	@PostMapping("/Billet/{roll}")
	public ResponseEntity<String> updateBillet(@RequestBody Billet Billet,@PathVariable long roll) {
		BilletService.update(Billet, roll);
		return ResponseEntity.ok("Billet is updated");
	}

	//SHOW LIST
	@GetMapping("/Billet")
    public List<Billet> List1() {
		return BilletService.getAll();
    }

	//SHOW LISTS
    @GetMapping("/Billet/{roll}")
    public ResponseEntity<Billet> getResponsableBillet(@PathVariable long roll) {
    	Billet Billet = BilletService.getById(roll);   
    	 return ResponseEntity.ok(Billet);
    }

  
}
