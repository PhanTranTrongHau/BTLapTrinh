/*
* ngày tạo: Oct 21, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan6;

public class CircleTestDrive {
    
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.amThanh = "Nhac tre";
        circle.click = false;
        circle.kichThuoc = 5.3;
        System.out.println("Am thanh cua hinh tron: "+circle.amThanh);
        System.out.println("Da duoc click: "+circle.click);
        System.out.println("Ban kinh hinh tron: "+circle.kichThuoc);

        Circle circle1 = new Circle("Tru tinh",true,4.5);
        System.out.println("Hinh tron co: Nhac "+circle1.amThanh+"Duoc click"+circle1.click+"Ban kinh"+circle1.kichThuoc);
        
        Circle circle2 = new Circle("Rap",true,10);
        circle.amThanhPhatra();
        circle.xoay360Do(4);

        double size = circle2.getSize();
        System.out.println("hinh tron: "+circle2.getSize());

        System.out.println("Kich Thuoc Hinh Tron : "+circle.coLon);
        Circle circle3 = new Circle();
        System.out.println("Kich Thuoc Hinh Tron :"+circle3.coLon);

        Circle dienTich = new Circle();
        double S1 = dienTich.dienTichHinhTron(10);
        System.out.println("Dien Tich Hinh Tron: "+S1);
    }
}
