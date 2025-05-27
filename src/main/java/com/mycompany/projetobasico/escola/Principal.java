package com.mycompany.projetobasico.escola;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Principal {

    public static void main(String[] args) throws UnsupportedEncodingException {
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        out.println("Texto com acentuação: é, á, ô, ã, ç");

        Aluno aluno = new Aluno("Rafael", 36);
        aluno.metodoAprovados();
    }
}
