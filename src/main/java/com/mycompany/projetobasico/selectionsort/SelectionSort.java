package com.mycompany.projetobasico.selectionsort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        List<Integer> listaNumero = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int numero;
        while ((numero = scan.nextInt()) != 0) {
            listaNumero.add(numero);
        }
       
        for (int i = 0; i < listaNumero.size() - 1; i++) {
            int menor = i; // Consideramos o índice atual como menor

            // Procuramos o menor número entre os restantes
            for (int j = i + 1; j < listaNumero.size(); j++) {
                if (listaNumero.get(j) < listaNumero.get(menor)) {
                    menor = j;
                }
            }

            // Troca o menor número encontrado com o número da posição atual
            if (menor != i) {
                int aux = listaNumero.get(i);
                listaNumero.set(i, listaNumero.get(menor));
                listaNumero.set(menor, aux);
            }
        }

        System.out.println("Lista ordenada com Selection Sort: " + listaNumero);
    }
}
