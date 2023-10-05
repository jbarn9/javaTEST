package fr.algorithme;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in) ;
		int nb = scanner.nextInt();
		
		while(nb>=1 || nb<=10) {
			System.out.println("nope");	
			Scanner scanner2 = new Scanner(System.in) ;
			int nb2 = scanner.nextInt();
			break;
		}
		System.out.println("ok");
	}

}
