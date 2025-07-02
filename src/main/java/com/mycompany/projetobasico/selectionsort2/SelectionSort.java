package com.mycompany.projetobasico.selectionsort2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> primeiraLista = new ArrayList<>();

		int pivo, temp;

		int numeros;
		System.out.println("Informe os numero e ZERO para sair");
		while ((numeros = scan.nextInt()) != 0) {
			if (numeros != 0) {
				primeiraLista.add(numeros);
			}
		}
		// SelectionSort
		// percorre a lista
		for (int i = 0; i < primeiraLista.size(); i++) {
			pivo = i;// recebe o indice
			System.out.println("Valor do indice pivo: " + pivo + " que recebe o i: " + i);
			for (int j = i + 1; j < primeiraLista.size(); j++) {
				
				if (primeiraLista.get(j) < primeiraLista.get(pivo)) {
					pivo = j;
					System.out.println("Novo menor valor encontrado no índice pivo(i): " + pivo + " → valor: " + primeiraLista.get(pivo));
				}
			}
			temp = primeiraLista.get(i);
			primeiraLista.set(i, primeiraLista.get(pivo));
			primeiraLista.set(pivo, temp);
			System.out.println("Passada " + (i + 1) + ": " + primeiraLista);
		}
		System.out.println("Lista final: " + primeiraLista);
	}
}
