package com.mycompany.projetobasico.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        /**
         * A sequência de Fibonacci é fascinante e um
         * ótimo exercício de lógica. Vamos lá com algumas dicas para você
         * implementar: - O que é a sequência de Fibonacci: É uma sequência onde
         * o próximo número é a soma dos dois anteriores, começando assim: 0, 1,
         * 1, 2, 3, 5, 8, 13... - Como implementar:- Comece com as duas
         * variáveis iniciais da sequência, 0 e 1. - Use um loop para gerar os
         * próximos números. No loop:- Some os dois números mais recentes. -
         * Atualize as variáveis para continuar a sequência.
         *
         * - Receba o limite: Peça ao usuário quantos números ele quer ver na
         * sequência.
         *
         * Aqui vai a estrutura inicial pra você pensar:
         */

        Scanner scan = new Scanner(System.in);
        int numeroInicio = 0, numeroInicio2 = 1, numero;
        System.out.print("Quantos números da sequência de Fibonacci você quer ver? ");
        numero = scan.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println("Sequencia: " + numeroInicio);
            int numeroSoma = numeroInicio + numeroInicio2;
            numeroInicio = numeroInicio2;
            numeroInicio2 = numeroSoma;
        }
    }
}
