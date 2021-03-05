package com.ticode.music.manager;

public class loading {

	public loading(int number, String[] tags) {
		
		int loaded = 0;
		add(loaded, number, tags);
		
	}
	
	public static void add(int loaded, int number, String[] tags){
		
		Debug.print(loaded/number*100 + "%", tags);
		
	}
	
}
