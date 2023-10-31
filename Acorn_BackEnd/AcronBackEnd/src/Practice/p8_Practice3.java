package Practice;

import java.util.Scanner;

public class p8_Practice3 {

	public static void main(String[] args) {
		/*
		    국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
			합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
			(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
			합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
			불합격인 경우에는 “불합격입니다.”를 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		
		int aPoint, bPoint, cPoint, total;
		
		System.out.print("국어 점수 입력 : "); aPoint = sc.nextInt();
		System.out.print("영어 점수 입력 : "); bPoint = sc.nextInt();
		System.out.print("수학 점수 입력 : "); cPoint = sc.nextInt();
		
		total = aPoint + bPoint + cPoint;
		
		if(aPoint > 40 && bPoint > 40 && cPoint > 40 && total >= 180) {
			System.out.println("축하합니다 합격입니다. ");
			System.out.println("국어 : " + aPoint + ", 영어 : " + bPoint + ", 수학 : " + cPoint);
			System.out.println("합계 : " + total + ", 평균 : " + (total / 3.0));
		}else
			System.out.println("불합격입니다.");
		
	}

}
