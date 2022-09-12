package simplonSky.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "billet")
public class Billet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numBillet;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dateReservation")
	private Date dateReservation;
	
	@NonNull
	@Column(name = "prix")
	private Double prix;
	
	@NonNull
	@Size(min = 3, max = 50, message="MIN 3 MAX 50")
	@Column(name = "etat")
	private String etat;
	
	@NonNull
	@Column(name = "numPlace")
	private Integer numPlace;
	
	@ManyToOne
	@JoinColumn(name = "id_admin")
	private Admin admin;
	
	@ManyToOne
	@JoinColumn(name = "id_responsableBillet")
	private ResponsableBillets responsableBillets;
	
	@ManyToOne
	@JoinColumn(name = "id_passenger")
	private Passenger passenger;
	
	@ManyToOne
	@JoinColumn(name = "numVol")
	private Vol vol;
}
