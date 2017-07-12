package com.eco.gdit.text_replacement;

import java.io.File;

public class Test {
	
	public static void main(String[] args) {
		
		ReadFile rtf = new ReadTextFileBytes();
				
		File file = new File(System.getProperty("user.dir")+ "\\objectives.txt");
		
		String s = rtf.readFile(file);
		
		//System.out.println(s);
		
		System.out.println(rtf.readFile(file));
	
	}

}
