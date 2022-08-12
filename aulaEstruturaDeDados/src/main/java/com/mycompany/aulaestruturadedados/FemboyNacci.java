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
public class FemboyNacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        int nm2 = 0;
        int nm1 = 1;
        int n;
        System.out.println("Input:");
        input = sc.nextInt();

        for (int i = 0; i < input;) {
            for (int j = 0; j < input;) {
                if (j == 0) {
                    System.out.print(0);
                    j++;
                } else if (j == 1) {
                    System.out.print(0 + " " + 1);
                    j++;
                } else {
                    n = nm1 + nm2;
                    System.out.print(n + " ");
                    nm2 = nm1;
                    nm1 = n;
                    j++;
                }
            }
            if (i == 0) {
                System.out.print(0);
                i++;
            } else if (i == 1) {
                System.out.print(0 + " " + 1);
                i++;
            } else {
                n = nm1 + nm2;
                System.out.println(n + " ");
                nm2 = nm1;
                nm1 = n;
                i++;
            }
        }
    }

}
