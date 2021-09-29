package com.hauptt2008110093.lab2;

import java.util.Scanner;
public class LT2Bai4 {
    public static void main(String[] args) {
        System.out.println("======MENU======");
        System.out.println("1. Giải phương trình bậc nhất.");
        System.out.println("2. Giải phương trình bậc 2.");
        System.out.println("3. Tính tiền điện.");
        System.out.println("4. Kết thúc.");
        System.out.println("======END MENU======");

        System.out.println("Hãy chọn chức năng: ");
        Scanner luaChon = new Scanner(System.in);
        int suLuaChon = luaChon.nextInt();
        switch(suLuaChon){
            case 1: giaiPTBac1();break;
            case 2: giaiPTBac2();break;
            case 3: tinhTienDien();break;
            default: System.out.println("Chọn chức năng khác");
        }
    }


static void giaiPTBac1() {
        System.out.println("Nhap he so a, b");
        java.util.Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.print("Phuong trinh vo so nghiem");
            }
            else{
                System.out.print("Phuong trinh vo nghiem ");
        }
    } 
    else{
        double x = -b / a;
        System.out.printf("Phuong trinh co nghiem la: %.2f", x); 
    }
}
static void giaiPTBac2(){
    System.out.println("Nhap 3 so a, b, c");
    java.util.Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    double b = scanner.nextDouble();
    double c = scanner.nextDouble();
    if(a == 0){
        if(b == 0){
            System.out.print("Phuong trinh vo so nghiem");
        }
        else{
            System.out.print("Phuong trinh vo nghiem ");
    }
} 
else

    if(a != 0){
        double Delta = Math.pow(b, 2) - 4 * a * c;
        if(Delta < 0){
            System.out.println("Phuong trinh vo nghiem");
        if(Delta == 0){
            double x = -b/(2*a);
            System.out.printf("Phuong trinh co nghiem kep: %.2f", x);
        }else
        if(Delta > 0){
            double x1 = (-b + Math.sqrt(Delta))/(2*a);
            double x2 = (-b - Math.sqrt(Delta))/(2*a);
            System.out.printf("Pt co nghiem kep %.2f %.2f",x1, x2);
        }
        }
    } 
}
static void tinhTienDien(){
    System.out.println("Nhập số điện đã sử dụng: ");
    java.util.Scanner scanner = new Scanner(System.in);
    float soDien = scanner.nextFloat();
    float tien;
    if (soDien < 50){
        tien = soDien * 1000;
        System.out.printf("So tien dien la:%.2f ", tien);
    }else 
    tien = 50 * 1000 + (soDien - 50)*1200;
    System.out.printf("So tien dien la : %.2f", tien );
}
}
