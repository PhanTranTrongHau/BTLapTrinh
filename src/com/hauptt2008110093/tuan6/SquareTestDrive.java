/*
* ngày tạo: Oct 21, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan6;


public class SquareTestDrive {
    
    public static void main(String[] args) {
        Square s = new Square();
        s.amThanh = "Cai luong";
        s.duocClick = true;
        s.kichThuoc = 4.5;
        System.out.println("Am thanh san co:"+s.amThanh);
        System.out.println("Da duoc click: "+s.duocClick);
        System.out.println("Kich thuoc hinh vuong:"+s.kichThuoc);

        Square s1 = new Square("Nhac tre");
        System.out.println("Am thanh: "+s1.amThanh);
        Square s2 = new Square("nhac tinh", 6);
        System.out.println("Am Thanh, kich thuoc: "+s2.amThanh+s2.kichThuoc);
        Square s3 = new Square("Tinh ca",false,5.0);
        
        
        s.phatRaAmThanh();
        s.xoay(6);

        double size = s3.getSize();
        System.out.println("hinh vuong: "+s3.getSize());
        //static
        
        Square square = new Square();
        System.out.println("Hinh vuong"+square.kichCo);
        Square square2 = new Square();
        System.out.println("Hinh vuong"+square2.kichCo);
        
        Square dt = new Square();
        int t1 = dt.dienTich(7);
        System.out.println("dien tich :"+t1); 
    }
}
