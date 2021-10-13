/*
* ngày tạo: Oct 13, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan4;
import java.util.Scanner;
public class Employee {
    String name;
    String address;
    int salary;
    Scanner scanner = new Scanner(System.in);
    void getName(){
        System.out.println("Ho ten nhan vien:");
        name = scanner.nextLine();
    }
    void getAddress(){
        System.out.println("Dia chi nhan vien");
        address = scanner.nextLine();
    }
    void getSalary(){
        System.out.println("Tien luong cua nhan vien:");
        salary = scanner.nextInt();
    }
    void showData(){
        System.out.println("Ten nhan vien : "+name);
        System.out.println("Dia chi nhan vien: "+address);
        System.out.println("Tien luong nhan vien: "+salary);
    }
}
