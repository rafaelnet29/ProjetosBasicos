package com.mycompany.projetobasico.substituirremover;

import java.util.Scanner;

public class SubstiuirRemover {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = "";
        String novaPlavra = "";
        String palavraSubstituida = "";
        String vogaisTodas = "aeiouAEIOU";
        
        System.out.println("Informe um palavra:");
        palavra = scan.nextLine();
        
        /***
         * Remove vogais
         */
        for (int i = 0; i < palavra.length(); i++) {
            char vogal = palavra.charAt(i);
            if (!vogaisTodas.contains(String.valueOf(vogal))) {
                novaPlavra += vogal;
            }
        }
        System.out.println("Nova palavra sem vogal " + novaPlavra);
        
        /***
         * Substituir vogais
         */
        
        for (int i = 0; i < palavra.length(); i++) {

            char c = palavra.charAt(i);
            if (vogaisTodas.contains(String.valueOf(c))) {
                palavraSubstituida += "#";
            }else{
                palavraSubstituida += c;
            }
        }
        System.out.println("Palavra con substituição: " + palavraSubstituida);
    }
}
