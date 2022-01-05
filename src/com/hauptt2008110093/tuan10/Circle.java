/*
* ngày tạo: Nov 11, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan10;

public class Circle extends Shape {
    private int radius;
    public Circle(int _x, int _y, int _r){
        super(_x, _y);
        radius = _r;
    }
    public void draw(){
        System.out.println("Dra circle at"+x+", "+y);
    }
    public void erase(){
        System.out.println("Erase circle at"+x+ " ,"+y);
    }
}
