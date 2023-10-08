package fr.algorithme;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int nb = scanner.nextInt();
		for (int i = nb; i <= nb+10; i++) {
			System.out.println(i);
		}
	}

}
