package com.mycompany.projetobasico.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<Integer> listaImpares = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int numeros = 0;

        System.out.println("Informe uma lista de numeros:");
        while ((numeros = scan.nextInt()) != 0) {
            listaImpares.add(numeros);
        }
        List<Integer> listaNova = listaImpares.stream()
                .filter(pares -> pares % 2 != 0)
                .collect(Collectors.toList());

        //Ordenação com InsertionSort
        int chave;
        for (int i = 1; i < listaNova.size(); i++) {
            chave = listaNova.get(i);

            int j = i - 1;
            while (j >= 0 && listaNova.get(j) > chave) {
                listaNova.set(j + 1, listaNova.get(j));
                j--;
            }
            listaNova.set(j + 1, chave);
        }
        System.out.println("Lista do Impares: " + listaNova);
    }
}
