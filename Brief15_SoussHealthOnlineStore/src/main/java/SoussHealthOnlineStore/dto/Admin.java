package SoussHealthOnlineStore.dto;

import java.util.ArrayList;
import java.util.List;

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
public class Admin extends User{
	
	private String fullName;

	private List<Categorie> categorie = new ArrayList <Categorie> ();
	
	private List<Produit> produit = new ArrayList <Produit> ();

}
