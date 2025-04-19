/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetobasico.contandoletras;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class ContandoLetras {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = "";
        char letraRepetida;
        int contador = 0;
        System.out.println("Informe uma frase:");
        palavra = scan.nextLine();

        System.out.println("Informe uma letra saber quantas vezes ela aparece:");
        letraRepetida = scan.nextLine().charAt(0);

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == letraRepetida) {

                contador++;
            }
        }

        System.out.println("A letra " + letraRepetida +  " aparece " + contador + " vezes ");
    }
}
