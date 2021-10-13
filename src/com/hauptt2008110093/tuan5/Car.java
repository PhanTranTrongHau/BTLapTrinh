/*
* ngày tạo: Oct 14, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan5;

public class Car {
    String tenChuXe;
    String tenHang;
    String dong;
    String giayPhep;
    int xiLanh;
    Car(){
        tenChuXe = ("Tran Van B");
        tenHang = ("Audi");
        dong = ("Audi RS3");
        giayPhep = ("Da cap ngay 29.09");
        xiLanh = 400;
    }  
    Car(String a,String b,String c){
        tenHang = a;
        dong = b;
        giayPhep = c;
    }
    Car(int d){
        xiLanh = d;
    } 
}

