package simplonSky.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class VolDto {

	private Long numVol;
	

	private Date dateDebut;
	

	private Date dateFin;
	

	private Double duree;
	

	private String aeroport;
	

	private String destination;
	

}
