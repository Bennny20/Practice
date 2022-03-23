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
public class Bai2 {

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

    public static void printValueLess100(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 100) {
                System.out.print(arr[i] + "\t");
            }
        }
    }

    

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        inputValue(arr1);
        printValue(arr1);
        System.out.println("");
        System.out.print("Print value less 100: ");
        printValueLess100(arr1);
       
    }
}
