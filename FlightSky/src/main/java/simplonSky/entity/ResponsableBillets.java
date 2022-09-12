package simplonSky.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
@Table(name = "responsable_billet")
public class ResponsableBillets extends User{
	
	@NonNull
	@Column(name = "salaire")
	private Double salaire;
	
	@ManyToOne
	@JoinColumn(name = "id_admin")
	private Admin admin;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_responsableBillet",referencedColumnName ="id")
	private List<Billet> billet = new ArrayList <Billet> ();
}
