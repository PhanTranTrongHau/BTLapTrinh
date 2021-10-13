/*
* ngày tạo: Oct 14, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan5;

public class Book {
    double gia;
    String nhaXuatBan;
    int namXuatBan;
    double giaBan;
    int soLuong;
    String loai;
    Book(){
        gia = 25.000;
        nhaXuatBan = ("Xuan Quynh");
        namXuatBan = 1990;
        giaBan = 40.000;
        soLuong = 200;
        loai = ("Tho");

    }
    Book(double a, double b, int c){
        gia = a;
        giaBan = b;
        soLuong = c;
    }
}
