/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.aulaestruturadedados;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class AulaEstruturaDeDados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int repeticoes, i = 1;

        System.out.println("Valor:");
        repeticoes = sc.nextInt();
        System.out.println("\nTaboada:");
        while (i < (repeticoes + 1)) {
            System.out.println(" 5x" + i + " = " + (5 * i));
            //i = i + 1;
            //i += 1;
            i++;

        }

    }
}
