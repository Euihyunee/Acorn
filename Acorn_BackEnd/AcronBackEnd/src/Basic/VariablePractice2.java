package Basic;

import java.util.Scanner;

public class VariablePractice2 {
    public static void main(String[] args) {
        // 키보드로 정수 두 개를 입력 받아 두 수의 사칙연산 출력
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("두 수를 입력 ex) 10 20 : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        calTwoNum(num1, num2);
    }
    public static void calTwoNum(int num1, int num2){
        System.out.println("+ 결과 : " + (num1 + num2));
        System.out.println("- 결과 : " + (num1 - num2));
        System.out.println("* 결과 : " + (num1 * num2));
        System.out.println("/ 결과 : " + (num1 / num2));
    }
}
