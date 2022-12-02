package com.company.turno;

/*
Faça um Programa que pergunte em que turno você estuda.
Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
 */

import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual turno você estuda? (M-matutino, V-vespertino ou N-noturno) ");
        char turno = leitor.next().toUpperCase().charAt(0);
        //TODO: Implemente uma solução para que seja impresso a saída correto do seu turno:

        switch (String.valueOf(turno)) {
            case "M":
                System.out.print("Bom dia!");
                break;
            case "V":
                System.out.print("Boa tarde!");
                break;
            case "N":
                System.out.print("Boa noite!");
                break;
            default:
                System.out.print("Valor inválido!");
                break;
        }
    }
}
