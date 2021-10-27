/*
* ngày tạo: Oct 27, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan7;

public class Animal {
        protected String piture;
        protected String food;
        protected int hunger;
        protected String boundaries;
        protected int location;
    
    protected void makeNoise(){
        System.out.println("Tieng Keu");
    }
    protected void eat(){
        System.out.println("An ");
    }
    protected void sleep (){
        System.out.println(" Ngu vao ban dem ");
    }
    protected void roam(){
        System.out.println("Dao quanh rung");
    }
}
