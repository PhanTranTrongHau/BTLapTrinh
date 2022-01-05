/*
* ngày tạo: Oct 28, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan10;

public class Wolf extends Animal {
    public void makeNoise(){
        System.out.println("Ú Ú Ú Ú  ...");
    }
    public void eat(){
        System.out.println("Ăn kiểu sói ");
}
    protected void territory(){
        System.out.println("Dạo quanh bảo vệ lãnh thổ");
    }
}