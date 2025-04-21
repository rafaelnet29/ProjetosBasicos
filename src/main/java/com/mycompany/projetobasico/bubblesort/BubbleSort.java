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
        System.out.println("Informe uma lista de numeros:");
        do {
            contador = scan.nextInt();
            numeros.add(contador);
        } while (contador != 0);

        numeros.remove(numeros.size() - 1); // Remove o último elemento (que é 0)

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) != 0) {
                for (int j = 0; j < numeros.size()- i - 1; j++) {
                    if(numeros.get(j) > numeros.get(j+1)){
                     temp = numeros.get(j);
                     numeros.set(j, numeros.get(j+1));
                     numeros.set(j+1, temp);
                    }//2º if
                }//2º for
            }//1º if
        }//1º for
        System.out.println("Lista ordenada: " + numeros);
    }//fim main
}//fim da class
