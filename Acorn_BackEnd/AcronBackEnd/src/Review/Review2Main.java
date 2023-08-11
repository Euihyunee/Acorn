package Review;

import java.util.Scanner;

public class Review2Main {
	public static void main(String[] ages) {
	
		Scanner sc = new Scanner(System.in);
		// 키보드에서 생성하고자 하는 배열 사이즈를 받아 배열 생성 - 정수
		int[] arr = createArr(sc);
		int[] arr1 = new int[arr.length];
		// 배열의 가운데 위치에 키보드 입력받은 값을 저장
		inputCenterIndex(sc,arr1);
		inputEvenIndex(sc, arr1);
		// 입력한 값을 출력
		System.out.println("====arr==== ");
		printArr(arr);
		System.out.println("====arr1====");
		printArr(arr1);
		// 배열의 짝수 인덱스에 키보드 입력받은 값을 저장 
		dynamicMakeArr(arr, arr1);
		System.out.println("====arr==== ");
		printArr(arr);
		System.out.println("====arr1====");
		printArr(arr1);
		
		sc.close();
	}
	public static int[] createArr(Scanner sc) {
		System.out.print("배열 사이즈 입력 : ");
		return new int[sc.nextInt()];
	}
	
	public static void inputCenterIndex(Scanner sc, int[] arr) {
		System.out.print("배열 가운데 입력할 값 : ");
		int num = sc.nextInt();
		if(arr.length/2 != 0) {
			arr[arr.length/2 + 1] = num;
		}else {
			arr[arr.length/2] = num;
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
	
	public static void printArr(int[] arr) {
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.println("index[" + i + "] : " + arr[i] + " ");
		}
	}
	public static void dynamicMakeArr(int[] iArr01, int[] iArr02) {
		for(int i = 1 ; i<iArr02.length ; i+=2) {
			iArr01[i] = iArr02[i-1];
		}
	}
}
