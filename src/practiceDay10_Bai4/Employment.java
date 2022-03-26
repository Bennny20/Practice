/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceDay10_Bai4;

import java.util.Scanner;

/**
 *
 * @author phien
 */
public class Employment {

    private String name;
    private int age;
    private double salary;
    private int workingHours;

    public Employment() {
    }

    public Employment(String name, int age, double salary, int workingHours) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workingHours = workingHours;
    }

    public void inputInfo() {
        System.out.println("Input ìnfo: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input age: ");
        age = sc.nextInt();
        System.out.print("Input Salary: ");
        salary = sc.nextDouble();
        System.out.print("Input working hours: ");
        workingHours = sc.nextInt();
    }

    public void displayInfo() {
        System.out.println("name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Working hours: " + workingHours);
    }

    public double calculateBonus(){
       
        if (workingHours < 100) {
             return 0;
        } else if(workingHours < 200){
            return (double)salary * 0.1;
        }else{
            return (double)salary * 0.2;
        }
    }
}
