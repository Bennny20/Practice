/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceDay10_Bai3;

/**
 *
 * @author phien
 */
public class Main {

    public static void main(String[] args) {
        Book b1 = new Book('a', "Minh sinh ra dau phai de buon", "Hamlet Truong", 190000);
        Book b2 = new Book('B', "Doremon", "Hong nho", 90000);
        Book b3 = new Book('c', "Doremon2", "Khong nho", 95000);

        int price1 = b1.getPrice();
        System.out.println("Price of book 1: " + price1);
        int price2 = b2.getPrice();
        System.out.println("Price of book 2: " + price2);
        int price3 = b3.getPrice();
        System.out.println("Price of book 3: " + price3);

        System.out.println("INFO LIST BOOK");
        b1.displayInfo();
        System.out.println("================");
        b2.displayInfo();
        System.out.println("================");
        b3.displayInfo();
    }
}
