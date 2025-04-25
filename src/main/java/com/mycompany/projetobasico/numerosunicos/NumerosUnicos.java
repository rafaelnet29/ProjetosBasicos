package com.mycompany.projetobasico.numerosunicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosUnicos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<Integer>();
        List<Integer> listaUnica = new ArrayList<Integer>();
        int contador = 0;
        int numerosTemporarios = 0;
        System.out.println("Informe uma lista de numeros: use 0 - 'ZERO' PRA FINALIZAR");
        do {
            contador = scan.nextInt();
            listaNumeros.add(contador);
        } while (contador != 0);

        listaNumeros.remove(listaNumeros.size() - 1);

        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.indexOf(listaNumeros.get(i)) == listaNumeros.lastIndexOf(listaNumeros.get(i))) {
                listaUnica.add(listaNumeros.get(i));
            }
        }

        System.out.println("Lista de numeros unicos: " + listaUnica + " ");
    }
}
