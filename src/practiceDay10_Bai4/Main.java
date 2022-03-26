 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceDay10_Bai4;

/**
 *
 * @author phien
 */
public class Main {
    public static void main(String[] args) {
        Employment e1 = new Employment();
        e1.inputInfo();
        Employment e2 = new Employment();
        e2.inputInfo();
        Employment e3 = new Employment();
        e3.inputInfo();
        
        System.out.println("Employment 1:");
        e1.displayInfo();
        System.out.println("Employment 2:");
        e2.displayInfo();
        System.out.println("Employment 3:");
        e3.displayInfo();
        
        double b1 = e1.calculateBonus();
        System.out.println("Bonus employment 1: " + b1);
        System.out.println("Bonus employment 1: " + e2.calculateBonus());
        System.out.println("Bonus employment 1: " + e3.calculateBonus());
        
    }
}
