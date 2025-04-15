package com.mycompany.projetobasico.tabuada;

import java.util.Scanner;

public class Tabuada {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int numero, total;
        System.out.println("Informe um Número:");
        numero = scan.nextInt();
        
        for(int i = 1; i <= 10 ; i++){
           total = numero * i;
            System.out.println(" Tabuada: " + numero + " * " + i + " = " + total);
        }
        
    }
}