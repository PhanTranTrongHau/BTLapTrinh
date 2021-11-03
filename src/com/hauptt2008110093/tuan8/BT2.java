/*
* ngày tạo: Nov 04, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan8;

import java.util.Scanner;
public class BT2 {

        String tenSP;
            double donGia;
            double giamGia;
           Scanner scanner = new Scanner(System.in);
        double getThueNhapKhau(double a , double b){
              a = donGia;
              b = giamGia;
              return (a - b)*10/100;
           }
        void nhap(){
               tenSP = scanner.nextLine();
               donGia = scanner.nextDouble();
               giamGia = scanner.nextDouble();
            }
        void xuat(){
                System.out.println("Ten Sp: "+tenSP);
                System.out.println("Gia sach: "+donGia);
                System.out.println("Giam gia: "+giamGia);
                System.out.println("thue sp: "+getThueNhapKhau(200000,2000));
            }
        }  