package com.mycompany.projetobasico.escola;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Scanner;

class Aluno {

    String nome;
    int idade;
    double media;
    Scanner scan = new Scanner(System.in);

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Double calculoMedia() {
        int[] notas = new int[4];
        System.out.println("Informe as notas do aluno: ");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = scan.nextInt();
        }
        media = Arrays.stream(notas)
                .average()
                .orElse(0.0);
        return media;
    }

    public void metodoAprovados() {
        double mediaFinal = calculoMedia();
        if (mediaFinal >= 7.0) {
            System.out.println(MessageFormat.format("O Aluno {0}, {1} anos está APROVADO: {2} ", nome, idade, mediaFinal));
        } else if (mediaFinal <= 3.0 && mediaFinal <= 6.0) {
            System.out.println(MessageFormat.format("O Aluno {0}, {1} anos está em RECUPERAÇÃO: {2} ", nome, idade, mediaFinal));
        } else {
            System.out.println(MessageFormat.format("O Aluno {0}, {1} anos está REPROVADO: {2} ", nome, idade, mediaFinal));
        }
    }
}
