package com.ticode.music.manager;

public class Debug {
	
	public static void print(String text, String[] tags) {
		
		for(String tag : tags){
			System.out.print("[" + tag + "]");
		}
		
		System.out.println(" " + text);
		
	}
	
}
