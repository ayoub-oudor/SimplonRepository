package simplonSky.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import simplonSky.entity.ERole;


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
	
	private ERole eRole;
	

	

}
 