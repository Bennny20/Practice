/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceDay11_Bai2;

import java.util.Scanner;

/**
 *
 * @author phien
 */
public class Product {

    private String name;
    private String description;
    private double price;
    private int rate;

    public Product() {
    }

    public Product(String name, String description, double price, int rate) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void inputInfo(Product newProduct) {
        System.out.println("Nhap thong tin cho san pham: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        newProduct.setName(sc.nextLine());
        System.out.print("Description: ");
        newProduct.setDescription(sc.nextLine());
        System.out.print("Price: ");
        newProduct.setPrice(sc.nextInt());
        System.out.print("Rate: ");
        newProduct.setRate(sc.nextInt());
    }

    public void displayInfo() {
        System.out.printf("Name: %-20s\t Description: %-20s\t Price: %5.2f\t Rate: %5d\n",
                 name, description, price, rate);
    }
}
