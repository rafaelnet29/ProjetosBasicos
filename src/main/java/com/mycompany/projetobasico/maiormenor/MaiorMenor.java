package com.mycompany.projetobasico.maiormenor;

import java.util.Scanner;

public class MaiorMenor {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        int menor = numeros[0];
        int maior = numeros[0];
        
        System.out.println("Digite 5 números inteiros: ");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scan.nextInt();

            if (numeros[i] < menor) {
                menor = numeros[i];
            } else if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("Maior número: " + maior + " Menor número: " + menor);
    }
}