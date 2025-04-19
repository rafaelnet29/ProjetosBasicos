package com.mycompany.projetobasico.contagemvariasletras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class ContandoVariasLetras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Character, Integer> mapaLetras = new HashMap<>();
        String frase= "";
        
        System.out.println("Informe uma frase:");
        frase = scan.nextLine().replace(" ", "");
        
        for (int i = 0; i < frase.length(); i++) {

            char c = frase.charAt(i);
            if (Character.isLetter(c) && mapaLetras.containsKey(c)) {
                mapaLetras.put(c, mapaLetras.get(c) + 1);
            }else{
                mapaLetras.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : mapaLetras.entrySet()) {
            System.out.println("A letra: '" + entry.getKey()+ "' aparece " + entry.getValue() + " vezes ");
        }
        
    }
}