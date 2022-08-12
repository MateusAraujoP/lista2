package com.mycompany.aulaestruturadedados;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        int i = 0;
        int[] vetor2;
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;

        while (i < vetor.length) {
            System.out.println("O elemento na posição " + (i + 1) + " é: " + vetor[i]);
            i++;
        }
        System.out.println("Insira o tamanho do vetor2:");
        int tv2 = sc.nextInt();
        vetor2 = new int[tv2];
        for (i = 0; i < tv2; i++) {
            System.out.println("Insira o valor do " + (i + 1) + "º elmento do vetor:");
            vetor2[i] = sc.nextInt();
        }
    }
}
