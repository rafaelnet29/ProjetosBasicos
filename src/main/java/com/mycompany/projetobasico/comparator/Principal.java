package com.mycompany.projetobasico.comparator;

public class Principal {
    public static void main(String[] args) {
    String nome = "";
    int idade = 0;
    Pessoa pessoa = new Pessoa(nome , idade);
    pessoa.Dados();
    pessoa.ordenarDecrescente();
    pessoa.ordemIdadeNome();
    }
}
