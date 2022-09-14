package SoussHealthOnlineStore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SoussHealthOnlineStore.entity.Categorie;
import SoussHealthOnlineStore.repository.CategorieRepository;
import SoussHealthOnlineStore.serviceInterface.InterfaceService;




@Service
@Transactional
public class CategorieService implements InterfaceService<Categorie> {
	
	@Autowired   
	CategorieRepository CategorieRepository; 
	
	@Override
	public void save(Categorie Categorie) {
		CategorieRepository.save(Categorie); 
	}
  
	@Override  
	public List<Categorie> getAll() {
		return CategorieRepository.findAll();
	}

	@Override
	public Categorie getById(long id) {
		return CategorieRepository.findById(id).get();  
		
	}

	@Override
	public void update(Categorie Categorie, long id) {
		CategorieRepository.save(Categorie);
	}

	@Override
	public void delete(long id) {
		CategorieRepository.deleteById(id); 
		
	}
	
}
