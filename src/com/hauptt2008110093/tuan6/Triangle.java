/*
* ngày tạo: Oct 21, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan6;

public class Triangle {
    
    String amThanh;
    boolean click;
    double kichThuoc;
    int size;

    Triangle(){}
Triangle(String a, boolean b, double c){
    amThanh = a;
    click = b;
    kichThuoc = c;
}
void xoay360Do(int xoay){
    while(xoay>0){
        System.out.println("Hinh Tam Giac xoay ");
        xoay --;
    }
}
void amThanhPhatra(){
    System.out.println("Phat am thanh HTG.hif");
}
}