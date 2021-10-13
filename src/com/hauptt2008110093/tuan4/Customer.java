/*
* ngày tạo: Oct 13, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan4;

import java.util.Scanner;

public class Customer {
    String name;
    String address;
    Scanner scanner = new Scanner(System.in);
    void getName(){
        System.out.println("Ho va ten khach hang: ");
        name = scanner.nextLine();
    }
    void getAddress(){
        System.out.println("Dia chi khach hang:");
        address = scanner.nextLine();
    }
    void showData(){
        System.out.println("Ten khach hang la:"+name);
        System.out.println("Dia chi khach hang la:"+address);
    }
}
