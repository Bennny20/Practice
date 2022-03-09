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
public class PracticeDay4_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap gia tri n: ");
            n = sc.nextInt();
        } while (n <= 0);

        boolean check = check(n);
        if (check) {
            System.out.println("n la so ngueyn to");
        } else {
            System.out.println("n khong phai la so nguyen to");
        }
    }

    public static boolean check(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
