package com.acorn.start1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Practice01 {

	public static void main(String[] args) {
		
		// 정수 이용해서 4자리 비번 만들거 
		// 4자리  정수 입력 받기 

		Random rand = new Random();
		List<Integer> numList = new ArrayList<>();
		System.out.print("중복 없는 4자리 숫자 생성 : ");

		for(int i = 0 ; i <10 ; i++) {
			numList.add(i);
		}
		for(int i = 0 ; i<4; i++) {
			int randomNum = rand.nextInt(numList.size());
			System.out.print(numList.get(randomNum));
			numList.remove(randomNum);
		}
	}
}
