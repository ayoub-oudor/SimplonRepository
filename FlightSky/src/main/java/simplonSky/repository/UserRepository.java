package simplonSky.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import simplonSky.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{ 
	User findByEmail(String username);
}
