package simplonSky.entity;

import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
@Table(name = "vol")
public class Vol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numVol;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dateDebut")
	private Date dateDebut;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dateFin")
	private Date dateFin;
	
	@NonNull
	@Column(name = "duree")
	private Double duree;
	
	@NonNull
	@Size(min = 3, max = 50, message="MIN 3 MAX 50")
	@Column(name = "aeroport")
	private String aeroport;
	
	@NonNull
	@Size(min = 3, max = 50, message="MIN 3 MAX 50")
	@Column(name = "destination")
	private String destination;
	
	@ManyToOne
	@JoinColumn(name = "id_admin")
	private Admin admin;
	
	@ManyToOne
	@JoinColumn(name = "id_responsableVol")
	private ResponsableVols responsableVols;
	
	@ManyToOne
	@JoinColumn(name = "numAvion")
	private Avion avion;
	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="numVol",referencedColumnName ="numVol")
//	private List<Billet> billet = new ArrayList <Billet> ();
}
