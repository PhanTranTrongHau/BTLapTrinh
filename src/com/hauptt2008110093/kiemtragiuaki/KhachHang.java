/*
* ngày tạo: Nov 04, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.kiemtragiuaki;

public class KhachHang extends Nguoi{
    private String tenCongTy;
    private double triGiaHoaDon;
    
    public KhachHang(){}
    public KhachHang(String hoTen, String diaChi, String tenCongty, double triGiaHoaDon){
        super(hoTen, diaChi);
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
    }
    /**
     * @return the tenCongTy
     */
    public String getTenCongTy() {
        return tenCongTy;
    }
    /**
     * @param tenCongTy the tenCongTy to set
     */
    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }
    /**
     * @return the triGiaHoaDon
     */
    public double getTriGiaHoaDon() {
        return triGiaHoaDon;
    }
    /**
     * @param triGiaHoaDon the triGiaHoaDon to set
     */
    public void setTriGiaHoaDon(double triGiaHoaDon) {
        this.triGiaHoaDon = triGiaHoaDon;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"Ten Cong ty" +this.tenCongTy+"Tri gia hoa don la: "+this.triGiaHoaDon;
    }
}
