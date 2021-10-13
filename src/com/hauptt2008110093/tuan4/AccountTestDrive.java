package com.hauptt2008110093.tuan4;
import java.util.Scanner;

public class AccountTestDrive {
    public static void main(String[] args) {
            Account account = new Account();
            Employee employee = new Employee();
            Customer customer = new Customer();
            Scanner scanner = new Scanner(System.in);
            int chucNang;
            do{
                    System.out.println("***************MENU BANK******************");
                    System.out.println(" 1. Rut, gui, them thong tin tai khoan.   ");
                    System.out.println(" 2. Nhan vien ngan hang.                  ");
                    System.out.println(" 3. Khach hang.                           ");
                    System.out.println(" Nhap so bat ky de ket thuc.              ");
                    System.out.println("******************************************");
                    System.out.print("Nhap chuc nang can thuc hien: ");
                    chucNang = scanner.nextInt();
                    switch(chucNang){
                            case 1:{
                                    int chucNang1;
                                    do{
                                            System.out.println("****************Tai Khoan*************");
                                            System.out.println(" 1. Rut tien.                            ");
                                            System.out.println(" 2. Gui tien.                            ");
                                            System.out.println(" 3. Xem thong tin tai khoan.             ");
                                            System.out.println(" Nhap so bat ky de ket thuc.             ");
                                            System.out.println("*****************************************");
                                            System.out.print("Nhap chuc nang can thuc hien: ");
                                            chucNang1 = scanner.nextInt();
                                            switch(chucNang1){
                                                    case 1:{
                                                            System.out.print("Nhap so tien can rut: ");
                                                            int b = scanner.nextInt();
                                                            account.withdraw(b);
                                                            
                                                    };break;
                                                    case 2:{
                                                            System.out.print("Nhap so tien can gui: ");
                                                            int a = scanner.nextInt();
                                                            account.deposit(a);
                                                    };break;
                                                    case 3:{
                                                            account.showData();
                                                            System.out.print("Nhap so bat ky de quay ve menu: ");
                                                            int i = scanner.nextInt();
                                                    }
                                            }  
                                    }while(chucNang1 > 0 && chucNang1 < 4);
                            };break;
                            case 2:{
                                int chucNang2;
                                do{
                                            System.out.println("***************Nhan Vien*************");
                                            System.out.println(" 1. Nhap ten nhan vien.                  ");
                                            System.out.println(" 2. Nhap luong                           ");
                                            System.out.println(" 3. Nhap dia chi nhan vien");
                                            System.out.println(" 4. Xem thong tin nhan vien.             ");
                                            System.out.println(" Nhap so bat ky de ket thuc.             ");
                                            System.out.println("*****************************************");
                                            System.out.print("Nhap chuc nang can thuc hien: ");
                                            chucNang2 = scanner.nextInt();
                                switch(chucNang2){
                                    case 1:employee.getName();break;
                                    case 2:employee.getSalary();break;
                                    case 3:employee.getAddress();break;
                                    case 4:{
                                        employee.showData();
                                        System.out.print("Nhap so bat ky de quay ve menu: ");
                                        int i = scanner.nextInt();
                            }                                                        
                        }                                                
                    }while(chucNang2>0 && chucNang2 <4);
                }case 3:{
                    int chucNang3;
                    do{
                                System.out.println("***************Khach Hang*************");
                                System.out.println(" 1. Nhap ten khach hang                  ");
                                System.out.println(" 2. Nhap dia chi khach hang                          ");
                                System.out.println(" 3. Xem thong tin khach hang        ");
                                System.out.println(" Nhap so bat ky de ket thuc.             ");
                                System.out.println("*****************************************");
                                System.out.print("Nhap chuc nang can thuc hien: ");
                                chucNang3 = scanner.nextInt();
                    switch(chucNang3){
                        case 1:employee.getName();break;
                        case 2:employee.getAddress();break;
                        case 3:employee.showData();break;
                        case 4:{
                            employee.showData();
                            System.out.print("Nhap so bat ky de quay ve menu: ");
                            int i = scanner.nextInt();
                }                                                        
            }                                                
        }while(chucNang3>0 && chucNang3 <4);
    }
            }                    
        }while(chucNang > 0 && chucNang < 4);
    }
    }
