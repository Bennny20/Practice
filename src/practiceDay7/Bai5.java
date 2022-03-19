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
public class Bai5 {

    public static void inputValue(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static int LastEvenValue(int arr[]) {
        int numEven = 0;
        int cont = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                cont++;
                numEven = i;
                break;
            }
        }
        if (cont == 0) {
            numEven = -1;
        }
        return numEven;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[8];
        inputValue(arr1);
        int numEven = LastEvenValue(arr1);
        if (numEven != -1) {
            System.out.println("Local last even value: " + numEven);
        } else {
            System.out.println("No value");
        }
    }
}
