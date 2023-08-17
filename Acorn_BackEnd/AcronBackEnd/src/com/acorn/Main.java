package com.acorn;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audio audio = new Audio(true, 15);
		TV tv = new TV(false, 12,40);
		
		tv.setPower(true);
		tv.watch();
		
		audio.setVolumn(10);
		audio.tune();
		
	}

}
