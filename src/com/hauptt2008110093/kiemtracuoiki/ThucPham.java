
package com.hauptt2008110093.kiemtracuoiki;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Date;
public class ThucPham extends HangHoa{
    private Date hanSuDung;
    private String loai;
    public ThucPham(int maHang , String tenHang , float giaNhap , int soLuongTonKho , String ngayNhapKho, String hanSuDung, String loai)throws ParseException {
        super(maHang, tenHang, giaNhap, soLuongTonKho, ngayNhapKho);
        this.hanSuDung= ngayThang(hanSuDung);
        this.loai=loai;

    }
    /**
     * @return the hanSuDung
     */
    public Date getHanSuDung() {
        return hanSuDung;
    }
    /**
     * @param hanSuDung the hanSuDung to set
     */
    public void setHanSuDung(Date hanSuDung) {
        this.hanSuDung = hanSuDung;
    }
    /**
     * @return the loai
     */
    public String getLoai() {
        return loai;
    }
    /**
     * @param loai the loai to set
     */
    public void setLoai(String loai) {
        this.loai = loai;
    }
    @Override
    public String toString() {
        String s ;
        s = super.toString() + String.format( "  %-25s %-25s", ngayThang(getHanSuDung()) , getLoai());
        return s;
    }
}
    

