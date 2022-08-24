package Employe_salary;

public class EmployeFixe extends Employe{
	
	private Double salaire;

	public EmployeFixe(String nom, String prenom, String dateNaissance, Double salaire) {
		super(nom, prenom, dateNaissance);
		this.salaire = salaire;
	}

	public Double getSalaire() {
		return salaire;
	}

	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return super.toString() + "salaire mensuel = " + super.calculSalaire(salaire) + " DH\n";
	}
	
	
}
