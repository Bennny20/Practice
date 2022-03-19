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
public class Bai3 {

    public static void inputValue(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static int minValue(int arr[]) {
        int min = arr[0];
        int cont = 0;
        for (int i = 1; i < arr.length; i++) {
            if (min < 0){
                min = arr [1];
            }
            if (arr[i] > 0) {
                cont++;
                if (arr[i] < min && cont != 0) {
                    min = arr[i];
                }
            }
        }
        if(cont == 0){
            min = -1;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[8];
        inputValue(arr1);
        int min = minValue(arr1);
        if (min != -1) {
            System.out.println("Min value: " + min);
        } else {
            System.out.println("No value");
        }

    }
}
