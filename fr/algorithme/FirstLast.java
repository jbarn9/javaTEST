package fr.algorithme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,1);
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.addAll(list);
		boolean tabcond = false;
		if (array.size() >= 1 && array.get(0) == array.get(array.size() - 1)) {
			System.out.println(tabcond = true);
		} else {
			System.out.println(tabcond);
		}
	}

}
