package com.synergy.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ExternalizableBusinessDemo {

	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = null;
		try {

			FileOutputStream file = new FileOutputStream("business.dat");
			// this wrapper class for FileOutputStream
			oos = new ObjectOutputStream(file);

			Scanner sca = new Scanner(System.in);
			System.out.println("Enter the name ");
			String name = sca.next();

			System.out.println("Enter the address ");
			String address = sca.next();

			System.out.println("Enter the mobile ");
			String mobile = sca.next();

			System.out.println("Enter the Age ");
			int age = sca.nextInt();

			System.out.println("Enter the password ");
			String password = sca.next();

			BusinessMan person = new BusinessMan(name, address, mobile, age, password);
			// we are setting state of the person object of type Person
			// serializing person object into the file system.
			oos.writeObject(person);
			oos.flush();

			System.out.println("Thanks done!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				oos.close();
			}
		}

		FileInputStream file = new FileInputStream("business.dat");
		// this wrapper class for FileOutputStream
		ObjectInputStream ois = new ObjectInputStream(file);
		try {
			BusinessMan bm = (BusinessMan) ois.readObject();
			System.out.println(bm.getName());
			System.out.println(bm.getAddress());
			System.out.println(bm.getMobile());
			System.out.println(bm.getAge());
			System.out.println(bm.getPassword());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
