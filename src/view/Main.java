package view;

import controller.ThreadVetor;

public class Main {
	
	public static void main(String[] args) {
		
		int vetor [] = new int [1000]; 
//		int n; 
		
	    int max = 100;
	    int min = 1;
	    int range = max - min + 1;
	    
	    for (int i = 0; i<vetor.length; i++) {
	    	vetor [i]= (int) (Math.random() * range) + min;
	    }
	    
	    Thread threadvetor1 = new ThreadVetor(1, vetor); 
	    Thread threadvetor2 = new ThreadVetor(2, vetor); 

	    threadvetor1.start(); 
	    threadvetor2.start(); 

		
	}

}
