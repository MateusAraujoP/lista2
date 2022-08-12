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
public class PrimeNumberCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i = 2;

        System.out.println("Informe o número:");
        n = sc.nextInt();
        if (n != 0 && n != 1) {
            System.out.println("O número não é primo");
        } else {
            while ((n % i) != 0) {
                i++;
            }
            if (n == i) {
                System.out.println("O número é primo.");
            } else {
                System.out.println("O número não é primo.");
            }
        }

    }

}
