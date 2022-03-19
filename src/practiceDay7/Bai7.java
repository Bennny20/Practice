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
public class Bai7 {

    public static void inputValue(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input " + i + ": ");
            arr[i] = sc.nextInt();
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

    public static void MaxValue(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (check(arr[i])) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        if (max != 0) {
            System.out.println("số nguyên tố lớn nhất trong mảng: " + max );
        } else {
            System.out.println("mảng không có số nguyên tố");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[7];
        inputValue(arr1);
        MaxValue(arr1);
    }
}
