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
public class PyramidFibonacci {

    static long Fibonacci(int n) {
        if (n < 2) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        i = sc.nextInt();
        System.out.print(Fibonacci(i));
    }
}
