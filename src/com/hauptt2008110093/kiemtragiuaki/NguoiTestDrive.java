/*
* ngày tạo: Nov 04, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.kiemtragiuaki;

public class NguoiTestDrive {
    public static void main(String[] args) {
        HocVien hocVien = new HocVien();
        int soLuong = hocVien.soLuongHV(3);
        String thongtinSv = hocVien.toString("Tran Van B","20/12 Cao Lanh");
        String thongtinSV2 = hocVien.toString("Tran Van C","201/2 NGuyen Cong Tru");
        String thongtinSV3 = hocVien.toString("Tran Van D","110/20 ACNCM");
        float diem = hocVien.diemTB(5, 10);
        float diem2 = hocVien.diemTB(9, 9);
        float diem3 = hocVien.diemTB(6, 9);
        System.out.println("Sv 1:"+thongtinSv+", diem TB: "+diem);
        System.out.println("SV 2:"+thongtinSV2+",Diem TB: "+diem2);
        System.out.println("Sv 3: "+thongtinSV3+",Diem TB: "+diem3);
    }
}
