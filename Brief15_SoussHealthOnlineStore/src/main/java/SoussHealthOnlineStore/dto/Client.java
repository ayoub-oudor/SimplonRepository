package SoussHealthOnlineStore.dto;

import java.util.HashSet;
import java.util.Set;

import SoussHealthOnlineStore.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter

public class Client extends User{
	
	private String nom;
	
	private String prenom;
	
	private String cin;
	
	private String ville;
	
	private String telephone;
	
	private String adresse;
	
    private Set<Commande> commande = new HashSet<>();
   
	
}
