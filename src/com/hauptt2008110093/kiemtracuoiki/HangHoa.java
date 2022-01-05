
package com.hauptt2008110093.kiemtracuoiki;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class HangHoa {
    private int maHang;
    private String tenHang;
    private float giaNhap;
    private int soLuongTonKho;
    private Date ngayNhapKho;
    public HangHoa(int maHang , String tenHang , float giaNhap , int soLuongTonKho , String ngayNhapKho) throws ParseException {
        this.maHang=maHang;
        this.tenHang=tenHang ;
        this.giaNhap = giaNhap ;
        this.soLuongTonKho = soLuongTonKho;
        this.ngayNhapKho = ngayThang(ngayNhapKho);
        
    }
    public static Date ngayThang(String chuoi) throws ParseException{
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        date = simpleDateFormat.parse(chuoi);
        return date;
    }
	public static String ngayThang(Date date){
        String ngay = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        ngay =  simpleDateFormat.format(date);
        return ngay;

    }
    HangHoa(){}
    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }
    public int getMaHang() {
        return maHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    } 
    public String getTenHang() {
        return tenHang;
    }
    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }
    public float getGiaNhap() {
        return giaNhap;
    }
    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }
    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }
    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }
    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public String toString() {
		String nhap = "";
		nhap += String.format("%-10s %-10s %-10s %-10s %-8s", getMaHang(),getTenHang(),getSoLuongTonKho(), getGiaNhap(),ngayThang(getNgayNhapKho()));
		return nhap;
	}
}
