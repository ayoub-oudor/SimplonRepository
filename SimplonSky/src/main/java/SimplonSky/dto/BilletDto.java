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
public class BilletDto {

	private Long numBillet;
	

	private Date dateReservation;
	

	private Double prix;
	

	private String etat;
	

	private Integer numPlace;
	

}
