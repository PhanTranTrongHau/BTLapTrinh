/*
* ngày tạo: Sep 29, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.lab1;

import java.util.Scanner;
public class LT1Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh hinh lap phuong");
        double canh = scanner.nextDouble();
        double theTich = Math.pow(canh, 3);
        System.out.printf("The tich hinh lap phuong la:%.2f ",theTich);

    }
}
