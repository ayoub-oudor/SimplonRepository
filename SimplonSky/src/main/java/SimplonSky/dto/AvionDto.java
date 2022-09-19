package simplonSky.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class AvionDto {

	private Long numAvion;

	private String modele;
	
	private Integer capacite;
	
}
