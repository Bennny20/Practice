/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceDay4;

import java.util.Scanner;

/**
 *
 * @author phien
 */
public class PracticeDay4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = sc.nextLine();
        System.out.print("Input your math score: ");
        double mathScore = sc.nextDouble();
        System.out.print("Input your literature score: ");
        double literatureScore = sc.nextDouble();
        System.out.println("Average: " + (mathScore + literatureScore) / 2);
    }
}
