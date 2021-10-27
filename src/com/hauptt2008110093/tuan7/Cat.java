/*
* ngày tạo: Oct 27, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan7;

public class Cat extends Animal {
    protected void makeNoise(){
        System.out.println("Ngao Ngao Ngao ...");
    }
    protected void eat(){
        System.out.println("Ăn kieu meo");
    }
    protected void roam(){
        System.out.println("Dao quanh can nha ");
    }
    void chaseButterfly(){
        System.out.println("Đuổi bướm...");
    }
}
