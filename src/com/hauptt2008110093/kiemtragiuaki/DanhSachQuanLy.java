/*
* ngày tạo: Nov 11, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.kiemtragiuaki;

import java.util.ArrayList;

public class DanhSachQuanLy {

    private ArrayList<Nguoi> danhSach;

    public DanhSachQuanLy(){
        danhSach = new ArrayList<>();
    }

    /**
     * @return the danhSach
     */
    public ArrayList<Nguoi> getDanhSach() {
        return danhSach;
    }

    /**
     * @param danhSach the danhSach to set
     */
    public void setDanhSach(ArrayList<Nguoi> danhSach) {
        this.danhSach = danhSach;
    }

    public void them(Nguoi nguoi){
        danhSach.add(nguoi);
    }

    public void inDanhSach(){
        for (Nguoi nguoi : danhSach) {

            System.out.println(nguoi.toString());
            
        }
    }
    
}