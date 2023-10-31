package Review;

import java.util.Scanner;

// 반복문
// for(초기값; 조건식; 증감값) {
//	반복적으로 실행할 명령문;
//}
public class ReviewMain09 {

	public static void main(String[] args) {

		// 키보드에서 생성하고자 하는 
		Scanner sc = new Scanner(System.in);
		// 배열 사이즈를 받아 배열 생성 - 정수
		System.out.print("배열사이즈:>>> ");
		int iArrSize = sc.nextInt();
		int[] iArr01  = new int[iArrSize]; 
		int[] iArr02  = new int[iArrSize];
		inputEvenIndex(sc, iArr02);
		// iArr02를 반복문 이용해 짝수 인덱스 값을 저장
		dynamicMakeArr(iArr01, iArr02);
		for(int i = 0 ; i < iArr01.length ; i++) {
			System.out.println(iArr01[i] + " " +iArr02[i]);
		}

		sc.close();

	}

	public static void dynamicMakeArr(int[] iArr01, int[] iArr02) {

		// iArr02 -> iArr01: 같은 위치(짝수인덱스)
//		for(int i = 0; i < iArr01.length; i++) {
//			if(i % 2 == 0) {
//				iArr01[i] = iArr02[i];	
//			}
//		}
		// iArr02 -> iArr01: 엇갈린 위치(짝수->홀수)
		for(int i = 1; i < iArr01.length; i++) {
			if(i % 2 == 0) {
				iArr01[i-1] = iArr02[i];	
			}
		}
	}
	public static void inputEvenIndex(Scanner sc, int[] arr) {
		System.out.print("짝수 인덱스에 입력할 값 : ");
		int value = sc.nextInt();
		if((arr.length%2) == 0) {
			for(int i = 0 ; i<arr.length ; i+=2) {
				arr[i] = value;
			}
		}else {
			for(int i = 0 ; i<arr.length ; i+=2) {
				arr[i] = value;
			}
		}
	}
}