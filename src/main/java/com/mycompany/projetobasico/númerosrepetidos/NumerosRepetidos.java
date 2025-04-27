package com.mycompany.projetobasico.númerosrepetidos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NumerosRepetidos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, Integer> mapaNumeros = new HashMap<Integer, Integer>();
        List<Integer> listaNumeros = new ArrayList<Integer>();

        int contador = 0;

        System.out.println("Digite uma lista de numero: informe ZERO para finalizar");
        do {
            contador = scan.nextInt();
            listaNumeros.add(contador);
        } while (contador != 0);

        listaNumeros.remove(listaNumeros.size() - 1);

        for (int num : listaNumeros) {
            mapaNumeros.put(num, mapaNumeros.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mapaNumeros.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Lista atualizada: " + key + " -> aparece -> " + value + " vezes ");
        }

    }
}
