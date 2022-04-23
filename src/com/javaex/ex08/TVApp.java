package com.javaex.ex08;

public class TVApp {

	public static void main(String[] args) {
		TV tv = new TV(7, 20, false);
		
		tv.startus();
		
		tv.power(true);
		tv.volume(120);
		tv.startus();
		
		tv.volume(false);
		tv.startus();
		
		tv.channel(0);
		tv.startus();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.startus();
		
		tv.power(false);
		tv.startus();
		
		

	}

}
