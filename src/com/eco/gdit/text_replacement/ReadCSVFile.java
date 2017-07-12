package com.eco.gdit.text_replacement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadCSVFile implements ReadFile {
	List<String[]> myContents = new ArrayList<>();
	
	@SuppressWarnings("unused")
	private String fileContents = "";
	@Override
	public String readFile(File file) {
		
		@SuppressWarnings("unused")
		String d;
		try(BufferedReader in = new BufferedReader(new FileReader(file))){
			while((d=in.readLine())!=null){
				@SuppressWarnings("unused")
				String[] content = new String[2];
				//content[0] = d.
			}
		}		
		catch(IOException e){
			
		}
		//fileContents=d;
		return null;//d;
	}
	
	public Map<String,String> getArray(){
		Map<String,String> myMap = new HashMap<>();
		
		
		return myMap;
	}
	
	

}
