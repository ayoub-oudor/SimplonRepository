package Employe_salary;

public class EmployeHoraire extends Employe {
	private int taux_horaire;
	private int nh;
	
	
	public EmployeHoraire(String nom, String prenom, String dateNaissance, int taux_horaire, int nh) {
		super(nom, prenom, dateNaissance);
		this.taux_horaire = taux_horaire;
		this.nh = nh;
	}
	
	//getters and setters 
	
	public int getTaux_horaire() {
		return (int) taux_horaire;
	}

	public void setTaux_horaire(int taux_horaire) {
		this.taux_horaire = taux_horaire;
	}

	public int getNh() {
		return (int) nh;
	}

	public void setNh(int nh) {
		this.nh = nh;
	}
	

	public double calculSalaire(int taux_horaire2, int nh) {
		return taux_horaire2 * nh ;
	}
	
	public String toString() {
		return super.toString() +"nombre d'heure : " + nh + "\ntaux horaire : " + taux_horaire + " DH\nsalaire mensuel : " + calculSalaire(taux_horaire, nh) + " DH\n" ;
	}
}
