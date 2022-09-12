package simplonSky.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@Entity 
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "utilisateur",schema="utilisateur")
public  class User {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	
	@NonNull
	@Size(min = 3, max = 50 ,message="MIN 3 MAX 50")
	@Column(name = "nom")
	private String nom;
	
	@NonNull
	@Size(min = 3, max = 50, message="MIN 3 MAX 50")
	@Column(name = "prenom")
	private String prenom;
	
	@NonNull
	@Size(min = 3, max = 50, message="MIN 3 MAX 50")
	@Column(name = "email",unique = true)
	private String email;
	
	@NonNull
	@Size(min = 3, max = 50, message="MIN 3 MAX 50")
	@Column(name = "telephone")
	private String telephone;
	
	@NotEmpty
	@Size(min = 3, max = 50, message="MIN 3 MAX 50")
	@Column(name = "password")
	private String password;
	
	@Column(name = "role", nullable = false)
	@Enumerated(EnumType.STRING)
	private Roles roles;
	
//	public void setPassword(String password) {
//		this.password = new BCryptPasswordEncoder().encode(password);
//	}
	
//	public UserDetails toCurrentUserDetails() {
//	    return CurrentUserDetails.create(this);
//	}
}
 