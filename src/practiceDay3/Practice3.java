/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceDay3;

/**
 *
 * @author phien
 */
public class Practice3 {

    public static void main(String[] args) {
        int a = 12;
        int b = 20;
        int c = 18;
        
        System.out.println("So " + a );
        System.out.println("So " + b );
        System.out.println("So " + c );
        // Cau 1
        System.out.println("===Cau 1===");
        if (a % 2 == 0) {
            System.out.println("So " + a + " la so chan.");
        } else {
            System.out.println("So " + a + " la so le.");
        }
        
        //Cau 2
        System.out.println("===Cau 2===");
        if (a >= b && a >= c) {
            System.out.println("a la so lon nhat");
        } else if (b >= c) {
            System.out.println("b la so lon nhat");
        } else {
            System.out.println("c la so lon nhat");
        }

        //Cau 3
        System.out.println("===Cau 3===");
        int temp;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }
        System.out.println(a + "\t" + b + "\t" + c);
        
        //Cau 4
        System.out.println("===Cau 4===");
        if (a >= 10 && a <= 100) {
            System.out.println("a la so trong khoang 10 den 100");
        } else {
            System.out.println("a khong trong khoang 10 den 100");
        }
        
        //Cau 5
        System.out.println("===Cau 5===");
        int luongCoBan = 650000;
        int soThang = 20;
        System.out.println("So thang: " + soThang);
        double tongLuong;
        if (soThang < 12) {
            tongLuong = 1.92 * luongCoBan;
            System.out.println("Luong: 650000 * " + 1.92 + " = " + tongLuong);
        } else if (soThang < 36) {
            tongLuong = 2.34 * luongCoBan;
            System.out.println("Luong: 650000 * " + 2.34 + " = " + tongLuong);
        } else if (soThang < 60) {
            tongLuong = 3 * luongCoBan;
            System.out.println("Luong: 650000 * " + 3 + " = " + tongLuong);
        } else {
            tongLuong = 4.5 * luongCoBan;
            System.out.println("Luong: 650000 * " + 4.5 + " = " + tongLuong);
        }
        
        //Cau 6
        System.out.println("===Cau 6===");
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Nghiem cua phuong trinh " + a + "x + " + b +" = 0 nay la: " + (double)-b / a);
        }
        
        //Cau 7
        System.out.println("===Cau 7===");
        int thang = 2, nam = 2020;
        System.out.println("Thang " + thang + " nam " + nam);
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + thang +" co 31 ngayf");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang " + thang +" co 30 ngayf");
                break;
            case 2:
                if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
                    System.out.println("Thang " + thang +" nam " + nam + " co 29 ngay");
                    break;
                }else {
                    System.out.println("Thang " + thang +" nam " + nam + " co 28 ngay");
                    break;
                }
            default:
                break;
        }
    }
}
