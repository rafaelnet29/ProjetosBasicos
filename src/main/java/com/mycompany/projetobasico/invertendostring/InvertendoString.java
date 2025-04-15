package com.mycompany.projetobasico.invertendostring;

import java.util.Scanner;

public class InvertendoString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavraNomal, palavraInvertida = "";
        
        System.out.println("informe uma palavra: ");
        palavraNomal = scan.nextLine();
        
        for (int i = palavraNomal.length() - 1; i >= 0; i--) {
            
            palavraInvertida += palavraNomal.charAt(i);
        }
        System.out.println("Palavra Normal:" + palavraNomal);
        System.out.println("Palavra Invertida:" + palavraInvertida);
    }
}
