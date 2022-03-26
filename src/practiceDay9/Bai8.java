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
public class Bai8 {

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

    public static void addElement(int arr[], int length, int local) {
        System.out.print("Input element want to add:");
        int element = sc.nextInt();
        for (int i = length; i >= local; i--) {
            arr[i] = arr[i - 1];
        }
        arr[local] = element;
        length++;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = new int[n];
        inputValue(arr1);
        printValue(arr1);
        int local, element;
        do {
            System.out.print("Input local want to add: ");
            local = sc.nextInt();
        } while (local < 0 || local > n);

        addElement(arr1, n, local);
        System.out.println("After add");
        printValue(arr1);

    }
}
