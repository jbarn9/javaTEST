package fr.algorithme;

import java.util.Scanner;

public class InteractifTableMult {
//	Ecrire un programme qui demande un nombre à l’utilisateur qui doit être compris entre 1 et 
//	10. Une fois que le nombre est bien entre 1 et 10, le programme affiche la table de 
//	multiplication de ce nombre
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();
		while (nb < 0 && nb > 10) {
			System.out.println("nope");
			Scanner scanner2 = new Scanner(System.in);
			nb = scanner.nextInt();
			break;
		}
		System.out.println("ok, bien joué !");
		for (int i = 0; i <= 10; i++) {
			System.out.println(nb+"*"+i+" = "+(nb*i));
		}
	}

}
