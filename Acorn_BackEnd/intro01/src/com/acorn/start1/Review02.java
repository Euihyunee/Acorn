package com.acorn.start1;

public class Review02 {

	public static void main(String[] args) {
		// 연산자
		// 할당연산자 : = 
		// 산술연산자 : +, -, *, /, %(나머지)
		// 복합 할당 연산자 : +=, -=, /=, %=
		// 증감연산자 : ++, --, -> int a = 1; a++, ++a
		// 비교연산자 : ==, !=, >=, <, <= 
		// 논리연산자 : &&, ||, !

		int number = 8;
		if(number % 2 == 1) {
			System.out.println(number + "는 홀수");
		}else
			System.out.println(number + "는 짝수");


		String day = "";
		switch (day) {
		case "월":
			System.out.println("주중");
			break;
		case "화":
			System.out.println("주중");
			break;
		case "수":
			System.out.println("주중");
			break;
		case "목":
			System.out.println("주중");
			break;
		case "금":
			System.out.println("주중");
			break;
		default:
			System.out.println("주말");
			break;
		}

		Week week = Week.FRI;

		switch (week) {
		case MON:
			System.out.println("주중");
			break;
		case TUE:
			System.out.println("주중");
			break;
		case WED:
			System.out.println("주중");
			break;
		case THU:
			System.out.println("주중");
			break;
		case FRI:
			System.out.println("주중");
			break;
		default:
			System.out.println("주말");
			break;
		}
	}
}
