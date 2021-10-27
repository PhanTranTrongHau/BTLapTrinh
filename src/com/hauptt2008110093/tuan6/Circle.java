/*
* ngày tạo: Oct 21, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan6;

public class Circle {
    String amThanh;
    boolean click;
    double kichThuoc;
    int size;


Circle(String a, boolean b, double c){
    amThanh = a;
    click = b;
    kichThuoc = c;
}
void xoay360Do(int xoay){
    while(xoay>0){
        System.out.println("Hinh tron xoay ");
        xoay --;
    }
}
void amThanhPhatra(){
    System.out.println("Pla Pla Pla ....");
}
}

