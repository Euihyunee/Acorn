package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Container cn1 = new Container("제1창고",12,5,3,0);
		Container cn2 = new Container("제2창고",0,14,2,4);
		Container cn3 = new Container("제3창고",2,1,16,2);
		Container cn4 = new Container("제4창고",1,12,3,20);
		List<Container> cnList = new ArrayList<>();
		cnList.add(cn1);
		cnList.add(cn2);
		cnList.add(cn3);
		cnList.add(cn4);
		Scanner sc =new Scanner(System.in);
		int amount = 10;
		company(cnList, sc, amount);

	}
	public static void company(List<Container> cnList, Scanner sc, int amount) {
		int num = 0;
		while(true) {
			System.out.println("====메뉴====");
			System.out.println("1. 창고 조회");
			System.out.println("2. 상품 주문");
			System.out.println("3. 종료");
			System.out.print("입력 >>");
			num = sc.nextInt();
			if(num == 3) {
				System.out.println("종료합니다. ");
				break;
			}
			switch(num) {
			case 1: 
				System.out.println("===============================창고 목록===============================");
				for(int i=0 ; i < cnList.size(); i++) {
					System.out.printf(cnList.get(i).getName() + ": " + 
							"|Product1 : %2d개" +
							"|Product2 : %2d개" +
							"|Product3 : %2d개" +
							"|Product4 : %2d개|",
							 cnList.get(i).getProduct1(),
							 cnList.get(i).getProduct2(),
							 cnList.get(i).getProduct3(),
							 cnList.get(i).getProduct4());
					System.out.println();
				}
				System.out.println("=====================================================================");
				break;
			case 2: 
				int number = 0;
				outerLoop:
				while(true) {
					// 주문할 창고 선택
					System.out.print("주문할 창고 선택 (-1 : 처음으로) >>");
					number = sc.nextInt();
					if(number == -1) {
						System.out.println("처음으로 돌아갑니다.");
						break;
					}
					System.out.println(cnList.get(number-1).getName() + "를 선택");
					System.out.println();
					// 창고 적정 품목 맞추기 or 개별 주문 
					while(true) {
						int selectNum = 0;
						System.out.println("1. 창고 적정량으로 주문하기");
						System.out.println("2. 개별 주문 ");
						System.out.println("3. 창고 다시 선택");
						System.out.println("4. 메뉴로 돌아가기");
						System.out.print("입력 >> ");
						selectNum = sc.nextInt();
						if(selectNum == 3) {
							System.out.println("이전으로 돌아갑니다. ");
							break;
						}
						if(selectNum == 4) {
							System.out.println("종료합니다.");
							break outerLoop;
						}
						if(selectNum == 1) {
							System.out.println("적정량으로 주문합니다. ");
							
							System.out.printf("기존 Product1 : " + "%2d" + "개", cnList.get(number-1).getProduct1());
							cnList.get(number-1).setProduct1(cnList.get(number-1).getProduct1() +
									calAmount(cnList.get(number-1).getProduct1(), amount));
							System.out.println(" -> 주문 후 Product1 : " + cnList.get(number-1).getProduct1() + "개");
							
							System.out.printf("기존 Product2 : " + "%2d" + "개",cnList.get(number-1).getProduct2());
							cnList.get(number-1).setProduct2(cnList.get(number-1).getProduct2() +
									calAmount(cnList.get(number-1).getProduct2(), amount));
							System.out.println(" -> 주문 후 Product2 : " + cnList.get(number-1).getProduct2() + "개");
							
							System.out.printf("기존 Product3 : " + "%2d" + "개" , cnList.get(number-1).getProduct3());
							cnList.get(number-1).setProduct3(cnList.get(number-1).getProduct3() +
									calAmount(cnList.get(number-1).getProduct3(), amount));
							System.out.println(" -> 주문 후 Product3 : " + cnList.get(number-1).getProduct3() + "개");
							
							System.out.printf("기존 Product4 : " + "%2d" + "개",cnList.get(number-1).getProduct4());
							cnList.get(number-1).setProduct4(cnList.get(number-1).getProduct4() +
									calAmount(cnList.get(number-1).getProduct4(), amount));
							System.out.println(" -> 주문 후 Product4 : " + cnList.get(number-1).getProduct4() + "개");
							
							System.out.println("===========주문 완료===========");
						}
					}
				}
				break;
			case 3:
				System.out.println("종료합니다. ");
				break;
			default : 
				break;
			}
		}
	}
	public static int calAmount(int product, int amount) {
		if(product > amount) {
			return 0;
		}else if(product < amount){

			return (amount-product);
		}
		return 0;
	}
}
