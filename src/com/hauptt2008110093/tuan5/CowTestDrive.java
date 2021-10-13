/*
* ngày tạo: Oct 14, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan5;

public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow;
        cow = new Cow();
        System.out.println("Tuoi cua bo:"+cow.tuoi);
        cow = new Cow(15);
        System.out.println("Khoi luong cua bo:"+cow.khoiLuong+"kg");
    }
}
