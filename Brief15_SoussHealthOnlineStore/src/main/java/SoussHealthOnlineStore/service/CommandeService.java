package SoussHealthOnlineStore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SoussHealthOnlineStore.entity.Commande;
import SoussHealthOnlineStore.repository.CommandeRepository;
import SoussHealthOnlineStore.serviceInterface.InterfaceService;




@Service
@Transactional
public class CommandeService implements InterfaceService<Commande> {
	
	@Autowired   
	CommandeRepository CommandeRepository; 
	
	@Override
	public void save(Commande Commande) {
		CommandeRepository.save(Commande); 
	}
  
	@Override  
	public List<Commande> getAll() {
		return CommandeRepository.findAll();
	}

	@Override
	public Commande getById(long id) {
		return CommandeRepository.findById(id).get();  
		
	}

	@Override
	public void update(Commande Commande, long id) {
		CommandeRepository.save(Commande);
	}

	@Override
	public void delete(long id) {
		CommandeRepository.deleteById(id); 
		
	}
	
}
