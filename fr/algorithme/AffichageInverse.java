package fr.algorithme;

import java.util.Arrays;
//essai n1

public class AffichageInverse {

	public static void main(String[] args) {
		/*
		 * EXERCICE AFFICHAGEINVERSE
		 **/
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		// "for" loops
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// Space
		System.out.println("/");

		// Another "for" loop
		for (int number : array) {
			System.out.println(number);
		}
		
		System.out.println("/");

		// reverse loop
		System.out.println(array.length);

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		
		System.out.println("/");

		// ArrayCopy
		int[] array2 = Arrays.copyOf(array, array.length);
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println("array2 position " + i + ": " + array2[i]);
		}
		
		System.out.println("/");

		for (int i = 0; i < array.length; i++) {
			System.out.println("array position " + i + ": " + array[i]);
			System.out.println("array2 position " + i + ": " + array2[i]);
		}
	}

}
