package com.mycompany.projetobasico.escola;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class ClasseAux {

    Scanner scan = new Scanner(System.in);
    List<Aluno> alunoLista = new ArrayList<>();
    List<Integer> listaNotas = new ArrayList<>();
    int opc = 0;

    public ClasseAux() {
        resultadoFinal();
    }

    public void resultadoFinal() {
        do {
            System.out.println("Informe o nome do aluno:");
            String n = scan.next();

            System.out.println("Informe a idade do aluno:");
            int idd = scan.nextInt();

            alunoLista.add(new Aluno(n, idd));

            System.out.println("Deseja continuar ? 1 - SIM ou 0 - NAO ");
            opc = scan.nextInt();
        } while (opc != 0);

        for (Aluno aluno : alunoLista) {
            System.out.println("Informe as notas do " + aluno.toString() + " : ");
            for (int i = 0; i < 4; i++) {
                listaNotas.add(scan.nextInt());
            }
            aluno.adicionarNotas(listaNotas);
        }

        for (Aluno aluno : alunoLista) {
            System.out.println(MessageFormat.format(" Media: {0}", aluno.calculoMedia()));
            aluno.metodoAprovados();
        }
    }
}
