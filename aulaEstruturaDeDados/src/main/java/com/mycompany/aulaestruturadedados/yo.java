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
public class yo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3;

        System.out.println("n1:");
        num1 = sc.nextDouble();
        System.out.println("n2:");
        num2 = sc.nextDouble();
        System.out.println("n3:");
        num3 = sc.nextDouble();

        if (num1 < num2 + num3) {
            System.out.println("Não é maior");
        } else {
            System.out.println("É maior");
        }

        System.out.println("Velocidade do carro:");
        int carKm = sc.nextInt();
        System.out.println("Velocidade máxima:");
        int maxKm = sc.nextInt();
        int difKm = carKm - maxKm;
        if ((difKm > 0) && (difKm <= 10)) {
            System.out.println("50 real kkk");
        } else if ((difKm > 10) && (difKm <= 30)) {
            System.out.println("100 reais ishe o.o");
        } else if (difKm > 30) {
            System.out.println("300 pila lek, se fodeu kekek");
        } else {
            System.out.println("Você n foi multado fml");
        }
        double n[] = new double[3];
        double aux;
        System.out.println("Enter 3 values:");
        System.out.println("Enter the 1º value:");
        n[0] = sc.nextDouble();
        System.out.println("Enter the 2º value:");
        n[1] = sc.nextDouble();
        System.out.println("Enter the 3º value:");
        n[2] = sc.nextDouble();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (n[i] < n[j]) {
                    aux = n[i];
                    n[i] = n[j];
                    n[j] = aux;
                }
            }
        }
        System.out.println("in ascending order: " + n[0] + " " + n[1] + " " + n[2]);

        System.out.println("Enter a year:");
        int year = sc.nextInt();
        if ((year % 400 == 0) || ((year % 100 == 0) && (year % 4 != 0))) {
            System.out.println("The year entered is a bisext");
        } else {
            System.out.println("The year entered is not bisexual");
        }

    }

}
