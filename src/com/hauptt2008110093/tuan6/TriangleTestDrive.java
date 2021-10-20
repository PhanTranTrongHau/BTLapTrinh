/*
* ngày tạo: Oct 21, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan6;

public class TriangleTestDrive {
    
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.amThanh = "English";
        t.duocClick = true;
        t.kichThuoc = 30;
        System.out.println("Am thanh co trong TG:"+t.amThanh);
        System.out.println("Da duoc click: "+t.duocClick);
        System.out.println("kich thuoc: "+t.kichThuoc);

        Triangle t1 = new Triangle("Nhac Trinh",false,60);
        System.out.println("Hinh tam giac co: "+t1.amThanh+","+t1.duocClick+","+t1.kichThuoc);
        Triangle t2 = new Triangle("Plu Pla Pli",true,19);

        t.phatRaAmThanh();
        t.xoay(9);

        
        double size = t2.getSize();
        System.out.println("Hinh tam giac: "+t2.getSize());
    
        Triangle triangle = new Triangle();
        System.out.println("Tam giac co kich thuoc : "+triangle.kichThuoc);
        Triangle triangle2 = new Triangle();
        System.out.println("Tam giac co kich thuoc :"+triangle2.kichThuoc);

        Triangle dienTichTamGiac = new Triangle();
        double dt1 = dienTichTamGiac.kichThuocTG(15,13);
        System.out.println("Dien tich tam giac: "+dt1);
    }
}
