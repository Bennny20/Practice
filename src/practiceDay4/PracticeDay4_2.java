/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceDay4;

import java.util.Scanner;

/**
 *
 * @author phien
 */
public class PracticeDay4_2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Nhap so n: ");
        int n =  sc.nextInt(); 
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
