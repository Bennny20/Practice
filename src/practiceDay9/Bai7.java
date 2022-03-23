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
public class Bai7 {

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

    public static void sort(int arr[]) {
        int count;
        int viTriChanCuoi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0) {
                int temp = arr[i];
                for (int j = i; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                viTriChanCuoi = i;
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = i; j > viTriChanCuoi; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[viTriChanCuoi] = 0;
                
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        inputValue(arr1);
        printValue(arr1);
        System.out.println("");
        sort(arr1);
        printValue(arr1);

    }
}
