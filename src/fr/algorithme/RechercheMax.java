package fr.algorithme;

import java.util.Arrays;
import java.util.OptionalInt;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class RechercheMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		OptionalInt max = Arrays.stream(array).max();
		System.out.println(max);
	}

}
