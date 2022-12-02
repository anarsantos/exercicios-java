package com.company.media;

/*
Faça um programa que peça para 3 pessoas a sua idade,
ao final o programa deverá verificar se a média de idade da turma
varia entre 0 e 25, 26 e 60 e maior que 60;
e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.
 */

import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual a sua idade: ");
        int idade1 = leitor.nextInt();
        System.out.print("Qual a sua idade: ");
        int idade2 = leitor.nextInt();
        System.out.print("Qual a sua idade: ");
        int idade3 = leitor.nextInt();

        //TODO: Implemente um condição de verifique a média de idade da turma conforme a descrição do desafio:
        int mediaIdades = (idade1 + idade2 + idade3) / 3;
        System.out.println("A média das idades: " + mediaIdades);

        /*if ((mediaIdades > 0) && (mediaIdades <= 25)) {
            System.out.print("Jovem!");
        } else {
            if ((mediaIdades > 26) && (mediaIdades <= 60) ) {
                System.out.print("Adulto");
            } else {
                System.out.print("Idosa!");
            }
        }*/

        if ((mediaIdades > 0) && (mediaIdades <= 25)) {
            System.out.print("Jovem!");
        }
        if ((mediaIdades > 26) && (mediaIdades <= 60)) {
            System.out.print("Adulto");
        }
        if (mediaIdades > 60) {
            System.out.print("Idosa!");
        }
    }
}
