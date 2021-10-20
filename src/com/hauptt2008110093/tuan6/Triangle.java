/*
* ngày tạo: Oct 21, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan6;

public class Triangle {
    String amThanh;
    boolean duocClick;
    double kichThuoc;
    int size;

Triangle(String a, boolean b,double c){
    amThanh = a;
    duocClick = b;
    kichThuoc = c;
}
void xoay(int lanXoay){
    while(lanXoay>0){
        System.out.println("Tam giac xoay 360 do ");
        lanXoay --;
    }    
    }
void phatRaAmThanh(){
    System.out.println("ABCDEFJ ....");

}
public int getSize(){
    return size ;
}
double kichThuocTG(double chieuCao, double canhDay ){
    return (chieuCao*canhDay)/2;
}
Triangle(){
    kichThuoc ++;
}
}