package Practice;

import java.util.Scanner;

public class p13_Practice5 {

	public static void main(String[] args) {
		/*
		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 하나를 입력해 주세요 : ");
			int num = sc.nextInt();
			
			if (num < 0) {
				System.out.println("1 이상의 숫자를 입력해주세요!");
			}else {
				int total = 0 ;
				for(int i = 1 ; i<=num ; i++) {
					total += i;
				}
				System.out.println("1부터 " + num + "까지의 합은 : " + total);
				break;
			}	
		}
		sc.close();
		
	}

}
