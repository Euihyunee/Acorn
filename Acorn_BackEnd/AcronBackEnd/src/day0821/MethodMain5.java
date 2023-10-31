package day0821;

import java.util.Scanner;

// 메서드 오버로딩
public class MethodMain5 {

	public static void main(String[] args) {		
		int[] iSum = {10,20,100,200,90,70};
		Scanner sc = new Scanner(System.in);
		int[] arr = inputArr(sc);
		for(int num : arr) {
			System.out.print(num + " ");
			
		}
		System.out.println();
		sc.close();
		System.out.println("배열 숫자 합 : "+sumArr(iSum));
		System.out.println("배열 숫자 Max : "+maxArr(iSum));
		System.out.println("배열 숫자 Min : "+minArr(iSum));
	}
	public static int[] inputArr(Scanner sc) {
		System.out.print("배열 입력 : ");
		String[] s = sc.nextLine().split(" ");
		int[] arr = new int[s.length];
		for(int i = 0 ; i<s.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		return arr;
	}
	
	
	public static int sumArr(int[] iSum) {
		int sum = 0;
		
		for(int num : iSum) {
			sum += num;
		}
		return sum;
	}
	public static int maxArr(int[] iSum) {
		int max = iSum[0];
		for(int num : iSum) {
			if(num > max) {
				max = num;
			}
		}
		return max;
	}
	public static int minArr(int[] iSum) {
		int min = iSum[0];
		for(int num : iSum) {
			if(num < min) {
				min = num;
			}
		}
		return min;
	}
}
