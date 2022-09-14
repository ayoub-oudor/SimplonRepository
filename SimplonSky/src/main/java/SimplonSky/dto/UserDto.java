package simplonSky.dto;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import simplonSky.entity.Roles;


@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data

public class UserDto {
	
	private String nom;
	
	private String prenom;
	
	private String email;

	private String telephone;

	private String password;
	
	private Roles roles;
	

	public void setPassword(String password) {
		this.password = new BCryptPasswordEncoder().encode(password);
	}
	

}
 