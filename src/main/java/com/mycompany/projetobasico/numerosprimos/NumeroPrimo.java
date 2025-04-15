package com.mycompany.projetobasico.numerosprimos;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        boolean ehPrimo = true;

        System.out.println("Informe um numero: ");
        numero = scan.nextInt();

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i < numero / 2; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
            if (ehPrimo) {
                System.out.println("Número Primo: " + numero);
            } else {
                System.out.println("Número não é Primo: " + numero);
            }

        }
    }
}
