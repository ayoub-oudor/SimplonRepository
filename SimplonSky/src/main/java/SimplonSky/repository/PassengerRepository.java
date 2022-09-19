package simplonSky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import simplonSky.entity.Passenger;


@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long>{ 
	
}
