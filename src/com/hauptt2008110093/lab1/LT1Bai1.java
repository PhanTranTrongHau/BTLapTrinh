package com.hauptt2008110093.lab1;

import java.util.Scanner;

public class LT1Bai1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ho va ten: ");
        String hoTen = scanner.nextLine();
        System.out.print("Diem TB: ");
        double diemTB= scanner.nextDouble();
        System.out.printf("%s %.2f diem", hoTen, diemTB);
    }
}