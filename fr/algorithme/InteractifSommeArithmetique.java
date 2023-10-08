package fr.algorithme;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();
		int nbFinal = 0;
		for (int i = 1; i <= nb; i++) {
			nbFinal += i; 
			System.out.println(nbFinal);
		}
	}

}
