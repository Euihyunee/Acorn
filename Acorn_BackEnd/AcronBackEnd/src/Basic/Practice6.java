package Basic;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("0~6 숫자 입력 : "); int num = sc.nextInt();
		if(num > 6 || num <0) {
			System.out.println("잘못 입력하셨습니다.");
			System.exit(0);
		}
		
		
		String weekStr = "월화수목금토일";
		char[] weekChar = castStrToChar(weekStr);
		System.out.println(weekChar[num] + "요일");
		
		sc.close();
	}
	public static char[] castStrToChar(String str) {

		char[] charArr = new char[str.length()];
		for(int i = 0; i<str.length(); i++) {
			charArr[i] = str.charAt(i);
		}

		return charArr;
	}

}
