package simplonSky.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplonSky.entity.ResponsableBillets;
import simplonSky.repository.ResponsableBilletsRepository;
import simplonSky.serviceInterface.InterfaceService;

@Service
@Transactional
public class ResponsableBilletsService implements InterfaceService<ResponsableBillets> {
	
	@Autowired   
	ResponsableBilletsRepository ResponsableBilletsRepository; 
	
	@Override
	public void save(ResponsableBillets ResponsableBillets) {
		ResponsableBilletsRepository.save(ResponsableBillets); 
	}
  
	@Override  
	public List<ResponsableBillets> getAll() {
		return ResponsableBilletsRepository.findAll();
	}

	@Override
	public ResponsableBillets getById(long id) {
		return ResponsableBilletsRepository.findById(id).get();  
		
	}

	@Override
	public void update(ResponsableBillets responsableBillet, long id) {
		ResponsableBillets responsableBillets1 = ResponsableBilletsRepository.findById(id).get();
		responsableBillets1.setEmail(responsableBillet.getEmail());
		responsableBillets1.setNom(responsableBillet.getNom());
		responsableBillets1.setPrenom(responsableBillet.getPrenom());
		responsableBillets1.setPassword(responsableBillet.getPassword());
		responsableBillets1.setTelephone(responsableBillet.getTelephone());
		responsableBillets1.setRoles(responsableBillet.getRoles());
		responsableBillets1.setSalaire(responsableBillet.getSalaire());
		ResponsableBilletsRepository.save(responsableBillets1);
	}

	@Override
	public void delete(long id) {
		ResponsableBilletsRepository.deleteById(id); 
		
	}
	

	
}
