package com.ticode.music.manager;

public class Main {
	
	public static void main(String[] args) {
		
		String[] tag = {"Main"};
		
		Debug.print("Starting...", tag);
		long chrono = 0 ;
		chrono = System.currentTimeMillis();
		
		int loader = 1;
			
		int loaded = 0;
		Debug.print("Loading " + loaded/loader*100 + "%", tag);
		loaded ++;
		
		Window.setwindow();
		
		Debug.print("Loading " + loaded/loader*100 + "%", tag);
		
		long chrono2 = java.lang.System.currentTimeMillis() ;
		long temps = chrono2 - chrono;
		Debug.print("Done (" + temps + " ms)", tag);
		
	}
	
}
