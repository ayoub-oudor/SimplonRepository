package simplonSky.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplonSky.entity.Avion;
import simplonSky.repository.AvionRepository;
import simplonSky.serviceInterface.InterfaceService;

@Service
@Transactional
public class AvionService implements InterfaceService<Avion> {
	
	@Autowired   
	AvionRepository AvionRepository; 
	
	@Override
	public void save(Avion Avion) {
		AvionRepository.save(Avion); 
	}
 
	@Override  
	public List<Avion> getAll() {
		return AvionRepository.findAll();
	}

	@Override
	public Avion getById(long id) {
		return AvionRepository.findById(id).get();  
		
	}

	@Override
	public void update(Avion Avion, long id) {
		AvionRepository.save(Avion);
	}

	@Override
	public void delete(long id) {
		AvionRepository.deleteById(id); 
		
	}
}
