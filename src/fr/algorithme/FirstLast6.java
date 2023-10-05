package fr.algorithme;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLast6 {
//	• Créer une classe FirstLast6
//	• Dans cette classe, on déclare un tableau d’entiers
//	• On calcule une valeur booléenne qui contrôle le tableau de la sorte :
//	o elle vaut true si le tableau a au moins 1 élément et si le premier élément ou le 
//	dernier élément vaut 6.
//	o elle vaut false dans les autres cas
//	• écrire l’algo de valorisation de cette variable avec le minimum de ligne
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		ArrayList<Integer> array = new ArrayList<Integer>();
	    array.addAll(list);
		boolean tabcond = false;
		if(array.size() >1 && array.get(0) == 6 || array.get(array.size()-1) == 6) {
			System.out.println(tabcond = true);
		}else {
			System.out.println(tabcond);
		}

	}

}
