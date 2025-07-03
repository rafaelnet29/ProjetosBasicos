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

        /**
         * Faz a contagem da frequencia mapa.getOrDefault(num, 0) + 1 funciona
         * assim: - Se num já existe no mapa, pega o valor atual e soma
         * 1(incrementa a contagem). - Se num não existe no mapa, retorna 0 e
         * soma 1 (primeira aparição).
         */
        for (int num : listaNumeros) {
            mapaNumeros.put(num, mapaNumeros.getOrDefault(num, 0) + 1);
        }

        /**
         * - Aqui, o código percorre novamente a lista para identificar números
         * únicos (ou seja, aqueles cuja frequência no mapa é 1). -
         * mapa.get(num) == 1 verifica se o número aparece somente uma vez. - Se
         * for verdadeiro, adiciona esse número à variável temp.
         */
        for (int num : listaNumeros) {
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
