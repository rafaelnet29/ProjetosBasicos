package com.mycompany.projetobasico.palindromo;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra;
        String palindroma = "";

        System.out.println("Informe uma palavra:");
        palavra = scan.nextLine().toLowerCase();

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palindroma += palavra.charAt(i);
            
        }
        if (palavra.equals(palindroma)) {
            System.out.println("Palavra: " + palindroma + " é o reverso de " + palavra);
        } else {
            System.out.println("Palavra: " + palindroma + " não é o reverso de " + palavra);
        }
    }
}
