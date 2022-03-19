/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceDay7;

import java.util.Scanner;

/**
 *
 * @author phien
 */
public class Bai8 {

    public static void inputValue(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static int UCLN(int x, int y) {
        if (x < y) {
            for (int i = x; i >= 1; i--) {
                if (x % i == 0 && y % i == 0) {
                    return i;
                }
            }
        } else {
            for (int i = y; i >= 1; i--) {
                if (x % i == 0 && y % i == 0) {
                    return i;
                }
            }
        }
        return x;
    }

    public static int UCLN1(int arr[]) {
        int x = arr[0];
        for (int i = 1; i < arr.length; i++) {
            x = UCLN(x, arr[i]);
        }
        return x;
    }
    
    public static void main(String[] args) {
        int[] arr1 = new int[4];
        inputValue(arr1);
        
        int UCLN = UCLN1(arr1);
        System.out.println("UCLN : " + UCLN);
    }
}
