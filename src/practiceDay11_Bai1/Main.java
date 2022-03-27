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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input length: ");
       // int n = sc.nextInt();
        int choice;
        Student[] listStudent = new Student[4];
        listStudent[0] = new Student(1, "Ten 1", "01/01", 8, 8);
        listStudent[1] = new Student(2, "Ten 2", "02/01", 9, 9);
        listStudent[2] = new Student(3, "Ten 3", "03/01", 7, 7);
        listStudent[3] = new Student(4, "Ten 4", "03/01", 6, 6);
//        for (Student listStudent1 : listStudent) {
//            Student student = new Student();
//            listStudent1.inputInfo();
//        }
        StudentDTO dto = new StudentDTO();
        boolean isExit = false;
        do {
            dto.printMenu();
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Diem trung binh hoc sinh cao nhat: "
                            + dto.findStudentMaxAverage(listStudent));
                    break;
                case 2:
                    dto.displayAllStudents(listStudent);
                    break;
                case 3:
                    dto.sortStudent(listStudent);
                    break;
                case 4:
                    System.out.print("Nhap id học sinh muon tim: ");
                    int id = sc.nextInt();
                    dto.findStudentById(listStudent, id);
                    break;
                case 5: 
                    System.out.print("Nhap vi tri muon them: ");
                    int vitri = sc.nextInt();
                    Student newStudent = new Student();
                    newStudent.inputInfo();
                    Student[] newList = dto.addStudent(listStudent, newStudent,vitri);
                    listStudent = new Student[newList.length];
                    for (int i = 0; i < newList.length; i++) {
                        listStudent[i] = newList[i];
                    }
                    System.out.println("Add success!!!");
                    break;
                case 6: 
                    System.out.print("Nhap vi tri muon them: ");
                    int indexRemove = sc.nextInt();
                    Student[] removeList = dto.removeStudentByIndex(listStudent, indexRemove);
                    listStudent = new Student[removeList.length];
                    for (int i = 0; i < removeList.length; i++) {
                        listStudent[i] = removeList[i];
                    }
                    System.out.println("Delete success!!!");
                    dto.displayAllStudents(listStudent);
                    
                    break;
                case 7:
                    System.out.print("Nhap id học sinh muon tim: ");
                    int idUpdare = sc.nextInt();
                    dto.updateStudentById(listStudent, idUpdare);
                    break;
                case 8:
                    isExit = true;
                    break;
                default:
                    break;

            }
        } while (isExit == false);

    }
}
