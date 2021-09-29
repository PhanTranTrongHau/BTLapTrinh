package com.hauptt2008110093.lab2;
import java.util.Scanner;
public class LT2Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap he so a, b");
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
}