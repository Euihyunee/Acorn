package Practice;

import java.util.Scanner;

public class p13_Practice3 {
	public static void main(String[] args) {
		/*
		 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		단, 입력한 수는 1보다 크거나 같아야 합니다
		 */
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num <= 0) {
				System.out.println("1이상의 숫자를 입력하세요");
			}else {
				for(int i = 0 ; i < num ; i++) {
					System.out.print((num-i) + " ");
				}
				break;
			}			
		}

	}
}
