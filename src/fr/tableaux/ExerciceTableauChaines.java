package fr.tableaux;

import java.util.Iterator;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String tabCities[] = {"Montpellier", "Paris", "Bordeaux", "Lyon", "Limoge"};
       System.out.println(tabCities.length);
       for (int i = 0; i < tabCities.length; i++) {
    	    System.out.println(tabCities[i]);
    	}
       tabCities[3]="Reims";
       System.out.println(tabCities[3]);
       for (int i = 0; i < tabCities.length; i++) {
   	    System.out.println(tabCities[i]);
   	}
	}

}
