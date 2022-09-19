package simplonSky.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplonSky.entity.ResponsableVols;
import simplonSky.repository.ResponsableVolsRepository;
import simplonSky.serviceInterface.InterfaceService;

@Service
@Transactional
public class ResponsableVolsService implements InterfaceService<ResponsableVols> {
	
	@Autowired   
	ResponsableVolsRepository responsableVolsRepository; 
	
	@Override
	public void save(ResponsableVols ResponsableVols) {
		responsableVolsRepository.save(ResponsableVols); 
	}
  
	@Override  
	public List<ResponsableVols> getAll() {
		return responsableVolsRepository.findAll();
	}

	@Override
	public ResponsableVols getById(long id) {
		return responsableVolsRepository.findById(id).get();  
		
	}

	@Override
	public void update(ResponsableVols ResponsableVols, long id) {
		ResponsableVols ResponsableVols1 = responsableVolsRepository.findById(id).get();
		ResponsableVols1.setEmail(ResponsableVols.getEmail());
		ResponsableVols1.setNom(ResponsableVols.getNom());
		ResponsableVols1.setPrenom(ResponsableVols.getPrenom());
		ResponsableVols1.setPassword(ResponsableVols.getPassword());
		ResponsableVols1.setTelephone(ResponsableVols.getTelephone());
		ResponsableVols1.setRoles(ResponsableVols.getRoles());
		ResponsableVols1.setSalaire(ResponsableVols.getSalaire());
		responsableVolsRepository.save(ResponsableVols1);
	}

	@Override
	public void delete(long id) {
		responsableVolsRepository.deleteById(id); 
		
	}
	

	
}
