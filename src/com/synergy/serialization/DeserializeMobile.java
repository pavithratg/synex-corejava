package com.synergy.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeMobile {

	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("mobile.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Mobile m = (Mobile) ois.readObject();
			System.out.println("vendor " + m.getVendor());
			System.out.println("price " + m.getPrice());
			System.out.println("color " + m.getColor());
			ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
