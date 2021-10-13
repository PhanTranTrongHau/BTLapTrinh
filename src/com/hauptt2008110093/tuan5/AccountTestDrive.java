/*
* ngày tạo: Oct 14, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan5;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account account;
        account = new Account();
        System.out.println("Ten chu TK:"+account.tenChuTK);
        System.out.println("So TK:"+account.soTK);
        account = new Account(20000000);
        System.out.println("So Du TK:"+account.soDuTK);
    }
}
