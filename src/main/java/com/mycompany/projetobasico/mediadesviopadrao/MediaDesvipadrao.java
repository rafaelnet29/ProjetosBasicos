package com.mycompany.projetobasico.mediadesviopadrao;

import java.util.Scanner;

public class MediaDesvipadrao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        double media = 0;
        double variancia = 0;
        double desvioPadrao = 0;
        
        System.out.println("Informeo os numeros que quer para saber a media: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scan.nextInt();
            soma += numeros[i];
        }
        media = soma / numeros.length;
        for (int i = 0; i < numeros.length; i++) {
            variancia += Math.pow(numeros[i] - media ,2);
        }
        variancia /= numeros.length;
        desvioPadrao = Math.sqrt(variancia);
        System.out.println("Soma: " + soma + "\n Media: " + media + "\n Variancia: " + variancia + "\n Desvio Padrão: " + desvioPadrao);
    }
}