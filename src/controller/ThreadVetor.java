package controller;

public class ThreadVetor extends Thread {
	
	int n; 
	int vetor [] = new int [1000];
	
	public ThreadVetor (int n, int vetor []) {
		this.n = n; 
		this.vetor = vetor;
	}
	
	public void run() {
		if (n%2==0) {
			double TempoInicial = System.nanoTime();
			for(int i=0; i<vetor.length; i++) {
			}
			double TempoFinal = System.nanoTime();
			double TempoTotal = TempoFinal - TempoInicial;
			TempoTotal= TempoTotal / Math.pow(10, 9); 
			System.out.println("Tempo em FOR: " + TempoTotal);
		}else {
			double TempoInicial = System.nanoTime();
			for(int temp : vetor) {
			}
			double TempoFinal = System.nanoTime();
			double TempoTotal = TempoFinal - TempoInicial;
			TempoTotal= TempoTotal / Math.pow(10, 9); 
			System.out.println("Tempo em FOREACH: " + TempoTotal);
		}
	}
	
	
}
