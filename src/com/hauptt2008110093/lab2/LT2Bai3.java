package com.hauptt2008110093.lab2;
import java.util.Scanner;

public class LT2Bai3 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện đã sử dụng: ");
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

