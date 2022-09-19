package simplonSky.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplonSky.entity.Vol;
import simplonSky.repository.VolRepository;
import simplonSky.serviceInterface.InterfaceService;

@Service
@Transactional
public class VolService implements InterfaceService<Vol> {
	
	@Autowired   
	VolRepository VolRepository; 
	
	@Override
	public void save(Vol Vol) {
		VolRepository.save(Vol); 
	}
 
	@Override  
	public List<Vol> getAll() {
		return VolRepository.findAll();
	}

	@Override
	public Vol getById(long id) {
		return VolRepository.findById(id).get();  
		
	}

	@Override
	public void update(Vol vol, long id) {
		Vol Vol1 = VolRepository.findById(id).get();
		Vol1.setDateDebut(vol.getDateDebut());
		Vol1.setDateFin(vol.getDateFin());
		Vol1.setDestination(vol.getDestination());
		VolRepository.save(Vol1);
	}

	@Override
	public void delete(long id) {
		VolRepository.deleteById(id); 
		
	}
}
