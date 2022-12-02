package com.company.desconto;

/*
O gerente de uma loja resolveu aplicar descontos em todos os seus produtos!
A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos.
 */

import java.util.Scanner;

public class PercentualDeDesconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o valor do produto? ");
        int M = input.nextInt();
        System.out.print("Qual o valor final? ");
        int S = input.nextInt();

        //TODO:  Retorne o percentual de desconto que foi aplicado no produto

        /*int valorFinal;
        S = (int) (M * 0.25);
        valorFinal = M - S;
        System.out.print(valorFinal + " O desconto foi de 25%");*/


        Double valorDoDesconto;

        valorDoDesconto = (1 - (((double) S / (double) M))) * 100;
        System.out.print(" O desconto foi de " + valorDoDesconto.intValue() + "%");
    }
}
