/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceDay9;

import java.util.Scanner;

/**
 *
 * @author phien
 */
public class Bai3 {

    static Scanner sc = new Scanner(System.in);

    public static void inputValue(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void printValue(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void printValueSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mang sau khi sap sep: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        inputValue(arr1);
        printValue(arr1);
        System.out.println("");

        printValueSort(arr1);

    }
}
