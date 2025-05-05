package com.mycompany.projetobasico.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Stream {

    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int numeros = 0;

        System.out.println("Informe uma lista de numeros:");
        while ((numeros = scan.nextInt()) != 0) {
            listaNumeros.add(numeros);
        }
        List<Integer> listaImpares = listaNumeros.stream()
                .filter(impares -> impares % 2 != 0)
                .collect(Collectors.toList());

        //Ordenação com InsertionSort
        int chave;
        for (int i = 1; i < listaImpares.size(); i++) {
            chave = listaImpares.get(i);

            int j = i - 1;
            while (j >= 0 && listaImpares.get(j) > chave) {
                listaImpares.set(j + 1, listaImpares.get(j));
                j--;
            }
            listaImpares.set(j + 1, chave);
        }
        System.out.println(" Imprimido Lista: \n " + " Lista Original: " + listaNumeros 
                + "\n Lista Nova valores Impares: " + listaImpares);
    }
}
