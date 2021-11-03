/*
* ngày tạo: Nov 04, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan8;

public class BT4TestDrive {
    public static void main(String[] args) {
        BT4 Sp1 = new BT4();
        Sp1.setdonGia(250000);
        Sp1.setgiamGia(15000);
        Sp1.settenSP("Giay");
        Sp1.xuat();
        BT4 Sp2 = new BT4();
        Sp2.setdonGia(500000);
        Sp2.setgiamGia(25000);
        Sp2.settenSP("May tinh tay");
        Sp2.xuat();
    }
}
