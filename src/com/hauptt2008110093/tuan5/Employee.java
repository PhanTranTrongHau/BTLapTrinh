/*
* ngày tạo: Oct 14, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan5;

public class Employee {
    String tenNhanVien;
    int luong;
    String diaChi;
    String boPhanLamViec;
    String ngaySinh;

    Employee(){
        tenNhanVien = new String("Tran Van A");
        luong = 4000000;
        diaChi = new String("ABC,Q10,Tp.HCM");
        boPhanLamViec = ("Maketing");
        ngaySinh = ("20.09.1993");

    }
    Employee(int a){
        luong = a;
    }
    Employee(String b){
        boPhanLamViec = b;
    }
    
}
