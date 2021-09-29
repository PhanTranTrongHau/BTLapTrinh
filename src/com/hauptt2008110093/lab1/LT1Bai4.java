/*
* ngày tạo: Sep 29, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.lab1;
import java.util.Scanner;


public class LT1Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 3 so a, b, c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double Delta = Math.pow(b, 2) - 4*a*c;
        System.out.printf("delta la: %.2f", Delta);
        double canDelta = Math.sqrt(Delta);
        System.out.printf("Can delta la:%.2f ",canDelta);
    }
}

    

