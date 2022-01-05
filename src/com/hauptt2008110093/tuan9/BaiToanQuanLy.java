/*
* ngày tạo: Nov 11, 2021
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.tuan9;
import java.util.ArrayList;
import com.hauptt2008110093.tuan7.*;

public class BaiToanQuanLy {
    ArrayList<Animal> list = new ArrayList<Animal>();
    public void add(Animal animal){
        list.add(animal);
    }
    public void them(Animal animal){
        list.add(animal);
    }
    
	public void feed()
	{
		for (Animal animal : list) {
			animal.eat();
		}
	}

	public void makeNoise()
	{
		for (Animal animal : list) {
			animal.makeNoise();
		}
	}

	public void sleep()
	{
		for (Animal animal : list) {
			animal.sleep();
		}
	}

	public Animal timTheoTen(String name)
	{
		Dog d = null;

		for (Animal animal : list) {
			if(animal instanceof Dog){
				Dog dog = (Dog)animal;
				if(dog.getName().equalsIgnoreCase(name))
					d = dog;
			}			
		}
		return d;
	}
}
