/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceDay11_Bai1;

import java.util.Scanner;

/**
 *
 * @author phien
 */
public class Student {

    private int id;
    private String name;
    private String dob;
    private int math;
    private int literature;

    public Student() {
    }

    public Student(int id, String name, String dob, int math, int literature) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.math = math;
        this.literature = literature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getLiterature() {
        return literature;
    }

    public void setLiterature(int literature) {
        this.literature = literature;
    }
    
   public void inputInfo() {
        System.out.println("Input info for student");
        Scanner sc = new Scanner(System.in);
        System.out.print("input id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("input name: ");
        name = sc.nextLine();
        System.out.print("input day of bith: ");
        dob = sc.nextLine();
        System.out.print("input math: ");
        math = sc.nextInt();
        System.out.print("input literature: ");
        literature = sc.nextInt();
    }
    
    public void displayInfo (){
        System.out.printf("ID: %5d\tName: %-20s\tDOB: %-20s\tMath: %5d\tLiterature: %5d\n"
                ,this.id, this.name, this.dob, this.math, this.literature);
    }
    
    public double calculateAverage (){
        return (math + literature) / 2;
    }
}
