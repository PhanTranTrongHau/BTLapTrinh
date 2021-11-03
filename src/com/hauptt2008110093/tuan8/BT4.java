/*
* ngày tạo: Nov 04, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan8;

public class BT4 {
           private String tenSP;
           private double donGia;
           private double giamGia;
           
        public String gettenSP(){
            return this.tenSP;
        }
        public void settenSP(String tenSp){
            this.tenSP = tenSp;
        }   
        public double getdonGia(){
            return this.donGia;
        }
        public void setdonGia(double dongia){
            this.donGia = dongia;
        }
        public double getgiamGia(){
            return this.giamGia;
        }
        public void setgiamGia(double giamgia){
            this.giamGia = giamgia;
        }
        private double getThueNhapKhau(double a , double b){
              a = donGia;
              b = giamGia;
              return (a - b)*10/100;
           }
        public void nhap(){
              
            }
        public void xuat(){
                System.out.println("Ten Sp: "+tenSP+", Gia Sp "+donGia+" , Giam gia"+giamGia+", Thue sp"+getThueNhapKhau(20000, 1000));
            }
        }           

