/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceDay10.Bai1;

/**
 *
 * @author phien
 */
public class Number {

    private int number1;
    private int number2;

    public Number() {
    }

    public Number(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int Tong() {
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        return number1 + number2;
    }

    public int Hieu() {
        return number1 - number2;
    }

    public int Tich() {
        return number1 + number2;
    }

    public float Thuong() {
        return (float) number1 / number2;
    }
}
