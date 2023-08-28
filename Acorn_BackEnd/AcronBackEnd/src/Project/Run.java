package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// 입력 화면 출력 
		int num = 1; 
		Scanner sc = new Scanner(System.in);
		SnackMenu sm = new SnackMenu();
		List<Snack> snackList = new ArrayList<>();
		while(num != 0) {
			System.out.println("Snack 입력 메뉴 ");
			System.out.print("시작 1 / 종료 0 >>");
			num = sc.nextInt();
			if(num == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			snackList.add(sm.menu());
		}
		sc.close();
		
		System.out.println("--- snackList 출력 ---");
		for(Snack snack : snackList) {
			System.out.print(snack.toString());
		}
	}

}
