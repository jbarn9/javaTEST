package fr.algorithme;

public class AffichagePartiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		for (int i = 0; i < array.length; i++) {
			if(array[i]>3 && array[i]==(int)array[i]) {
				System.out.println(array[i] + " est bien un entier supérieur à 3");
			}
		}
		
		System.out.println("/");
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2==0 && array[i]==(int)array[i] && array[i]>0) {
				System.out.println(array[i] + " est bien un entier pair");
			}
		}
		
		System.out.println("/");
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2!=0 && array[i]==(int)array[i] && array[i]>0) {
				System.out.println(array[i] + " est bien un entier impair");
			}
		}
	}


}
