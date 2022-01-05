/*
* ngày tạo: Nov 11, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.kiemtragiuaki;

public class QuanLyTestDrive {
    public static void main(String[] args) {
        DanhSachQuanLy danhSachQuanLy = new DanhSachQuanLy();

        NhanVien nhanVien = new NhanVien("Pham Van A", "TPHCM", 6.0f);

        HocVien hocVien = new HocVien("Pham Van B", "Q4", 8.0f, 7f);

        HocVien hocVien2 = new HocVien();


        KhachHang khachHang = new KhachHang("Tran Van C", "Q7", "Da Lat", 10000000);


        danhSachQuanLy.them(nhanVien);
        danhSachQuanLy.them(khachHang);
        danhSachQuanLy.them(hocVien);

        danhSachQuanLy.inDanhSach();

        System.out.println("so luong hoc vien " + HocVien.getSoLuongHV() );

    }
}
