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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        Product[] listProducts = new Product[5];
        listProducts[0] = new Product("San pham 1", "Dien thoai 1", 10000000, 1);
        listProducts[1] = new Product("San pham 3", "Dien thoai 3", 30000000, 3);
        listProducts[2] = new Product("San pham 2", "Dien thoai 2", 20000000, 2);
        listProducts[3] = new Product("San pham 5", "Dien thoai 5", 50000000, 5);
        listProducts[4] = new Product("San pham 6", "Dien thoai 6", 60000000, 6);
        ShopService service = new ShopService();
        do {
            service.menu();
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Product newProdcut = new Product();
                    service.inputInfo(newProdcut);
                    listProducts = service.addProduct(listProducts, newProdcut);
                    System.out.println("Add success!!!!");
                    System.out.println("--------------");
                    break;
                case 2:
                    System.out.print("Nhap ten san pham muon xoa: ");
                    String indexRemove = sc.nextLine();
                    boolean check = false;
                    for (int i = 0; i < listProducts.length; i++) {
                        if (listProducts[i].getName().equals(indexRemove)) {
                            check = true;
                        }
                    }

                    if (check) {
                        Product[] newList = service.removeProductByName(listProducts, indexRemove);
                        listProducts = Arrays.copyOf(newList, listProducts.length - 1);
                        System.out.println("Remove success!!!1");
                    } else {
                        System.out.println("Not found product!!!");
                    }
                    break;
                case 3:
                    service.showAllProduct(listProducts);
                    break;
                case 4:
                    System.out.print("Nhap ten san pham muon tim: ");
                    String indexSearch = sc.nextLine();
                    boolean checkSearch = service.searchProduct(listProducts, indexSearch);
                    if (checkSearch) {
                        System.out.println("Success!!!");
                    } else {
                        System.out.println("Not found product!!!");
                    }
                    break;
                case 5:
                    service.sortProduct(listProducts);
                    service.showAllProduct(listProducts);
                    break;
                case 6:
                    isExit = true;
                    System.out.println("Good bye, see you again!!!");
                    break;
            }
        } while (!isExit);

    }
}
