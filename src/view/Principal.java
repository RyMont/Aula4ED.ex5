package view;

import controller.RecursaoController;

public class Principal {
	public static void main(String[] args) {
		RecursaoController rc = new RecursaoController();
		
		int[] vt1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		vetorAntes(vt1, 1);
		rc.quickSort(vt1);
		vetorDepois(vt1, 1);
		
		int[] vt2 = {44, 43, 42, 41, 40, 39, 38};
		vetorAntes(vt2, 2);
		rc.quickSort(vt2);
		vetorDepois(vt2, 2);
		
		int[] vt3 = {31, 32, 33, 34, 99, 98, 97, 96};
		vetorAntes(vt3, 3);
		rc.quickSort(vt3);
		vetorDepois(vt3, 3);
	}
	
	private static void vetorAntes(int[] vetor, int numVetor) {
		System.out.print("Vetor " + numVetor + " antes: ");
		for (int n : vetor) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	private static void vetorDepois(int[] vetor, int numVetor) {
		System.out.print("Vetor " + numVetor + " depois: ");
		for (int n : vetor) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println();
	}
}
