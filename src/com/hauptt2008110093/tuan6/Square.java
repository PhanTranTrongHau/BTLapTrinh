/*
* ngày tạo: Oct 21, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan6;

public class Square {
    String amThanh;
    boolean duocClick;
    double kichThuoc;
    int size;
    
Square(String a, boolean b, double c){
    amThanh = a;
    duocClick = b;
    kichThuoc = c;
}

void xoay(int lanXoay){
    while(lanXoay>0){
        System.out.println("Xoay 360 do ");
        lanXoay --;
    }    
    }
void phatRaAmThanh(){
    System.out.println("Phat ra am thanh hinhvuong.hif ....");

}

}