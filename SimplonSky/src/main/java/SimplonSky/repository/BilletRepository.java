package simplonSky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import simplonSky.entity.Billet;

@Repository
public interface BilletRepository extends JpaRepository<Billet, Long>{

}
