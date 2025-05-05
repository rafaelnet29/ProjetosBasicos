package com.mycompany.projetobasico.bubblesort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<Integer>();
        int contador = 0;
        int temp = 0;
        boolean trocou = true;

        System.out.println("Informe uma lista de numeros:");
        do {
            contador = scan.nextInt();
            numeros.add(contador);
        } while (contador != 0);

        numeros.remove(numeros.size() - 1); // Remove o último elemento (que é 0)

        for (int i = 0; i < numeros.size(); i++) {
            trocou = false;
            for (int j = 0; j < numeros.size() - i - 1; j++) {
                if (numeros.get(j) > numeros.get(j + 1)) {//verifica se o numero atua é MAIOque o proximo
                    temp = numeros.get(j);
                    numeros.set(j, numeros.get(j + 1));
                    numeros.set(j + 1, temp);
                    trocou = true;
                }//2º if
            }//2º for
            if (!trocou) {
                break;
            }
        }//1º for
        System.out.println("Lista ordenada: " + numeros);
    }//fim main
}//fim da class
