package com.synex.practice;

import java.io.IOException;
import java.sql.SQLException;

public class TestFinally {

	static boolean flag;

	public static void main(String[] args) {
		try {
			if (flag)
				throw new IOException();
			else
				throw new SQLException();

		} catch (IOException | SQLException e) {

		}
	}

}
