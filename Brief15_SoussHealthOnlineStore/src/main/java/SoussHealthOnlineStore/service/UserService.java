package SoussHealthOnlineStore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SoussHealthOnlineStore.entity.User;
import SoussHealthOnlineStore.repository.UserRepository;
import SoussHealthOnlineStore.serviceInterface.InterfaceService;



@Service
@Transactional
public class UserService implements InterfaceService<User> {
	
	@Autowired   
	UserRepository userRepository; 
	
	@Override
	public void save(User user) {
		userRepository.save(user); 
	}
  
	@Override  
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User getById(long id) {
		return userRepository.findById(id).get();  
		
	}

	@Override
	public void update(User user, long id) {
		userRepository.save(user);
	}

	@Override
	public void delete(long id) {
		userRepository.deleteById(id); 
		
	}
	
	
}
