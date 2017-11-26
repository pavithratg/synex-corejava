package com.synergy.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeMobile {

	public static void main(String[] args) {
		Mobile mobile = new Mobile("Apple", 600, "silver");
		mobile.setVendor("Samsung");
		try {
			FileOutputStream fos = new FileOutputStream(new File("mobile.txt"));
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(mobile);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
