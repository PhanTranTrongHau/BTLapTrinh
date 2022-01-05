/*
* ngày tạo: Nov 04, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan7;

public class VetTestDrive {
    public static void main(String[] args) {
        Vet v = new Vet();
        Dog d = new Dog();
        Cat c = new Cat();
        v.giveShot(d);
        v.giveShot(c);
    }
}
