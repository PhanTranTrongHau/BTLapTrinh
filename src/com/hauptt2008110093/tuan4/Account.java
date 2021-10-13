/*
* ngày tạo: Oct 13, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan4;

public class Account {
    int number_account = 500;
    int number_balance; 

    void showData(){
        System.out.println("Number account: "+number_account);
        System.out.println("Balance account: "+number_balance);
    }
    void deposit(int ammount){
     number_balance += ammount;
    }
    void withdraw(int amount){
    number_balance -= amount;
    }
}
