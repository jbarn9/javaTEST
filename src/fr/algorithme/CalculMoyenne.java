package fr.algorithme;

import java.util.Arrays;

public class CalculMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		float moyenne = 0;
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		System.out.println(total);
		moyenne = total / array.length; 
		System.out.println(moyenne);
	}

}
