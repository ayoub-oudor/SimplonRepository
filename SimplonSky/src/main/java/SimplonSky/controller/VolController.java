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

import simplonSky.entity.Vol;
import simplonSky.service.VolService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/Vol") 
public class VolController { 
	 
    @Autowired
    private VolService VolService;
    
    
    //REGISTER
	@PostMapping("/registerNewVol")
	public ResponseEntity<String> AddVol(@Valid @RequestBody Vol Vol) {
		VolService.save(Vol);
		return ResponseEntity.ok("Vol is valid");
	}

	//DELETE
    @DeleteMapping("/deleteNewVol/{roll}")
    public ResponseEntity<String> deleteVol(@PathVariable long roll) {
        VolService.delete(roll);
        return ResponseEntity.ok("Vol is deleted");
    }

    //UPDATE
	@PostMapping("/updateNewVol/{roll}")
	public ResponseEntity<String> updateVol(@RequestBody Vol Vol,@PathVariable long roll) {
		VolService.update(Vol, roll);
		return ResponseEntity.ok("Vol is updated");
	}

	//SHOW LIST
	@GetMapping("/listVol")
    public List<Vol> List1() {
		return VolService.getAll();
    }

	//SHOW LISTS
    @GetMapping("/listResponsableBillet/{roll}")
    public ResponseEntity<Vol> getResponsableBillet(@PathVariable long roll) {
    	Vol Vol = VolService.getById(roll);   
    	 return ResponseEntity.ok(Vol);
    }

  
}
