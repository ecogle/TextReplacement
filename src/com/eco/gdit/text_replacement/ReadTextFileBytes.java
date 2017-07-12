package com.eco.gdit.text_replacement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class ReadTextFileBytes implements ReadFile{
	
	//private static final Logger LOGGER = Logger.getLogger(MyLogger.class.getName());

	@Override
	public String readFile(File file) {
		
		int g;
		String d="";
		try(InputStream in = new FileInputStream(file)){
			while((g = in.read())>-1){
				d += (char)g;
			}
		}		
		catch(IOException e){
			
		}
		
		return d;
	}

}
