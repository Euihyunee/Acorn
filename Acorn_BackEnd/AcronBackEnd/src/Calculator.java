import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean num = true;

        while (num) {
            System.out.println("===메뉴===");
            System.out.println("1. 더하기");
            System.out.println("2. 빼기");
            System.out.println("3. 곱하기");
            System.out.println("4. 나누기");
            System.out.println("이외. 종료");
            System.out.println("=========");
            int selectNum = sc.nextInt();
            int num1, num2;
            switch (selectNum) {
                case 1:
                    System.out.println(" 숫자 입력2개 숫자 사이 공백 필요");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("계산 : " + (num1 + num2));
                    continue;
                case 2:
                    System.out.println(" 숫자 입력2개 숫자 사이 공백 필요");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("계산 : " + (num1 - num2));
                    continue;
                case 3:
                    System.out.println(" 숫자 입력2개 숫자 사이 공백 필요");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("계산 : " + (num1 * num2));
                    continue;
                case 4:
                    System.out.println(" 숫자 입력2개 숫자 사이 공백 필요");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("계산 : " + (num1 / num2));
                    continue;
                default:
                    System.out.println("종료합니다");
                    num = false;
                    break;
            }
        }
    }
}