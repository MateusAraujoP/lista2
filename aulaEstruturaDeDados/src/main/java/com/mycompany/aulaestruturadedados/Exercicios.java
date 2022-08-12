/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulaestruturadedados;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class Exercicios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Exercício 1:");

        System.out.println("A:");
        double a = sc.nextDouble();
        System.out.println("B:");
        double b = sc.nextDouble();
        System.out.println("C:");
        double c = sc.nextDouble();
        if (((a + b) < c)) {
            System.out.println("A soma de A + B é menor que C");
        } else {
            System.out.println("A soma de A + B não é menor que C");
        }

        System.out.println("\n Exercício 2:");
        System.out.println("Nome:");
        String nome = sc.next();
        System.out.println("Sexo:");
        String sexo = sc.next();
        System.out.println("Estado civil:");
        String ecivil = sc.next();
        if (sexo.equals("F") && ecivil.equals("casada")) {
            System.out.println("Quantos anos de casada?");
            int anos = sc.nextInt();
        }

        System.out.println("\n Exercício 3:");
        System.out.println("Informe os valores de 'a', 'b', 'c' da equação de segundo grau:");
        System.out.println("a:");
        double a3 = sc.nextDouble();
        if (a3 == 0) {
            System.out.println("A equação não é do segundo grau.");
        } else {
            System.out.println("b:");
            double b3 = sc.nextDouble();
            System.out.println("c");
            double c3 = sc.nextDouble();
            double delta;
            delta = (b3 * b3) - (4 * a * c);
            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else if (delta == 0) {
                double x1 = (((-b3) + (Math.sqrt(delta))) / (2 * a3));
                System.out.println("A equação possui uma razão real: " + x1);
            } else {
                double x1 = (((-b3) + (Math.sqrt(delta))) / (2 * a3));
                double x2 = (((-b3) - (Math.sqrt(delta))) / (2 * a3));
                System.out.println("A equação possui duas razões reais:\n x1: " + x1 + "\n x2: " + x2);
            }
        }

        System.out.println("\n Exercicio 4:");
        System.out.println("Informe um numero inteiro para A:");
        int a4 = sc.nextInt();
        System.out.println("Informe um numero inteiro para B:");
        int b4 = sc.nextInt();
        int c4;
        if (a4 == b4) {
            c4 = a4 + b4;
        } else {
            c4 = a4 * b4;
        }
        System.out.println("Variável C = " + c4);

        System.out.println("\n Exercício 5:");
        System.out.println("Informe um numero:");
        double n5 = sc.nextDouble();
        if (n5 == 0) {
            System.out.println("O numero informado é 0");
        } else if (n5 > 0) {
            System.out.println("Você informou um número positivo\nDobro do número: " + n5 * 2);
        } else {
            System.out.println("Você informou um numero negativo\nTriplo do numero: " + n5 * 3);
        }

        System.out.println("\n Exercício 6:"); //arrumar o bubble sort
        System.out.println("Informe 3 numeros:");
        double num[] = new double[3];
        System.out.println("1º:");
        num[0] = sc.nextDouble();
        System.out.println("2º:");
        num[1] = sc.nextDouble();
        System.out.println("3º:");
        num[2] = sc.nextDouble();
        double auxi;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] < num[j]) {
                    auxi = num[i];
                    num[i] = num[j];
                    num[j] = auxi;
                }
            }
        }
        System.out.println("Em ordem crescente: " + num[0] + " " + num[1] + " " + num[2]);

        System.out.println("\n Exercício 7:");
        System.out.println("Informe um número:");
        double num7 = sc.nextDouble();
        if (num7 % 2 == 0) {
            System.out.println(num7 + " + 5: " + (num7 + 5));
        } else {
            System.out.println(num7 + " + 8: " + (num7 + 8));
        }

        System.out.println("\n Exercício 8:");
        System.out.println("Informe 5 números inteiros diferentes:");
        int num8[] = new int[5];
        int equal = 0;
        /*   int loop = 1;
        while (loop != 0) {
            equal = 0; */
        System.out.println("Primeiro número:");
        num8[0] = sc.nextInt();
        System.out.println("Segundo número:");
        num8[1] = sc.nextInt();
        System.out.println("Terceiro número:");
        num8[2] = sc.nextInt();
        System.out.println("Quarto número:");
        num8[3] = sc.nextInt();
        System.out.println("Quinto número:");
        num8[4] = sc.nextInt();
        for (int i = 0; i < num8.length - 1; i++) {
            for (int j = 0 + i; j < num8.length; j++) {
                if (num8[i] == num8[j]) {
                    equal = 1;
                }
            }
        }
        /*   if (equal == 0) {
                loop = 0;
            } else {
                System.out.println("Todos os números devem ser diferentes. Tente novamente:");
            }
        } */
        int aux8;
        for (int i = 0; i < num8.length; i++) {
            for (int j = 0; j < num8.length; j++) {
                if (num8[i] < num8[j]) {
                    aux8 = num8[i];
                    num8[i] = num8[j];
                    num8[j] = aux8;
                }
            }
        }
        if (equal == 0) {
            System.out.println("Em ordem crescente:");
            for (int i = 0; i < num8.length; i++) {
                System.out.println("Vetor " + (i + 1) + "= " + num8[i]);
            }
        } else {
            System.out.println("Os números não sao diferentes.");
        }
        System.out.println("\n Exercicio 9:");
        System.out.println("Qual a sua altura em metros?");
        double altura = sc.nextDouble();
        System.out.println("Qual o seu peso em quilogramas?");
        String sexo9 = sc.next();
        double pesoIdeal = 0;
        if (sexo9.equals("masculino") || sexo9.equals("m")) {
            pesoIdeal = (72.8 * altura) - 58;
        } else if (sexo9.equals("feminino") || sexo9.equals("f")) {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        System.out.println("Seu peso ideal é: " + pesoIdeal + " kg");

        System.out.println("\n Exercicio 10:");
        System.out.println("Informe as medidas dos lados de um triângulo:\nLado 1:");
        double lado1 = sc.nextDouble();
        System.out.println("Lado 2");
        double lado2 = sc.nextDouble();
        System.out.println("Lado 3");
        double lado3 = sc.nextDouble();
        if ((lado1 == lado2) && (lado2 == lado3)) {
            System.out.println("O triângulo é equilátero");
        } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
            System.out.println("O triângulo é isóceles");
        } else {
            System.out.println("O triânglo é escaleno");
        }

        System.out.println("\n Exercicio 11:");
        System.out.println("Informe o preço de etiqueta:");
        double precoE = sc.nextDouble();
        System.out.println("Escolha a condição de pagamento: (1 a 4)");
        System.out.println("1 - À vista em dinheiro ou cheque, 10% de desconto");
        System.out.println("2 - À vista no cartão de credito, recebe 15% de desconto");
        System.out.println("3 - Em duas vezes, preço normal de etiqueta sem juros");
        System.out.println("4 - Em duas vezes, preço normal de etiqueta mais juros de 10%");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("O valor final será: " + (precoE * 0.9));
                break;
            case 2:
                System.out.println("O valor final será: " + (precoE * 0.85));
                break;
            case 3:
                System.out.println("O valor final será: " + precoE + " R$ em duas vezes de " + precoE / 2);
                break;
            case 4:
                System.out.println("O valor final será: " + precoE * 1.1 + " R$ em duas vezes de " + (precoE * 1.1) / 2);
                break;
        }

        System.out.println("\n Exercicio 12:");
        System.out.println("Número de identificação:");
        int nId = sc.nextInt();
        System.out.println("Nota 1:");
        double nota1 = sc.nextDouble();
        System.out.println("Nota 2:");
        double nota2 = sc.nextDouble();
        System.out.println("Nota 3:");
        double nota3 = sc.nextDouble();
        System.out.println("Média dos exercícios:");
        int mediaEx = sc.nextInt();
        double mediaAp = ((nota1 + nota2) * 2 + (nota3) * 3 + (mediaEx)) / 7;
        String conceito = "f";
        if (mediaAp >= 90) {
            conceito = "A";
        } else if ((mediaAp >= 75) && (mediaAp < 90)) {
            conceito = "B";
        } else if ((mediaAp >= 60) && (mediaAp < 75)) {
            conceito = "C";
        } else if ((mediaAp >= 40) && (mediaAp < 60)) {
            conceito = "D";
        } else if ((mediaAp < 40)) {
            conceito = "E";
        }
        System.out.println("Número do aluno: " + nId);
        System.out.println("Nota 1: " + nota1 + "\nNota 2: " + nota2 + "\nNota 3: " + nota3);
        System.out.println("Média de aproveitamento: " + mediaAp);
        System.out.println("Conceito: " + conceito);
        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("Aprovado.");
        } else if (conceito.equals("D") || conceito.equals("E")) {
            System.out.println("Reprovado.");
        }

        System.out.println("\n Exercicio 13 e 14:");
        System.out.println("Informe o numero de lados de um polígono regular:");
        int nLados = sc.nextInt();
        if (nLados < 3) {
            System.out.println("NÃO É UM POLÍGONO");
        } else if (nLados > 5) {
            System.out.println("POLÍGONO NÃO IDENTIFICADO");
        } else {
            System.out.println("Informe a medida dos lados (em centimetros):");
            double lado = sc.nextDouble();
            switch (nLados) {
                case 3:
                    System.out.println("TRIÂNGULO\n área: " + ((Math.sqrt(3) * (lado * lado)) / 4) + " cm");
                    break;
                case 4:
                    System.out.println("QUADRADO\n área: " + (lado * lado) + " cm");
                    break;
                case 5:
                    System.out.println("PENTÁGONO\n área: " + (Math.sqrt(5 * (5 + (2 * Math.sqrt(5))) * lado * lado)) / 4 + " cm");
                    break;
                default:
                    break;
            }
        }
        System.out.println("\n Exercício 15:");
        System.out.println("Informe os ângulos do triângulo:");
        System.out.println("1:");
        int angle1 = sc.nextInt();
        System.out.println("2:");
        int angle2 = sc.nextInt();
        System.out.println("3:");
        int angle3 = sc.nextInt();
        if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
            System.out.println("O triângulo é retângulo");
        }
        if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
            System.out.println("O triângulo é obtuso");
        }
        if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
            System.out.println("O triângulo é acutângulo");
        }
    }
}
