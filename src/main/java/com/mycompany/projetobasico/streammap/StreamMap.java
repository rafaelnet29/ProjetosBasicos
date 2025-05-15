package com.mycompany.projetobasico.streammap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String[] args) {
        List<Integer> dobra = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int numeros;
        //insere os numeros na lista sem o zero
        while ((numeros = scan.nextInt()) != 0) {
            if(numeros != 0){
                dobra.add(numeros);
            }
        }
        
        /***
         * transforma lista em uma stream
         * dobra cada numero da lista 
         * e converte para lista novamente
         */
        List<Integer> stream = dobra.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        
        //soma todos os valores que foram dobrados 
        int somaDrobo = stream.stream()
                .reduce(0, (combinacao, n) -> combinacao + n);
                
        System.out.println("Lista dobro de cada numero: " + stream);
        System.out.println("Lista Somando o valores dobrados: " + somaDrobo);
    }
}
