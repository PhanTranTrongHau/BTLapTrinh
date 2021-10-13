/*
* ngày tạo: Oct 14, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan5;

public class Computer {
    String nhaSanXuat;
    int namSanXuat;
    String heDienHanh;
    String ram;
    String CPU;
    int namBaoHanh;
    Computer(){
        nhaSanXuat = ("Acer");
        namSanXuat = 2018;
        heDienHanh = ("Windows 10");
        ram = ("8GB");
        CPU = ("Core i7 - 4770s");
        namBaoHanh = 3;

    }
    Computer(String a,String b, String c, String d){
        nhaSanXuat = a;
        heDienHanh = b;
        ram = c;
        CPU = d;
    }
    Computer(int a, int b){
        namSanXuat = a;
        namBaoHanh = b;
    }
}
