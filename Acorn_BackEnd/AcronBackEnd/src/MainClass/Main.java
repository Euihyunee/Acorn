package MainClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 필드 영역
        Scanner sc = new Scanner(System.in);
        // 공통 부분
        int num1, num2;
        System.out.print("계산 2개 ex) 10 20 => 10 - 20 : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        // 결과 저장 부분
        int afterNum;
        char operator;

        System.out.print("연산자 입력 >> +, -, *, / 중에 하나 입력 : ");
        operator = sc.next().charAt(0);
        // "+" 부분
        // "-" 부분
        // "*" 부분
        // "/" 부분

        // 오퍼레이션 영역
        afterNum = operatorNum2(num1, num2, operator);
        System.out.print("연산 결과는 : " + num1 + operator + num2 + " = " + afterNum);

        // "+"

        // "-"
        
        // "*"

        // "/"
    }
    public static int operatorNum2(int num1, int num2, char operator){
        switch (operator) {
            case '+' :
                return num1 + num2;
            case '-' :
                return num1 - num2;
            case '*' :
                return num1 * num2;
            case '/' :
                return num1 / num2;
            default:
                return 0;
        }
    }
}
