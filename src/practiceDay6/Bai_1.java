/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceDay6;

import java.util.Scanner;

/**
 *
 * @author phien
 */
public class Bai_1 {

    public static double sum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double) i / (i + 1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap gia tri n: ");
        do {
            n = sc.nextInt();
            if (n < 0) {
                System.out.print("n phai lon hon 0. Nhao lai: ");
            }
        } while (n < 0 );

        double sum = sum(n);
        System.out.println(sum);
    }
}
