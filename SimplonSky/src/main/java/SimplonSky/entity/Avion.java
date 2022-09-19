package simplonSky.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
@Table(name = "avion")
public class Avion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numAvion;
	@NonNull
	@Size(min = 3, max = 50, message="MIN 3 MAX 50")
	@Column(name = "modele")
	private String modele;
	
	@NonNull
	@Column(name = "capacite")
	private Integer capacite;
	
	@ManyToOne
	@JoinColumn(name = "id_admin")
	private Admin admin;
	
	@ManyToOne
	@JoinColumn(name = "id_responsableVol")
	private ResponsableVols responsableVols;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="numAvion",referencedColumnName ="numAvion")
//	private List<Vol> vol = new ArrayList <Vol> ();
}
