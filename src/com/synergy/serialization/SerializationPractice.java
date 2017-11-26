package com.synergy.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationPractice {

	public static void main(String[] args) {

		Collar c = new Collar();
		Dog d = new Dog(c, "Fluffy", "White");

		// serialization
		try {
			FileOutputStream fs = new FileOutputStream("temp.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// deserialization

		try {
			FileInputStream fis = new FileInputStream("temp.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Dog dog = (Dog) ois.readObject();
			ois.close();

			System.out.println("Color: " + dog.color);
			System.out.println("Name: " + dog.name);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class Animal {

	public Animal() {
		System.out.println("Animal Constructor");
	}

	String type;
}

class Dog extends Animal implements Serializable {

	Collar collar;
	String name;
	String color;

	public Dog(Collar collar, String name, String color) {
		super();
		this.name = name;
		this.color = color;
		this.collar = collar;
	}
	
	private void WriteObject(ObjectOutputStream os){
		
	} 

}

class Collar{

	public String color;

}