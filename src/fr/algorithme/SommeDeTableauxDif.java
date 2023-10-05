package fr.algorithme;

import java.util.ArrayList;
import java.util.Iterator;

public class SommeDeTableauxDif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { -1, 12, 17, 14, 5, -9, 0, 18 };
		ArrayList<Integer> array3 = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array2.length; j++) {
//				System.out.println(array[i] + " "+ array2[j]);
				if (array[i] == array2[j]) {
//					System.out.println("oui "+array[i]);
					System.out.println(array[i]);
					array3.add(array[i]);	
				}

			}
		}
		for (int i = 0; i < array3.size(); i++) {
			System.out.println(array3.get(i));
		}
		
	}

}
