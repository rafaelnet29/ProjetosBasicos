package com.mycompany.projetobasico.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pessoa {

    private String nome;
    private int idade;
    private List<Pessoa> pessoa = Arrays.asList(
            new Pessoa("qwerty", 50),
            new Pessoa("asdfg", 25),
            new Pessoa("zxcv", 40),
            new Pessoa("poiuy", 10)
    );

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "\n nome: " + nome + " - " + idade + " anos.\n";
    }

    public List<Pessoa> getLista() {
        return pessoa;
    }

    public List<Pessoa> Dados() {

        Collections.sort(getLista(), Comparator.comparing(p -> p.idade));
        System.out.println("Lista ordenada por Idade (ordem crescente): " + getLista().toString());

        return getLista();
    }

    public List<Pessoa> ordenarDecrescente() {
        //Usando Comparator e o metodo reversed para ordenar de forma decrescente
        Collections.sort(getLista(), Comparator.comparing(Pessoa::getIdade).reversed());
        System.out.println("Lista ordenada por nome e  Idade (ordem decrescente): " + getLista().toString());
        return getLista();
    }

    public List<Pessoa> ordemIdadeNome() {
        //Caso a idade seja igual ele faz a ordenação por nome 
        Collections.sort(getLista(), Comparator.comparing(Pessoa::getIdade).thenComparing(Pessoa::getNome));
        System.out.println("Lista ordenada por nome: " + getLista().toString());
        return getLista();
    }
}
