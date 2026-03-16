package controller;

import com.rymont.ordenacao.BubbleMerge;
import com.rymont.quicksort.QuickSort;

public class RecursaoController {
	public RecursaoController() {
		super();
	}
	
	private QuickSort quick = new QuickSort();
	private BubbleMerge bm = new BubbleMerge();
	
	public int[] quickSort(int[] vetor) {
		int[] vtOrdenado = quick.quickSort(vetor, 0, vetor.length - 1);
		return vtOrdenado;
	}
	
	public void bubbleSort(int[] vetor) {
		bm.bubbleSort(vetor);
	}
	
	public void mergeSort(int[] vetor) {
		bm.mergeSortAula(vetor, 0, vetor.length -1);
	}
}
