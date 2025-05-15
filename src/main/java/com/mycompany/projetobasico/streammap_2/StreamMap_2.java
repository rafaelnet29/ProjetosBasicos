package com.mycompany.projetobasico.streammap_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamMap_2 {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String alfabeto;
        //insere palavras na lista ate que 0 digitado
        while (!(alfabeto = scan.next()).equals("0")) {
            palavras.add(alfabeto);
        }

        List<Integer> comprimentoPalavras = palavras.stream()
                .map(p -> p.length())
                .collect(Collectors.toList());
        
        int somarComprimentos = comprimentoPalavras.stream()
               .reduce(0, (somarTodos, s) -> somarTodos + s);
        
        String palavraMaisLonga = palavras.stream()
                 .reduce("", (a, b) -> a.length() > b.length() ? a: b);

        System.out.println("Comprimento das palavras " + comprimentoPalavras);
        System.out.println("Soma dos Comprimentos das palavras " + somarComprimentos);
        System.out.println("Palavras mais longa " + palavraMaisLonga);
    }
}
