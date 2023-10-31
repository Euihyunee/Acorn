package Basic;

import java.util.Calendar;
import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수:>>>");
		int nlpoint = sc.nextInt();
		System.out.print("영어점수:>>>");
		int elpoint = sc.nextInt();
		System.out.print("수학점수:>>>");
		int matlpoint = sc.nextInt();
		int total = (nlpoint + elpoint + matlpoint);
		if (total >= 240) {
			System.out.println("총점 : " + total);
			if (nlpoint <= 80) {
				System.out.println("탈락 이유 nlpoint 80점 미만 : " + nlpoint);
			} else if (elpoint <= 80) {
				System.out.println("탈락 이유 elpoint 80점 미만 : " + elpoint);
			} else if (matlpoint <= 80) {
				System.out.println("탈락 이유 matlpoint 80점 미만 : " + matlpoint);
			} else System.out.println("축하드립니다. 합격입니다. ");
		} else System.out.println("불합격입니다. ");
		
		sc.close();
		

	}

}
