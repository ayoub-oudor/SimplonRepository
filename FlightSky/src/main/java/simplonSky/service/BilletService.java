package simplonSky.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplonSky.entity.Billet;
import simplonSky.repository.BilletRepository;
import simplonSky.serviceInterface.InterfaceService;

@Service
@Transactional
public class BilletService implements InterfaceService<Billet> {
	
	@Autowired   
	BilletRepository BilletRepository; 
	
	@Override
	public void save(Billet Billet) {
		BilletRepository.save(Billet); 
	}
 
	@Override  
	public List<Billet> getAll() {
		return BilletRepository.findAll();
	}

	@Override
	public Billet getById(long id) {
		return BilletRepository.findById(id).get();  
		
	}

	@Override
	public void update(Billet Billet, long id) {
		BilletRepository.save(Billet);
	}

	@Override
	public void delete(long id) {
		BilletRepository.deleteById(id); 
		
	}
}
