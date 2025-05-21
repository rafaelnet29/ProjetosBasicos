package com.mycompany.projetobasico.streamfilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamFilter {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int lista;
        while((lista = scan.nextInt()) != 0){
            numeros.add(lista);
        }

        List<Integer> listaImpares = numeros.stream()
                .filter(s -> s % 2 != 0)//filtra os impares
                //.map(d -> d * 2)//dobra todos o filtrados
                .collect(Collectors.toList());

        List<Integer> listaPares = numeros.stream()
                .filter(s -> s % 2 == 0)//filtra os pares
                .collect(Collectors.toList());

        System.out.println(" Lista 1: " + listaImpares + "\n Lista 2: " + listaPares);

    }
}
