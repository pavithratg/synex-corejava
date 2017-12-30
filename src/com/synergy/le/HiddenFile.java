package com.synergy.le;

import java.io.File;

public class HiddenFile {
	
	public static void main(String[] args) {
		
		File[] fileList = new File(".").listFiles(File::isHidden);
		
		
		
	}

}
