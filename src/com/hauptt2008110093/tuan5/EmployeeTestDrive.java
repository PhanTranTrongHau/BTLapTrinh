/*
* ngày tạo: Oct 14, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan5;

public class EmployeeTestDrive {
    public static void main(String[] args) {
        Employee employee;
        employee = new Employee();
        System.out.println("Ho ten Nhan vien:"+employee.tenNhanVien);
        System.out.println("Dia chi: "+employee.diaChi);
        System.out.println("ngay thang nam sinh: "+employee.ngaySinh);
        employee = new Employee(8500000);
        System.out.println("Luong nhan vien:"+employee.luong);
        employee = new Employee("Quan li");
        System.out.println("Bo phan lam viec:"+employee.boPhanLamViec);
    }
}