/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceDay11_Bai2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author phien
 */
public class ShopService {

    public void menu() {
        System.out.println("-----PRODUCT MANAGEMENT SYSTEM-----");
        System.out.println("1. Add new Product");
        System.out.println("2. Remove Product");
        System.out.println("3. Iterate product List");
        System.out.println("4. Search product");
        System.out.println("5. Sort product");
        System.out.println("6. Exit");
    }

    public void sortProduct(Product[] listProducts) {
        for (int i = 0; i < listProducts.length - 1; i++) {
            for (int j = i + 1; j < listProducts.length; j++) {
                if (listProducts[i].getPrice() >
                        listProducts[j].getPrice()) {
                    Product temp = listProducts[i];
                    listProducts[i] = listProducts[j];
                    listProducts[j] = temp;
                }

            }
        }
    }

    public boolean searchProduct(Product[] listProducts, String indexSearch) {
        boolean check = false;
        for (Product listProduct : listProducts) {
            if (listProduct.getName().equals(indexSearch)) {
                listProduct.displayInfo();
                check = true;
            }
        }
        return check;
    }

    public Product[] removeProductByName(Product[] listProducts, String nameProductRemove) {
        Product[] newList = new Product[listProducts.length - 1];
        int indexRemovedArr = 0;
        for (Product listProduct : listProducts) {
            if (listProduct.getName().equals(nameProductRemove)) {
                continue;
            }
            newList[indexRemovedArr] = listProduct;
            indexRemovedArr++;
        }
        return newList;
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

    public void showAllProduct(Product[] listProduct) {
        for (Product listProduct1 : listProduct) {
            listProduct1.displayInfo();
        }
    }

    public Product[] addProduct(Product[] listProduct, Product newProduct) {
        listProduct = Arrays.copyOf(listProduct, listProduct.length + 1);
        listProduct[listProduct.length - 1] = newProduct;
        return listProduct;
    }

}
