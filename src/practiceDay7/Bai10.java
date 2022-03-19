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
public class Bai10 {

    public static void inputValue(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void printValue(int arr[], int x, int y) {
        for (int i = 0; i < arr.length; i++) {
            if (x <= arr[i] && arr[i] <= y) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int x, y;
        int[] arr1 = new int[7];
        inputValue(arr1);
        Scanner sc = new Scanner(System.in);
        System.out.print("input value x: ");
        x = sc.nextInt();
        System.out.print("input value y: ");
        y = sc.nextInt();

        printValue(arr1, x, y);

    }
}
