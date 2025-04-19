package com.mycompany.projetobasico.produtodedigitos;

import java.util.Scanner;

public class ProdutoDeDigitos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in,"utf-8");
        int numero = 0;
        int numeroTemp = 0;
        int produto = 1;

        System.out.println("Informe um numero:");
        numero = scan.nextInt();

        while (numero > 0) {
            if (numero % 10 != 0) {
                numeroTemp = numero % 10;
                numero /= 10;
                if (numeroTemp % 2 != 0) {
                    produto *= numeroTemp;
                }
            }
        }
        if (produto == 1) {
            System.out.println("Nenhum dígito ímpar encontrado.");
        } else {
            System.out.println("O produto dos dígitos ímpares é: " + produto);
        }
    }
}
