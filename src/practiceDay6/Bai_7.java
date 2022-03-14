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
public class Bai_7 {

    public static int chuSoLonNhat(int n) {
        int max = 0;
        while (n > 0) {
            int temp = n % 10;
            if (temp > max) {
                max = temp;
            }
            n /= 10;
        }
        return max;
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
        int ketQua = chuSoLonNhat(n);
        System.out.println("Ket qua: " + ketQua);
    }
}
