package com.mycompany.projetobasico.insertionsort;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> primeiraLista = new ArrayList<>();
		List<Integer> copialista = new ArrayList<>();

		int numeros;
		System.out.println("Informe os numero e ZERO para sair");
		while ((numeros = scan.nextInt()) != 0) {
			primeiraLista.add(numeros);
		}

		copialista.addAll(primeiraLista);

		for (int i = 0; i < primeiraLista.size(); i++) {
			int chave = primeiraLista.get(i);

			var j = i - 1;

			while (j >= 0 && primeiraLista.get(j) > chave) {
				primeiraLista.set(j + 1, primeiraLista.get(j));
				j--;
			}
			primeiraLista.set(j + 1, chave);
		}

		System.out.println("Lista inicial:  " + copialista);
		System.out.println("Lista Ordenada: " + primeiraLista);

	}
}
