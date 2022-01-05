/*
* ngày tạo: Nov 11, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan9;
import com.hauptt2008110093.tuan7.*;
public class BaiToanQuanLyTestDrive {
    public static void main(String[] args) {
        BaiToanQuanLy baiToanQuanLy = new BaiToanQuanLy();
        Dog dog = new Dog();
        dog.setName("Dan choi"); 

        Hippo hippo = new Hippo();
        hippo.setName("Lon");

        baiToanQuanLy.them(dog);
        baiToanQuanLy.them(hippo);
        
        Dog chotimDuoc = (Dog)baiToanQuanLy.timTheoTen("Dan choi");
        Hippo haMaTimDuoc = (Hippo)baiToanQuanLy.timTheoTen("Lum la");

        if(haMaTimDuoc == null){
            System.out.println("khoong tim thay ....!");
        }else{

            System.out.println("Ten cua cho tim duoc: " + haMaTimDuoc.getName());
        }
        
    }
}
