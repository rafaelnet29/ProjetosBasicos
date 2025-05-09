package com.mycompany.projetobasico.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
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
        //remove duplicatas
        Set<Integer> numerosUnicos = new HashSet<>(listaNumeros);
        
        //converte Set para List
        List<Integer> listaReptidos = new ArrayList<>(numerosUnicos);
        
        List<Integer> numerosImpares = listaReptidos.stream()
                .filter(impares -> impares % 2 != 0)
                .collect(Collectors.toList());

        //Ordenação com InsertionSort
        int chave;
        for (int i = 1; i < numerosImpares.size(); i++) {
            
            chave = numerosImpares.get(i);

            int j = i - 1;
            while (j >= 0 && numerosImpares.get(j) > chave) {
                numerosImpares.set(j + 1, numerosImpares.get(j));
                j--;
            }
            numerosImpares.set(j + 1, chave);
        }
        System.out.println(" Imprimido Lista: \n " + " Lista Original: " + listaNumeros
                + "\n Lista Nova valores Impares: " + numerosImpares);
        
        /***
         * *
         * Remove numeros repetidos percorre a lista original, verifica na nova
         * lista se o numero não exite. se não existir, é adicionado. 
         *  List<Integer> listaNumerosrepetidos = new ArrayList<>();
         * for (int num = 0; num < listaNumeros.size(); num++) {
             if (!listaNumerosrepetidos.contains(listaNumeros.get(num))) {
                 listaNumerosrepetidos.add(listaNumeros.get(num));
             }
            }
         */
        
        /***
        *percorrendo a lista ao contrario
        *  List<Integer> listaNumerosrepetidos = new ArrayList<>();
        * for (int num = listaNumeros.size() - 1; num >= 0; num--) { // Agora inclui o índice 0
            if (!listaNumerosrepetidos.contains(listaNumeros.get(num))) {
                listaNumerosrepetidos.add(listaNumeros.get(num)); // Adiciona valores únicos
            }
        }
        */
    }
}