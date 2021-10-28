/*
* ngày tạo: Oct 27, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan7;



public class AnimalTestDrive {
    public static void main(String[] args) {
        Canime canime = new Canime();
        Feline filine = new Feline();
        Dog dog = new Dog();
        dog.makeNoise();
        dog.eat();
        dog.sleep();
        canime.roam();
        dog.chaseCats();

        Cat cat = new Cat();
        cat.makeNoise();
        cat.eat();
        cat.sleep();
        filine.roam();
        cat.chaseButterfly();

        Lion lion = new Lion();
        lion.makeNoise();
        lion.eat();
        lion.sleep();
        filine.roam();
       

        Tiger tiger = new Tiger();
        tiger.makeNoise();
        tiger.eat();
        tiger.sleep();
        filine.roam();
        

        Wolf wolf = new Wolf();
        wolf.makeNoise();
        wolf.eat();
        wolf.sleep();
        canime.roam();
        wolf.territory();

        Hippo hippo = new Hippo();
        hippo.makeNoise();
        hippo.eat();
        hippo.sleep();
        hippo.roam();
        hippo.drench();
    }
}
