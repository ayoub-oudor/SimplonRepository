<<<<<<< HEAD
package package1;

public class User {
	
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	
	 
	public User(String nom, String prenom, String email, String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [\nid=" + id + ", \nnom=" + nom + ", \nprenom=" + prenom + ", \nemail=" + email + ", \npassword=" + password
				+ "\n]";
	}
	
	
	
	
}


=======
package package1;

public class User {
	
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	
	 
	public User(String nom, String prenom, String email, String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [\nid=" + id + ", \nnom=" + nom + ", \nprenom=" + prenom + ", \nemail=" + email + ", \npassword=" + password
				+ "\n]";
	}
	
	
	
	
}


>>>>>>> fbf558e1d5a02f2cb34c27c924b1e54a4f44962a
