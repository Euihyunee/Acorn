package Practice;

import java.util.Scanner;

public class p8_Practice2 {

	public static void main(String[] args) {
		// 키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 "짝수다"를 출력하고
		// 짝수가 아니면 "홀수다"를 출력하세요. 
		// 양수가 아니면 "양수만 입력해주세요."를 출력하세요. 
		// ex) 숫자를 한 개 입력하세요 : -8 
		// 양수만 입력해주세요. 
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("숫자를 한 개 입력하세요 : ");
			
			int num = sc.nextInt();
			
			if(num <0 ) {
				System.out.println("양수만 입력해주세요.");
				continue;
			}else if(num % 2 == 0) {
				System.out.println("짝수다.");
				break;
			} else {
				System.out.println("홀수다.");
				break;
			}
		}
		sc.close();
	}

}