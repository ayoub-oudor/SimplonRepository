 package SoussHealthOnlineStore.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Produit {

	private Long numProduit;
	
	private String nomProduit;
	
	private String company;
	
	private Double prix;
	
	private Date dateExpiration;
	
	private Admin admin;
	
	private Categorie categorie;
	
    private Set<Commande> commande = new HashSet<>();
 
}