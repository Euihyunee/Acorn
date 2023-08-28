package Project;

import java.util.Scanner;

public class SnackMenu {
	private Scanner sc;
	private SnackController snackController;
		
	public SnackMenu() {}
	
	public Snack menu() {
		sc = new Scanner(System.in);
		snackController = new SnackController();
		
		// 스낵류를 입력하세요
		System.out.println("스낵류를 입력하세요");
		// 종류:
		System.out.print("종류 : "); 
		String type = sc.nextLine();
		// 이름:
		System.out.print("이름 : "); 
		String name = sc.nextLine();
		// 맛:
		System.out.print("맛 : "); 
		String taste = sc.nextLine();
		// 개수:
		System.out.print("개수 : "); 
		String count = sc.nextLine();
		// 가격:
		System.out.print("가격 : "); 
		String price = sc.nextLine();
		System.out.printf("%s(%s - %s) %d개 %d원%n",
				type, name, taste, 
				Integer.parseInt(count),
				Integer.parseInt(price));
		
		return snackController.saveData(type, name, taste,
				Integer.parseInt(count),
				Integer.parseInt(price));
		
	}
}
