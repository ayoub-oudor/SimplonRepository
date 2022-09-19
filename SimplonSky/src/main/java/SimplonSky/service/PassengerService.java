package simplonSky.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import simplonSky.entity.Passenger;
import simplonSky.repository.PassengerRepository;
import simplonSky.serviceInterface.InterfaceService;

@Service
@Transactional
public class PassengerService implements InterfaceService<Passenger> {
	
	@Autowired   
	PassengerRepository passengerRepository; 
	
	@Override
	public void save(Passenger passenger) {
		passengerRepository.save(passenger); 
	}
  
	@Override  
	public List<Passenger> getAll() {
		return passengerRepository.findAll();
	}

	@Override
	public Passenger getById(long id) {
		return passengerRepository.findById(id).get();  
		
	}

	@Override
	public void update(Passenger passenger, long id) {
		Passenger Passenger1 = passengerRepository.findById(id).get();
		Passenger1.setEmail(passenger.getEmail());
		Passenger1.setNom(passenger.getNom());
		Passenger1.setPrenom(passenger.getPrenom());
		Passenger1.setPassword(passenger.getPassword());
		Passenger1.setTelephone(passenger.getTelephone());
		Passenger1.setRoles(passenger.getRoles());
		Passenger1.setCin(passenger.getCin());
		Passenger1.setNationalite(passenger.getNationalite());
		Passenger1.setPassport(passenger.getPassport());
		passengerRepository.save(Passenger1);
	}

	@Override
	public void delete(long id) {
		passengerRepository.deleteById(id); 
		
	}
	

	
}
