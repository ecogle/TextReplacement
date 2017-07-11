package com.eco.gdit.text_replacement;

import java.io.BufferedInputStream;
import java.io.File;

public interface ReadFile {
	
	public String readFile(File file, BufferedInputStream stream);

}
