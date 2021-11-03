/*
* ngày tạo: Nov 04, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan8;

import java.util.Scanner;

public class BT3 {
       public String tenSP;
       public double donGia;
       public double giamGia;
    public BT3(String tenSp, double dongia, double giamgia){
        this.tenSP = tenSp;
        this.donGia = dongia;
        this.giamGia = giamgia;
    
    }
    public BT3(String tenSp, double dongia){
        this(tenSp,dongia,0);
    }
    private double getThueNhapKhau(double a , double b){
          a = donGia;
          b = giamGia;
          return (a - b)*10/100;
       }
    public void nhap(){
          
        }
    public void xuat(){
            System.out.println("Ten Sp: "+tenSP+", Gia Sp "+donGia+" , Giam gia"+giamGia+", Thue sp"+getThueNhapKhau(20000, 1000));
        }
    }           

