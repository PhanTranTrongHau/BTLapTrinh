/*
* ngày tạo: Nov 04, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan8;
import java.util.ArrayList;
import java.util.List;
public class BT5 {
    public static void main(String[] args) {
        
    List<SanPham> list;
    list = new ArrayList<>();
    SanPham sanPham = new SanPham();
    list.add(sanPham);
    List<BT3> list2;
    list2 = new ArrayList<>();
    BT3 sanPham1 = new BT3("DT",20000000,100000);
    BT3 sanPham2 = new BT3("May tinh", 3000000);

    list2.add(sanPham1);
    list2.add(sanPham2);

    for(BT3 bt3 : list2){
        bt3.xuat();
    }
  
}
}