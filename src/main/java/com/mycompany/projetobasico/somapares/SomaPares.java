package com.mycompany.projetobasico.somapares;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SomaPares {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> pares = new ArrayList<Integer>();
        int contador = 0;
        int somaPares = 0; 
        
        
        System.out.println("Informe uma lista de numeros:");
        do {
            contador = scan.nextInt();
            pares.add(contador);
        } while (contador != 0);

        
        for (int i = 0; i < pares.size(); i++) {
            if(pares.get(i) == 0){
                pares.remove(pares.size() - 1);
            }else if (pares.get(i) % 2 == 0){
                somaPares += pares.get(i);
            }
        }
        System.out.println("Valor da soma dos Números Pares: " + somaPares);
    }
}
