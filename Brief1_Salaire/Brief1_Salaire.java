package secondProject;

import java.util.Scanner;

public class Salaire {

	public static void main(String[] args) {
		String name;
		double nbHeures, tarif,tarif2, salaire;
		double minMensuel=180;
		double minHebdomadaire=40;
		int mode;
		Scanner clavier =new Scanner(System.in);
		System.out.println("Votre nom :");
		name=clavier.nextLine();
		System.out.println("Bienvenu " + name );
		/////////////////////
		System.out.println("taper 1 pour le mode de payement l'hebdomadaire ou 2 pour mensuel  ");
		//mode=clavier.nextDouble();
		mode=clavier.nextInt();
		if(mode!=1 && mode!=2) {
			System.out.println("il faut Taper 1 ou 2");
		}else {
		System.out.println("Combien le nombre d'heure ?");
		nbHeures=clavier.nextDouble();
		
		
		if(mode==1) {
			if(nbHeures >=50) {
				System.out.println(" le nombre d'heures doit être inférieure à 50");
				return;	
			}
			System.out.println("taper le tarif :");
			tarif=clavier.nextDouble();
				if(nbHeures <50 && tarif >= 25) {
						if(minHebdomadaire < nbHeures) {
							salaire=(minHebdomadaire*tarif)+((nbHeures-40)*tarif*1.5);
						}else {
							salaire=nbHeures*tarif;
						}
					System.out.println("le salaire est : " + salaire);
				}
				else {
					System.out.println("Le tarif doit être supérieur à 25");
				}
			
		}
		
		if (mode==2) {
			
			if(nbHeures > 200) {
				System.out.println(" le nombre d'heures doit être inférieure à 200");
				return;
				}
				System.out.println("taper le tarif :");
				tarif2=clavier.nextDouble();	
				tarif = tarif2;
			if(nbHeures <=200 && tarif>=20) {
				
				
						if(minMensuel < nbHeures) {
							salaire=(minMensuel*tarif)+((nbHeures-180)*tarif*1.5);
						}else {
							salaire=nbHeures*tarif;
						}
					System.out.println("le salaire est : " + salaire);
			}
			else {
					System.out.println("Le tarif doit être supérieur à 20");
				}
		}
	  }
	}

}
