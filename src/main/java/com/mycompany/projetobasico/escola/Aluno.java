package com.mycompany.projetobasico.escola;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Aluno {

    private String nome;
    private int idade;
    Scanner scan = new Scanner(System.in);
    List<Integer> notas = new ArrayList<>();
    List<Aluno> aluno = new ArrayList<>();

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void adicionarNotas(List<Integer> notas) {
        this.notas = new ArrayList<>(notas);
    }

    public Double calculoMedia() {
        if (this.notas.isEmpty()) {
            System.out.println("Nenhuma nota cadastrada");
            return 0.0;
        }
        var media = notas.stream()
                .mapToInt(Integer::intValue)//Transforma cada número da lista (Integer) em um valor primitivo int, para facilitar cálculos.
                .average().orElse(0.0);
        return media;
    }

    public void metodoAprovados() {
        double mediaFinal = calculoMedia();
        if (mediaFinal >= 7.0) {
            System.out.println(MessageFormat.format("APROVADO: {2} ", nome, idade, mediaFinal));
        } else if (mediaFinal >= 3.0 && mediaFinal <= 6.0) {
            System.out.println(MessageFormat.format("O Aluno {0}, {1} anos está em RECUPERAÇÃO: {2} ", nome, idade, mediaFinal));
        } else {
            System.out.println(MessageFormat.format("O Aluno {0}, {1} anos está REPROVADO: {2} ", nome, idade, mediaFinal));
        }
    }

    public String toString() {
        return " Nome: " + nome;
    }
}
