package fr.tableaux;

import java.util.Iterator;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String tabCities[] = {"Montpellier", "Paris", "Bordeaux", "Lyon", "Limoge"};
       System.out.println("/");
       for (int i = 0; i < tabCities.length; i++) {
    	    System.out.println(tabCities[i]);
    	}
       System.out.println("/");
       for (String nom : tabCities) {
   	    System.out.println(nom);
      	} 
       System.out.println("/");
       System.out.println(tabCities.length);
       tabCities[3]="Reims";
       System.out.println(tabCities[3]);
       for (int i = 0; i < tabCities.length; i++) {
   	    System.out.println(tabCities[i]);
   	}
	}

}
