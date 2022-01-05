/*
* ngày tạo: Oct 27, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan10;

abstract public class Animal {
    private String name;
        protected String piture;
        protected String food;
        protected int hunger;
        protected String boundaries;
        protected int location;
    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    public void makeNoise(){
        System.out.println("Tieng Keu");
    }
    public void eat(){
        System.out.println("An ");
    }
    public void sleep (){
        System.out.println(" Ngu vao ban dem ");
    }
    public void roam(){
        System.out.println("Dao quanh rung");
    }
    public void introduce(){
        makeNoise();
        System.out.println("Tieng keu: "+name);
    }
}
