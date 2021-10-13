/*
* ngày tạo: Oct 14, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan5;

public class BookTestDrive {
    public static void main(String[] args) {
        Book book ;
        book = new Book();
        System.out.println("Nha xuat ban:"+book.nhaXuatBan);
        System.out.println("Nam xuat ban: "+book.namXuatBan);
        System.out.println("The loai:"+book.loai);
        book = new Book(30.000,50.000,300);
        System.out.println("Gia cua sach:"+book.gia);
        System.out.println("Gia ban cua sach:"+book.giaBan);
        System.out.println("So luong sach:"+book.soLuong);

    }
}
