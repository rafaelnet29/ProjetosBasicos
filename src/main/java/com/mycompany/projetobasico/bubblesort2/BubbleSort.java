package com.mycompany.projetobasico.bubblesort2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> primeiraLista = new ArrayList<>();
		List<Integer> copialista = new ArrayList<>();
		int temp;

		int numeros;
		System.out.println("Informe os numero e ZERO para sair");
		while ((numeros = scan.nextInt()) != 0) {
			if (numeros != 0) {
				primeiraLista.add(numeros);
			}
		}
		primeiraLista.remove(primeiraLista.size() - 1);
		copialista.addAll(primeiraLista);

		// percorre a lista
		for (int i = 0; i < primeiraLista.size(); i++) {
			// realiza as trocas
			for (int j = 0; j < primeiraLista.size() - 1 - i; j++) {
				if (primeiraLista.get(j) > primeiraLista.get(j + 1)) {
					
					System.out.println("Pre troca:" + " Indice: " + j + " --------- " + " Valor do indice: " + primeiraLista.get(j));
					temp = primeiraLista.get(j); // Armazena o valor atual (posição j) em uma variável temporária
					primeiraLista.set(j, primeiraLista.get(j + 1)); // Substitui o valor atual pelo próximo valor (posição j+1)
					primeiraLista.set(j + 1, temp); // Coloca o valor temporário (original de j) na posição seguinte
					System.out.println("Pos troca:" + " Indice: " + j + " --------- " + " Valor do indice: " + primeiraLista.get(j));
				}
			}
		}
		System.out.println("Lista original" + copialista);
		System.out.println("Lista ordenada" + primeiraLista);
	}

}