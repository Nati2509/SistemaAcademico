/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6exemplos.aula5;

import java.util.Scanner;

/**
 *
 * @author coelho
 */
public class ProgramaTeste3Modularizado {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escolha [1] para professor e [2] para aluno:");
        int opcao = s.nextInt();
        s.nextLine();
        if (opcao == 1) {
            System.out.println("Nome:");
            String nome = s.nextLine();
            System.out.println("SIAPE:");
            long siape = s.nextLong();
            System.out.println("Quantas áreas?");
            int quantAreas = s.nextInt();
            Professor p = ProgramaTeste2Modularizado.criaProfessor(nome, siape, quantAreas);
            System.out.println("Informe as áreas:");
            for (int i = 0; i < quantAreas; i++) {
                p.novaArea(s.nextLine());
            }
        } else {
            System.out.println("Nome:");
            String nome = s.nextLine();
            System.out.println("Curso:");
            String curso = s.nextLine();
            System.out.println("Matricula:");
            long matricula = s.nextLong();
            System.out.println("Ingresso:");
            int anoIngresso = s.nextInt();
            boolean formado = false;
            Aluno a = ProgramaTeste1Modularizado.criaAluno(nome, curso, anoIngresso, matricula, formado);
        }
    }
}
