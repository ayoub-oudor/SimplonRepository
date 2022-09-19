package simplonSky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import simplonSky.entity.ResponsableVols;


@Repository
public interface ResponsableVolsRepository extends JpaRepository<ResponsableVols, Long>{ 
	
}
