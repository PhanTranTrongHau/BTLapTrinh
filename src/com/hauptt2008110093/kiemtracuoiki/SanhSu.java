/*
* ngày tạo: Jan 04, 2022
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.kiemtracuoiki;
import java.text.DecimalFormat;
import java.text.ParseException;
public class SanhSu extends HangHoa {
    private String noiSanXuat;
    private String kichThuoc;
    public SanhSu(int maHang, String tenHang , float giaNhap , int soLuongTonKho , String ngayNhapKho,String noiSanXuat, String kichThuoc) throws ParseException {
        super(maHang, tenHang, giaNhap, soLuongTonKho, ngayNhapKho);
        this.noiSanXuat= noiSanXuat;
        this.kichThuoc=kichThuoc;
    }
    /**
     * @return the noiSanXuat
     */
    public String getNoiSanXuat() {
        return noiSanXuat;
    }
    /**
     * @param noiSanXuat the noiSanXuat to set
     */
    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }
    /**
     * @return the kichThuoc
     */
    public String getKichThuoc() {
        return kichThuoc;
    }
    /**
     * @param kichThuoc the kichThuoc to set
     */
    public void setKichThuoc(String kichThuoc) {
        this.kichThuoc = kichThuoc;
    }
    @Override
    public String toString() {
        String nhap;
        nhap = super.toString() + String.format("  %-15s %-25s",getNoiSanXuat(),getKichThuoc());
        return nhap;
    }
}