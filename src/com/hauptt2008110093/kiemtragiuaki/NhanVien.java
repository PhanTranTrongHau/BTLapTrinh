/*
* ngày tạo: Nov 04, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.kiemtragiuaki;

public class NhanVien extends Nguoi {
    private float heSoLuong;
    /**
     * @return the heSoLuong
     */
    public float getHeSoLuong() {
        return heSoLuong;
    }
    /**
     * @param heSoLuong the heSoLuong to set
     */
    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public NhanVien(){}
    public NhanVien(String hoTen, String diaChi, Float heSoLuong){
        super(hoTen, diaChi);
        this.heSoLuong = heSoLuong;
    }
    protected float tinhLuong(float a){
        
        return this.heSoLuong*1500000;
    }
    @Override
    public String toString() {
        return super.toString()+"He so luong nhan vien la:"+this.heSoLuong;
    }
}
