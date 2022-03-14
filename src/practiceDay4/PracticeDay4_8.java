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
public class PracticeDay4_8 {

    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Nhap n: ");
            n = sc.nextInt();
        } while (n < 0);
//        int temp = n;
//        while (temp > 0) {
//            if (temp % 2 == 0) {
//                sum += (temp % 10);
//            }
//            temp /= 10;
//        }
        sum = sum(n);
        System.out.println("Tong cac chu so chan: " + sum);
    }

    public static int sum(int n) {
        int sum = 0;
        int temp = n;
        while (temp > 0) {

            if (temp % 2 == 0) {
                sum += (temp % 10);
            }
            temp /= 10;
        }
        return sum;
    }
}
