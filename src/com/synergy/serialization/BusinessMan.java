
package com.synergy.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * 
 * We want to implement out serialization and deserialization logic for the
 * object to be serialized When we will implement Externalizable interface , at
 * the time of deserialization default constructor will be invoked while this is
 * not true for Serializable interface.
 */
public class BusinessMan implements Externalizable {

	private String name;
	private String address;
	private String mobile;
	static private int age;
	private String password;

	// There must be default constructor and this cons will be need at the time
	// of de-serialization // and it should be public also.
	public BusinessMan() {
		super();
		System.out.println("This is default constrcutor.....BusinessMan.");
	}

	public BusinessMan(String name, String address, String mobile, int age, String password) {
		super();
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.age = age;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getMobile() {
		return mobile;
	}

	public int getAge() {
		return age;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {

		//out.writeObject(name);
		//out.writeObject(address);
		//out.writeObject(mobile);
		//out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//		name = (String) in.readObject();
//		address = (String) in.readObject();
//		mobile = (String) in.readObject();
//		age = in.readInt();
	}

}
