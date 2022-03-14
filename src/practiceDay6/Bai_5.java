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
public class Bai_5 {

    public static int printChuSoDauTien(int n) {
        int temp = n;
        int ketQua = 0;
        while (temp > 0) {
            ketQua = temp % 10;
            temp /= 10;
        }
        return ketQua;
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
        } while (n < 0);
        int ketQua = printChuSoDauTien(n);
        System.out.println("Ket qua: " + ketQua);
    }
}
