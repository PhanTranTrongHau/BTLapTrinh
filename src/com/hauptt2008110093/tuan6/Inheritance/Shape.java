/*
* ngày tạo: Oct 27, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan6.Inheritance;

public class Shape {
  private  String sound;
  private  boolean click;
  

public void rotate(){
        System.out.println("Hinh tron xoay 360 ");
}

public void playSound(){
    System.out.println("Phat ra file am thanh "+getSound());
}
public Shape(String s){
  sound = s;
}
/**
 * @return the sound
 */
public String getSound() {
    return sound;
}
/**
 * @param sound the sound to set
 */
public void setSound(String sound) {
    this.sound = sound;
}
}
