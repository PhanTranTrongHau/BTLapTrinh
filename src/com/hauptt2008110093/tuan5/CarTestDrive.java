/*
* ngày tạo: Oct 14, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan5;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car;
        car = new Car();
        System.out.println("Ten Chu xe:"+car.tenChuXe);
        car = new Car("Honda","Civic","Da Cap ngay 11.1");
        System.out.println("Ten Hang xe:"+car.tenHang);
        System.out.println("Ten Dong xe:"+car.dong);
        System.out.println("Giay phep: "+car.giayPhep);
        car = new Car(500);
        System.out.println("Xi lanh xe:"+car.xiLanh);
    }
}
