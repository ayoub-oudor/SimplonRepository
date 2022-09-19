package simplonSky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import simplonSky.entity.ResponsableBillets;


@Repository
public interface ResponsableBilletsRepository extends JpaRepository<ResponsableBillets, Long>{ 

}
