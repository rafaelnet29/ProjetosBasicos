package com.mycompany.projetobasico.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class OrdenaçãoCollectionSort {
    
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int num = 0;
        
        System.out.println("Inform um lista de numeros: (-1 para sair)");
        
        while((num = scan.nextInt()) != -1){
          numeros.add(num);
        }
        
        Collections.sort(numeros);
                
        System.out.println("Lista ordenada: " + numeros);
        
    }
    
}
