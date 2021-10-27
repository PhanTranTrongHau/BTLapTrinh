/*
* ngày tạo: Oct 27, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan6.Inheritance;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.rotate();
        circle.playSound();
        Square square = new Square();
        square.rotate();
        square.playSound();
        Triangle triangle = new Triangle();
        triangle.rotate();
        triangle.playSound();
        Amoeba amoeba = new Amoeba("amoeba.hif", 8, 10);
        amoeba.rotate();
        amoeba.playSound();
    }
}
