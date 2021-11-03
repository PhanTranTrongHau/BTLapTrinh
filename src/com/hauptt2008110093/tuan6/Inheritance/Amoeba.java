/*
* ngày tạo: Oct 21, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan6.Inheritance;

public class Amoeba extends Shape {
   
    int x; 
    int y;

public Amoeba(String s){
    super(s);
}
public Amoeba(String s, int xx, int yy){
    super(s);
    x = xx;
    y = yy;
}
public void rotate(){
    System.out.println("Xoay theo toa do x: "+ x +" y:"+y);
}

public void playSound(){
    System.out.println("Phat ra am thanh co ten "+getSound());
}
}