package com.eco.gdit.text_replacement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile implements ReadFile {

	@Override
	public String readFile(File file) {
		// TODO Auto-generated method stub

				StringBuilder sb = new StringBuilder();
				
				try(BufferedReader in = new BufferedReader(new FileReader(file))){
					String s;
					while((s = in.readLine())!=null){
						sb.append(s);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return sb.toString();
				
	}

}
