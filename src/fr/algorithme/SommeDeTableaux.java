package fr.algorithme;

import java.util.ArrayList;

public class SommeDeTableaux {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
	    int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;
	    int total = 0;
	    
	    for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
	    
	    for (int i = 0; i < array2.length; i++) {
			total += array2[i];
		}
	    ArrayList<Integer> array3 = new ArrayList<Integer>();
	    array3.add(total);
		for (int i = 0; i < array3.size(); i++) {
			System.out.println(array3.get(i));
		}
	}

}
