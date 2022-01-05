/*
* ngày tạo: Nov 11, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan6;

public class ShapeTestDrive {
    public static void main(String[] args) {
        
    Square square = new Square();

    Circle circle = new Circle();

    Triangle triangle = new Triangle();
    circle.xoay(5);
    circle.phatRaAmThanh();
    square.xoay(2);
    square.phatRaAmThanh();
    triangle.xoay(3);
    triangle.amThanhPhatra();
    Amoeba amoeba = new Amoeba(5, 10);
    amoeba.rotate();
    amoeba.playSound();
    }
}
