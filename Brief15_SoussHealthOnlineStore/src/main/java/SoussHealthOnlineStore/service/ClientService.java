package SoussHealthOnlineStore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SoussHealthOnlineStore.entity.Client;
import SoussHealthOnlineStore.repository.ClientRepository;
import SoussHealthOnlineStore.serviceInterface.InterfaceService;




@Service
@Transactional
public class ClientService implements InterfaceService<Client> {
	
	@Autowired   
	ClientRepository ClientRepository; 
	
	@Override
	public void save(Client Client) {
		ClientRepository.save(Client); 
	}
  
	@Override  
	public List<Client> getAll() {
		return ClientRepository.findAll();
	}

	@Override
	public Client getById(long id) {
		return ClientRepository.findById(id).get();  
		
	}

	@Override
	public void update(Client Client, long id) {
		ClientRepository.save(Client);
	}

	@Override
	public void delete(long id) {
		ClientRepository.deleteById(id); 
		
	}
	
}
