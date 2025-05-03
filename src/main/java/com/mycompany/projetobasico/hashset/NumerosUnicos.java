package com.mycompany.projetobasico.hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumerosUnicos {

    public static void main(String[] args) {

        Set<Integer> numerosUnicos = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Informe os numero: (-1 para parar)");
        do {
            num = scan.nextInt();
            if (num != -1) {
                numerosUnicos.add(num);
            }
        } while (num != -1);

        System.out.println("informe umnumero para procurar:");
        int busca = scan.nextInt();
        if (numerosUnicos.contains(busca)) {
            System.out.println("Você encontrou o numero " + busca);
        } else {
            System.out.println("Numero não existe na lista " + busca);
        }
        System.out.println("Lista de numeros: " + numerosUnicos);
    }
}
