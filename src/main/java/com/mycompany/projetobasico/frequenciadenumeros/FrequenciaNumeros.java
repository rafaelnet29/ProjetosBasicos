package com.mycompany.projetobasico.frequenciadenumeros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FrequenciaNumeros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, Integer> mapaNumeros = new HashMap<Integer, Integer>();
        List<Integer> listaNumeros = new ArrayList<Integer>();
        int contador = 0;
        int temp = 0;

        System.out.println("Digite uma lista de numeros e ZERO para sair:");
        do {
            contador = scan.nextInt();
            listaNumeros.add(contador);
        } while (contador != 0);

        listaNumeros.remove(listaNumeros.size() - 1);//remove o zero

        for (int num : listaNumeros) {
            mapaNumeros.put(num, mapaNumeros.getOrDefault(num, 0) + 1);
        }
        for(int num : listaNumeros){
            if (mapaNumeros.get(num) == 1) {
                    temp += num;
                }
        }

        for (Map.Entry<Integer, Integer> entry : mapaNumeros.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Numeros frequentes: " + key + " >>> " + value);
        }
    }
}
