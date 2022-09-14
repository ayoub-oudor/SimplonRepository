package SoussHealthOnlineStore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SoussHealthOnlineStore.entity.Produit;
import SoussHealthOnlineStore.repository.ProduitRepository;
import SoussHealthOnlineStore.serviceInterface.InterfaceService;




@Service
@Transactional
public class ProduitService implements InterfaceService<Produit> {
	
	@Autowired   
	ProduitRepository ProduitRepository; 
	
	@Override
	public void save(Produit Produit) {
		ProduitRepository.save(Produit); 
	}
  
	@Override  
	public List<Produit> getAll() {
		return ProduitRepository.findAll();
	}

	@Override
	public Produit getById(long id) {
		return ProduitRepository.findById(id).get();  
		
	}

	@Override
	public void update(Produit Produit, long id) {
		ProduitRepository.save(Produit);
	}

	@Override
	public void delete(long id) {
		ProduitRepository.deleteById(id); 
		
	}
	
}
