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
public class StudentDTO {

    public void printMenu() {
        System.out.println("------------------------------");
        System.out.println("-----STUDENT MANAGEMENT SYSTEM-----");
        System.out.println("1. Find Student Max Average");
        System.out.println("2. Display All Students");
        System.out.println("3. Sort Student");
        System.out.println("4. Find Student");
        System.out.println("5. Add New Student");
        System.out.println("6. Remove Student");
        System.out.println("7. Update Student");
        System.out.println("8. Exit");
    }

    public double findStudentMaxAverage(Student listStudent[]) {
        double max = listStudent[0].calculateAverage();
        for (int i = 1; i < listStudent.length; i++) {
            if (listStudent[i].calculateAverage() > max) {
                max = listStudent[i].calculateAverage();
            }
        }
        return max;
    }

    public void displayAllStudents(Student listStudent[]) {
        for (Student listStudent1 : listStudent) {
            listStudent1.displayInfo();
        }
    }

    public void sortStudent(Student listStudent[]) {
        for (int i = 0; i < listStudent.length - 1; i++) {
            for (int j = i + 1; j < listStudent.length; j++) {
                if (listStudent[i].calculateAverage() > listStudent[j].calculateAverage()) {
                    Student temp = listStudent[i];
                    listStudent[i] = listStudent[j];
                    listStudent[j] = temp;
                }
            }
        }
        displayAllStudents(listStudent);
    }

    public void findStudentById(Student listStudent[], int id) {
        int count = 0;
        for (Student listStudent1 : listStudent) {
            if (listStudent1.getId() == id) {
                System.out.println("ID: " + listStudent1.getId());
                System.out.println("Name: " + listStudent1.getName());
                System.out.println("Day of bith: " + listStudent1.getDob());
                System.out.println("Math: " + listStudent1.getMath());
                System.out.println("Literature: " + listStudent1.getLiterature());
            } else {
                count++;
            }
        }
        if (count == listStudent.length) {
            System.out.println("Khong co học sinh nay");
        }
    }

    public void updateStudentById(Student listStudent[], int id) {
        int count = 0;
        for (Student listStudent1 : listStudent) {
            if (listStudent1.getId() == id) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Update id: ");
                listStudent1.setId(Integer.parseInt(sc.nextLine()));
                System.out.print("Update name: ");
                listStudent1.setName(sc.nextLine());
                System.out.print("Update day of bith: ");
                listStudent1.setDob(sc.nextLine());
                System.out.print("Update math: ");
                listStudent1.setMath(sc.nextInt());
                System.out.print("Update literature: ");
                listStudent1.setLiterature(sc.nextInt());
                System.out.println("Update success!");
            } else {
                count++;
            }
        }
        if (count == listStudent.length) {
            System.out.println("Khong co học sinh nay");
        }
    }

    public Student[] addStudent(Student listStudent[], Student student, int indexAdd) {
        Student[] newList = new Student[listStudent.length + 1];

        for (int i = 0; i < indexAdd; i++) {
            newList[i] = listStudent[i];
        }

        newList[indexAdd] = student;

        for (int i = indexAdd + 1; i < newList.length; i++) {
            newList[i] = listStudent[i - 1];
        }

        return newList;

    }

    public Student[] removeStudentByIndex(Student listStudent[], int index) {
        Student[] newList = new Student[listStudent.length - 1];

        int removedIndex = 0;
        for (int i = 0; i < listStudent.length; i++) {
            if (i == removedIndex) {
                continue;
            }
            newList[removedIndex] = listStudent[i];
            removedIndex++;
        }
        return newList;
    }

}
