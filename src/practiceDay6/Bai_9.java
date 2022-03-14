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
public class Bai_9 {

    public static int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    //UCLN = a * b / BCNN
    public static int BCNN(int a, int b) {
        int UCLN = UCLN(a, b);
        return a * b / UCLN;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Nhap gia tri a: ");
        do {
            a = sc.nextInt();
            if (a < 0) {
                System.out.print("a phai lon hon 0. Nhao lai a: ");
            }
        } while (a < 0);
        System.out.print("Nhap gia tri b: ");
        do {
            b = sc.nextInt();
            if (b < 0) {
                System.out.print("b phai lon hon 0. Nhao lai b: ");
            }
        } while (b < 0);

        int BCNN = BCNN(a, b);
        System.out.println("Boi chung nho nhat cua " + a + " " + b + ": " + BCNN);
    }
}
