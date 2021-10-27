/*
* ngày tạo: Oct 27, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan7;

public class Dog extends Animal {
    protected void makeNoise(){
        System.out.println("Gau Gau Gau Gau ...");
    }
    protected void eat(){
        System.out.println("An kieu cho");
    }
    protected void sleep(){
        System.out.println("Ngu vao ban ngay ");
    }
    protected void roam(){
        System.out.println("Dao quanh can nha ");
    }
    void chaseCats(){
        System.out.println("Đuổi Mèo...");
    }
}
