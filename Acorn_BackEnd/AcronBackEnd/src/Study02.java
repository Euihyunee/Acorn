package com.acorn;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수:>>>");
		int nlpoint = sc.nextInt();
		System.out.println("영어점수:>>>");
		int elpoint = sc.nextInt();
		System.out.println("수학점수:>>>");
		int matlpoint = sc.nextInt();
		
		System.out.println("전체 점수의 합:" + (nlpoint + elpoint + matlpoint));
		
		sc.close();
		

	}

}
