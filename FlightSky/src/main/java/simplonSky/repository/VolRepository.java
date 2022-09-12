package simplonSky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import simplonSky.entity.Vol;

@Repository
public interface VolRepository extends JpaRepository<Vol, Long>{

}
