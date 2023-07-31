package com.acorn.start1;

import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.List;

public class ArrayMain {
	public static void main(String[] args) {
		
		 List<Object> arrayList = new ArrayList<>();
		 
		
		for (int i = 0; i < 6; i++) {
			arrayList.add(i + "i");
		}
		System.out.println(arrayList);
		System.out.println(arrayList.getClass());
		
		for (Object list : arrayList) {
			System.out.println(list);
		}
	}
}
