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
public class Book {
    char code;
    String title;
    String author;
    int price;

    public Book() {
    }

    public Book(char code, String title, String author, int price) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public void displayInfo(){
        System.out.println("Code: " +code);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public int getPrice() {
        return price;
    }
    
    
}
