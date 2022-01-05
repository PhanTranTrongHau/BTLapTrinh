/*
* ngày tạo: Jan 03, 2022
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.kiemtracuoiki;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
public class DanhSachQuanLy {
    private ArrayList<HangHoa> danhSach ;
    private Scanner luaChon = new Scanner(System.in);

    DanhSachQuanLy(){
        danhSach = new ArrayList<HangHoa>();
    }
    public ArrayList<HangHoa> getList() {
        return danhSach;
    }
    public void setList(ArrayList<HangHoa> danhSach) {
        this.danhSach = danhSach;
    }

    public void them(HangHoa hangHoa) throws ParseException{
        danhSach.add(hangHoa);
    
        /*int count = 0 ;
        for(int i = 0 ; i < danhSach.size() ; i++){
            HangHoa hangHoa2 = danhSach.get(i);
            if(hangHoa2.getMaHangHoa().equalsIgnoreCase(hangHoa.getMaHangHoa()) || hangHoa2.getMaHangHoa().equalsIgnoreCase("HTP-") ||hangHoa2.getMaHangHoa().equalsIgnoreCase("HSS-") || hangHoa2.getMaHangHoa().equalsIgnoreCase("HDM-") ){
                System.out.println("Khong the nhan ");
                count++ ;
                them(hangHoa);;
                break;
            }
        }
        if(count == 0){
            danhSach.add(hangHoa);
        }
        
            System.out.println(danhSach);*/
    }
        public void inDS(){
            for(HangHoa hangHoa:danhSach){
                System.out.println(hangHoa.toString());
            }
        }
        public void xoa(HangHoa hangHoa) throws ParseException{
            danhSach.remove(hangHoa);
        }
        public boolean xoaTheoMa(int maHang) {
            return danhSach.removeIf(hangHoa -> hangHoa.getMaHang() == maHang );
        }
        public boolean sua(int maHang, float giaNhapMoi) {
            for (HangHoa hangHoa : danhSach) {
                if(hangHoa.getMaHang() == maHang) {
                    hangHoa.setGiaNhap(giaNhapMoi);
                    return true;
                }
            }
            System.out.println("Sua that bai");
            return false;
        }
        public void timThucPham(){
            System.out.println("HANG THUC PHAM");
            for (int i = 0; i < 150; i++) {
                System.out.print("-");
            }
            System.out.println();
            System.out.printf("%-10s %-10s %-20s %-20s %-15s %-10s %-10s\n","Ma Hang","Ten Hang","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Ngay het han","loai ");
            for (int i =0; i< 149; i++) {
                System.out.print("-");
            }
            System.out.println();
            for (HangHoa hangHoa : danhSach) {
                if(hangHoa instanceof ThucPham){
                    System.out.println(hangHoa);
                }
            }
            for (int i =0; i< 150; i++) {
                System.out.print("-");
            }
            System.out.println();
    
        }
        public void timSanhSu(){
            System.out.println("HANG SANH SU");
            for (int i =0; i< 150; i++) {
            }
            System.out.println();
            System.out.printf("%-10s %-10s %-20s %-20s %-15s %-10s %-10s\n","Ma Hang","Ten Hang","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Noi San Xuat","Kich thuoc");
            for (int i = 0; i < 150; i++) {
            }
            System.out.println();
            for (HangHoa hangHoa : danhSach) {
                if(hangHoa instanceof SanhSu){
                    System.out.println(hangHoa);
                }
            }
            for (int i = 0; i < 150; i++) {
            }
            System.out.println();
        }
        public void timDienMay(){
            System.out.println("HANG DIEN MAY");
            for (int i = 0; i < 150; i++) {

            }
            System.out.println();
            System.out.printf("%-10s %-10s %-20s %-20s %-15s %-10s %-10s\n","Ma Hang","Ten Hang","So Luong ton Kho","Gia Nhap Kho","Ngay Nhap Kho","Cong suat","Bao Hanh");
            for (int i = 0; i < 150; i++) {
            }
            System.out.println();
            for (HangHoa hangHoa : danhSach) {
                if(hangHoa instanceof DienMay){
                    System.out.println(hangHoa);
                }
            }
            for (int i = 0; i < 150; i++) {
            }
            System.out.println();
        }
        
        public void timKiemTheoGia(){
            System.out.println("Nhap khoang gia can tim kiem tu : ");
            long giaBatDau = luaChon.nextInt();
            System.out.println(" den : ");
            long giaKetThuc = luaChon.nextInt();
            for(int i = 0 ; i < danhSach.size() ; i++){
                HangHoa x = danhSach.get(i);
                if(x.getGiaNhap() >= giaBatDau && x.getGiaNhap() <= giaKetThuc){
                    if(x instanceof ThucPham){
                        timThucPham();
                    }
                    else if(x instanceof SanhSu){
                        timSanhSu();
                    }
                    else if(x instanceof DienMay){
                        timDienMay();
                    }
                }
            }
        }

        public int tongsoluonghanghoa() {
            int dem = 0;
            for (HangHoa hangHoa : danhSach) {
                dem += hangHoa.getSoLuongTonKho();
            }
            return dem;
        }

        public double tonggiatrinhapkho() {
            double sum = 0;
            for (HangHoa hangHoa :danhSach) {
                sum += hangHoa.getGiaNhap();
            }
            return sum;
        }
        
        public int tongtungloai() {
            int dem = 0;
            for (HangHoa hangHoa : danhSach) {
                dem++;
            }
            return dem;
        }

        public int getsize() {
            return danhSach.size();
        }
        
        public void sapXepTheoGiaTangDan() {
            Collections.sort(danhSach, new Comparator<HangHoa>() {
    
                @Override
                public int compare(HangHoa o1, HangHoa o2) {
                    // TODO Auto-generated method stub
                    return Double.compare(o1.getGiaNhap(), o2.getGiaNhap());
                }
            });
        }

        public void sapXepTheoGiaGiamDan() {
            Collections.sort(danhSach, new Comparator<HangHoa>() {
    
                @Override
                public int compare(HangHoa o1, HangHoa o2) {
                    // TODO Auto-generated method stub
                    return Double.compare(o2.getGiaNhap(), o1.getGiaNhap());
                }
            });
        }

        public void sapXepNgayTangDan() {
            Collections.sort(danhSach, new Comparator<HangHoa>() {
    
                @Override
                public int compare(HangHoa o1, HangHoa o2) {
                    // TODO Auto-generated method stub
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                        return 1 ;
                    }
                    else {
                        if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) == 0){
                            return 0 ;
                        }
                        else {
                            return -1 ;
               
                        }
                    }
                }
            });
        }
        
        
        public void sapXepNgayGiamDan() {
            Collections.sort(danhSach, new Comparator<HangHoa>() {
    
                @Override
                public int compare(HangHoa o1, HangHoa o2) {
                    // TODO Auto-generated method stub
                    if(o1.getNgayNhapKho().compareTo(o2.getNgayNhapKho()) < 0){
                        return 1 ;
                    }
                    else {
                        if(o2.getNgayNhapKho().compareTo(o1.getNgayNhapKho()) == 0){
                            return 0 ;
                        }
                        else {
                            return -1 ;
                     }
                 }
             }
        });
    }
}