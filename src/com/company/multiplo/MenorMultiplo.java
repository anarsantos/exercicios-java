package com.company.multiplo;

/*
Dado um inteiro positivo n , retorne o menor inteiro positivo que é um múltiplo 2 de e n .
 */

import java.util.Scanner;

public class MenorMultiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int numero = scanner.nextInt();

        int minimoMultiplo = 0;
        if (numero % 2 == 0) {
            minimoMultiplo = numero;
        } else {
            minimoMultiplo = numero * 2;
        }
        System.out.println("O resultado eh: " + minimoMultiplo);
    }
}
