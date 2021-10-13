/*
* ngày tạo: Oct 14, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan5;

public class ComputerTestDrive {
    public static void main(String[] args) {
        Computer computer;
        computer = new Computer();
        System.out.println("Nha san xuat:"+computer.nhaSanXuat);
        System.out.println("Nam san xuat: "+computer.namSanXuat);
        System.out.println("He dieu hanh: "+computer.heDienHanh);
        System.out.println("Ram: "+computer.ram);
        System.out.println("CPU: "+computer.CPU);
        System.out.println("Nam bao hanh:"+computer.namBaoHanh);

        computer = new Computer("HP","Windows 11","4GB","Pentium G3220");
        System.out.println("Nha san xuat:"+computer.nhaSanXuat);
        System.out.println("He dieu hanh: "+computer.heDienHanh);
        System.out.println("Ram: "+computer.ram);
        System.out.println("CPU: "+computer.CPU);
       
        computer = new Computer(2020,2);
        System.out.println("Nam san xuat: "+computer.namSanXuat);
        System.out.println("Nam bao hanh:"+computer.namBaoHanh);
    }
}
