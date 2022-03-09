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
public class PracticeDay4_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia tri n: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (check(i)) {
                System.out.print(i + "\t");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("\nKhong co so nguyen to nho hon n");
        } else {
            System.out.println("\nCo " + count + " so nguyen to nho hon n");
        }

    }

    public static boolean check(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
