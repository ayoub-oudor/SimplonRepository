package simplonSky.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity 
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "cin")
@Table(name = "admin")
public class Admin extends User{
	@NonNull
	@Size(min = 3, max = 50, message="MIN 3 MAX 50")
	@Column(name = "cin")
	private String cin;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="id_admin",referencedColumnName ="id")
//	private List<ResponsableBillets> responsableBillets = new ArrayList <ResponsableBillets> ();
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="id_admin",referencedColumnName ="id")
//	private List<ResponsableVols> responsableVols = new ArrayList <ResponsableVols> ();
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="id_admin",referencedColumnName ="id")
//	private List<Vol> vol = new ArrayList <Vol> ();
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="id_admin",referencedColumnName ="id")
//	private List<Avion> avion = new ArrayList <Avion> ();
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="id_admin",referencedColumnName ="id")
//	private List<Billet> billet = new ArrayList <Billet> ();
	
	
}
