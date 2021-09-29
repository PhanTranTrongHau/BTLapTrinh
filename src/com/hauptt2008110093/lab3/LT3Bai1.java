/*
* ngày tạo: Sep 29, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.lab3;
import java.util.Scanner;

public class LT3Bai1 {
    public static void main(String[] args) {
        int N;
        Scanner soNhapN;
        soNhapN = new Scanner(System.in);
        System.out.println("Nhập số N : ");
        N = soNhapN.nextInt();
        boolean soCanKiem = true;
        for(int i = 2; i< N - 1;i++){
            if(N % i == 0){
                soCanKiem = false;
                break;
            }
                i++;
        }
            if(soCanKiem)
                System.out.printf("N không phải số nguyên tố");
            else 
                System.out.println("N là số nguyên tố");
        
    }
}
