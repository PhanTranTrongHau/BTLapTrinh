
package com.hauptt2008110093.kiemtracuoiki;
import java.text.DecimalFormat;
import java.text.ParseException;
public class DienMay extends HangHoa{
    private int congSuat;
    private String baoHanh;
    public DienMay(int maHang , String tenHang , float giaNhap , int soLuongTonKho , String ngayNhapKho, int congSuat, String baoHanh) throws ParseException {
        super(maHang, tenHang, giaNhap, soLuongTonKho, ngayNhapKho);
        this.congSuat = congSuat;
        this.baoHanh = baoHanh;
    }
    /**
     * @return the congSuat
     */
    public int getCongSuat() {
        return congSuat;
    }
    /**
     * @param congSuat the congSuat to set
     */
    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }
    /**
     * @return the baoHanh
     */
    public String getBaoHanh() {
        return baoHanh;
    }
    /**
     * @param baoHanh the baoHanh to set
     */
    public void setBaoHanh(String baoHanh) {
        this.baoHanh = baoHanh;
    }
    @Override
    public String toString() {
        String nhap ;
        nhap = super.toString() + String.format(" %-20s %-20s", getCongSuat(),getBaoHanh());
        return nhap ;
    }
}
