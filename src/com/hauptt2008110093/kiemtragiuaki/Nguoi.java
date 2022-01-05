/*
* ngày tạo: Nov 04, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.kiemtragiuaki;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String diaChi;
    Nguoi(){}
    protected Nguoi(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }
    public String gethoTen(){
        return this.hoTen;
    }
    public void sethoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public String getdiaChi(){
        return this.hoTen;
    }
    public void setdiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    public String toString(){
        return "Nguoi [diaChi=" + diaChi + ", hoTen=" + hoTen + "]";
    }
}
