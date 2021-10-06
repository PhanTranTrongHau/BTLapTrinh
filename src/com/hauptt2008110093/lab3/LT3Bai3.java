/*
* ngày tạo: Oct 06, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.lab3;

import java.util.Arrays;
import java.util.Scanner;
public class LT3Bai3 {
    public static void main(String[] args) {     
        int n;
        Scanner mang;
        mang = new Scanner(System.in);
        System.out.println("Nhập số nguyên có trong mảng :");
        n = mang.nextInt();
        int[] a = new int[n];
        System.out.print("Nhập các số nguyên của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = mang.nextInt();
        }
        System.out.println("Mảng là: "+Arrays.toString(a));
       Arrays.sort(a);
       System.out.println("Mảng đã sắp xếp:"+Arrays.toString(a));
       int min = a[0];
    for(int x:a ){
        int Min;
        Min = Math.min(min, x);
         System.out.println("Số nhỏ nhất mảng là: "+Min);
         break;
    }
        double tong = 0;
        double trungBinhCong = 0;
        int soDem = 0;
    for(int x:a){
        if(x % 3 == 0){
             tong += x;
             soDem++;
           System.out.println("Tổng các số chia hết cho 3:"+tong);
           trungBinhCong = tong / soDem;
           System.out.println("Trung bình cộng là:"+trungBinhCong);
           
        }
        }     
        }
}




