/*
* ngày tạo: Nov 04, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.kiemtragiuaki;

public class NhanVien extends Nguoi {
    protected float heSoLuong;
    protected float tinhLuong(float a){
        a = heSoLuong;
        return a*1500000;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
