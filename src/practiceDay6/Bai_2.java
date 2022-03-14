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
public class Bai_2 {

    public static long tichUocSoLe(int n){
        long ketQua = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 1){
                ketQua *= i;
            }
        }
        return ketQua;
    } 
    
    public static void listUocSoLe(int n){
        long ketQua = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && i % 2 == 1){
                System.out.print(i + "\t");
            }
        }
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

        long ketqua = tichUocSoLe(n);
        System.out.println("List uoc so le: ");
        listUocSoLe(n);
        System.out.println("\nKet qua: ");
        System.out.println(ketqua);
        
    }
}
