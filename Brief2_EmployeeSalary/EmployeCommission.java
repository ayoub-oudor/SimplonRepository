package Employe_salary;

public class EmployeCommission extends Employe {
	private int vente;
	private double commission;
	private double salaire;

	public EmployeCommission(String nom, String prenom, String dateNaissance, int vente, double commission, double salaire) {
		super(nom, prenom, dateNaissance);
		this.vente = vente;
		this.commission = commission;
		this.salaire=  salaire;
	}
	
	//getters and setters 
	public int getVente() {
		return vente;
	}

	public void setVente(int vente) {
		this.vente = vente;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	
	public double getSalaire() { 
		return salaire; 
	}
	  
	public void setSalaire(double salaire) { 
		this.salaire = salaire; 
	}
	
	// salaire mensuel 
	public Double salaireMensuel(double vente, double commission) {
		return  super.calculSalaire(salaire) + (this.vente * this.commission);
	}
	
	
	//afficher salaire
	public String toString() {
		return super.toString() + "vente : " + vente + "\ncommission :" + commission + " DH\nsalaire de base : " + super.calculSalaire(salaire) + " DH\nsalaire mensuel : " + salaireMensuel(vente,commission) + " DH\n";
		
	}
	
	
}