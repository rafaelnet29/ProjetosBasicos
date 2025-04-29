package com.mycompany.projetobasico.arraylistasmapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ArraysListamMapas {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList();
        HashMap<Integer, Integer> mapa = new HashMap();
        int temp = 0;

        //informa o tamanho do array
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tamanho do array:");
        int tamanho = scan.nextInt();
        int[] numeros = new int[tamanho];

        //O array é preenchido com numeros 
        int i = 0;
        int numeroArray = 0;
        System.out.println("Informe os numeros do array: ");
        while (i < tamanho) {
            numeroArray = scan.nextInt();
            if (numeroArray != 0) {
                numeros[i] = numeroArray;
                i++;
            }
            
        }

        //Converte o array em List
        for (int num : numeros) {
            if (num != 0) {
                lista.add(num);
            }
        }
        //verifica se a lista não esta vazia e remove
        //o "0" 
        if (!lista.isEmpty()) {
            if (lista.get(0) == 0) {
                lista.remove(0);
            }
            if (lista.get(lista.size() - 1) == 0) {
                lista.remove(lista.size() - 1);
            }
        }

        //Faz a contagem da frequencia 
        for (int num : lista) {
            mapa.put(num, mapa.getOrDefault(num, 0) + 1);
        }
        for (int num : lista) {
            if (mapa.get(num) == 1) {
                temp += num;
            }
        }

        System.out.println("Tamanho do Array : " + tamanho + " elementos ");

        for (int j = 0; j < numeros.length; j++) {
            System.out.println("Elementos do array: " + numeros[j]);
        }
        System.out.println("Tamanho do Lista : " + lista.size() + " elementos ");
        System.out.println("Elementos do Lista: " + lista);

        for (Map.Entry<Integer, Integer> entry : mapa.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Mapa atualizado: " + key + " <---> " + value);
        }
    }
}
