package com.brendenbrusberg.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtils {

	private FileUtils() {
	}
	
	public static String loadAsString(String file) {
		StringBuilder result = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String buffer = "";
			while ((buffer = reader.readLine()) != null) {
				result.append(buffer + '\n');
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result.toString();
	}
	
	public static int countLines(String str){
	    if (str == null || str.length() == 0)
	        return 0;
	    int lines = 1;
	    int len = str.length();
	    for( int pos = 0; pos < len; pos++) {
	        char c = str.charAt(pos);
	        if( c == '\r' ) {
	            lines++;
	            if ( pos+1 < len && str.charAt(pos+1) == '\n' )
	                pos++;
	        } else if( c == '\n' ) {
	            lines++;
	        }
	    }
	    return lines;
	}

}
