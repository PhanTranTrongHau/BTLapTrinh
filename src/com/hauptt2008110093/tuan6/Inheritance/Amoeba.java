/*
* ngày tạo: Oct 21, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan6.Inheritance;

public class Amoeba {
   
    int x; 
    int y;
public Amoeba(String s){}

public Amoeba(String s, int xx, int yy){
    x = xx;
    y = yy;
}
void rotate(){
    System.out.println("Xoay theo toa do x: "+ x +" y:"+y);
}
void playSound(){
    System.out.println(" Phat ra file am thanh ten ");
}
}