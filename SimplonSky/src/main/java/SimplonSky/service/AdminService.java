package simplonSky.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import simplonSky.entity.Admin;
import simplonSky.repository.AdminRepository;
import simplonSky.serviceInterface.InterfaceService;

@Service
@Transactional
public class AdminService implements InterfaceService<Admin> {
	
	@Autowired   
	AdminRepository AdminRepository; 
	
	@Override
	public void save(Admin Admin) {
		AdminRepository.save(Admin); 
	}
  
	@Override  
	public List<Admin> getAll() {
		return AdminRepository.findAll();
	}

	@Override
	public Admin getById(long id) {	
		return AdminRepository.findById(id).get();  
		
	}

	@Override
	public void update(Admin Admin, long id) {
		
		Admin admin = AdminRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Admin"));
		admin.setCin(Admin.getCin());
		admin.setEmail(Admin.getEmail());
		admin.setNom(Admin.getNom());
		admin.setPrenom(Admin.getPrenom());
		admin.setPassword(Admin.getPassword());
		admin.setTelephone(Admin.getTelephone());
		admin.setRoles(Admin.getRoles());
		AdminRepository.save(Admin);
	
	}

	@Override
	public void delete(long id) {
		AdminRepository.deleteById(id); 
		
	}
	
}
