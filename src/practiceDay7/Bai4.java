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
public class Bai4 {

    public static void inputValue(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void minValue(int arr[]) {
        int local = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                local = i;
            }
        }
        System.out.println("Min local: " + local);

    }

    public static void main(String[] args) {
        int[] arr1 = new int[7];
        inputValue(arr1);
        minValue(arr1);
    }
}
