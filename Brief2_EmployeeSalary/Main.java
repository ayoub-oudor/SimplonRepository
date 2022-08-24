package Employe_salary;

public class Main {

	public static void main(String[] args) {

		System.out.println("***************** GESTION DE SALAIRE ********************\n");
		System.out.println("***************** WELCOME TO MY APPLICATION *********************\n");
		
		System.out.println("***************** Employee Salary *****************\n");
		
		System.out.println("***************** Employe ***************** \n");
		
		Employe E1 = new Employe("ayoub","oudor","13-12-2000");
		System.out.println(E1);
		
		System.out.println("***************** EmployeFixe ***************** \n"); 
		
		EmployeFixe E2 = new EmployeFixe("youssef","oudor","15-05-2010",80000.00);
		System.out.println(E2); //System.out.println(E2.toString());
		
		System.out.println("***************** EmployeHoraire ***************** \n");
		
		EmployeHoraire E3 = new EmployeHoraire("hasnae","ouaziz","01-04-1994",12,38);
		System.out.println(E3.toString()); ////System.out.println(E3);
		
		System.out.println("***************** EmployeCommission *****************\n");
		EmployeCommission E4 = new EmployeCommission("hasnae","ouaziz","01-04-1994",100, 20, 6000.0);
		System.out.println(E4.toString());		
		
	}

}