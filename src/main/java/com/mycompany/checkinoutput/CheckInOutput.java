package com.mycompany.checkinoutput;
import java.util.Scanner;

public class CheckInOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        Integer age = scanner.nextInt();
        System.out.println("Nhap nam sinh:");
        Integer year = scanner.nextInt();
        System.out.println("Nhap gioi tinh: ");
        String sex = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Nhap GPA: ");
        float gpa =  scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Nhap que quan: ");
        String homeTown = scanner.nextLine();   
}
}
