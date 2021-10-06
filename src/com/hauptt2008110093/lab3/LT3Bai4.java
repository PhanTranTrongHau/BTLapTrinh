/*
* ngày tạo: Oct 06, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.lab3;

import java.util.Scanner;

public class LT3Bai4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Nhap so luong sinh vien: ");
        int soLuong = scanner.nextInt();
        String[] a = new String[soLuong];
        for (int i=0;i<soLuong;i++) {
            System.out.printf("Họ và tên sinh viên:%d ",i);
            scanner.nextLine();
            a[i] = scanner.nextLine();
        }
        int b[] = new int[soLuong];
        for (int i=0;i<soLuong;i++) {
            System.out.printf("Điểm sinh viên:%d ",i);
            b[i] = scanner.nextInt();
        }
        for(int i=0;i<soLuong;i++) {
            if(b[i]<5) {
            System.out.println("Sinh viên: "+a[soLuong]);
            System.out.println("Điểm: "+b[i]);
            System.out.println("Học lực: yếu");
        }if(b[i]>5 && b[i]<6.5) {
            System.out.println("Sinh viên: "+a[i]);
            System.out.println("Điểm: "+b[i]);
            System.out.println("Học lực: trung bình");
        }if(b[i]>=6.5 && b[i]<7.5) {
            System.out.println("Sinh viên: "+a[i]);
            System.out.println("Điểm: "+b[i]);
            System.out.println("Học lực: khá");
        }if(b[i]>=7.5 && b[i]<9) {
            System.out.println("Sinh viên: "+a[i]);
            System.out.println("Điểm: "+b[i]);
            System.out.println("Học lực: giỏi");
        }if(b[i ]>=9) {
            System.out.println("Sinh viên: "+a[i]);
            System.out.println("Điểm: "+b[i]);
            System.out.println("Học lực: Xuất sắc");
        }
        
    }
    }
}