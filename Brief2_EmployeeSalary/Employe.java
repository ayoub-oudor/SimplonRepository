package Employe_salary;

public class Employe {

	//private String nom;
	public String nom;
	private String prenom;
	private String DateNaissance;
	//private Double salaire;

	public Employe(String nom, String prenom, String dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.DateNaissance = dateNaissance;
		//this.salaire = salaire;
	}
	
	public Employe() {
		
	}
	
	// getters and setters 

	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getDateNaissance() {
		return DateNaissance;
	}

	public void setDateNaissance(String DateNaissance) {
		this.DateNaissance = DateNaissance;
	}	
	
	
	public Double calculSalaire(Double salaire) {
		return salaire;
	}
	
	
	@Override
	public String toString() {
		
			return ("nom : " + nom + "\nprenom : " + prenom + "\ndate de naissance : " + DateNaissance +"\n");
				
	}


}
