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
public class PracticeDay4_7 {

    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 0) {
                sum += i;
                System.out.print(i + "\t");
            }
        }
        System.out.println("\nTong cac so chan uoc so lon nhat cua n: " + sum);
    }
}
