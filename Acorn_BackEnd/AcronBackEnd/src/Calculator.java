import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result="";
        String oper="";
        String menuMsg= "1.계산하기\n2.나가기";
        int num1 = 0;
        int num2 = 0;
        int choice = 0;

        while(true) {
            System.out.println(menuMsg);
            choice = sc.nextInt();
            if(choice == 2) { System.out.println("종료"); break;}
            if(choice != 1) { System.out.println("잘못입력하셨습니다. 다시 입력해주세요"); continue;} // 다음 반복으로 넘어감, 즉 이 코드에선 맨윗줄로 넘어간다.
            System.out.println("계산을 시작합니다. 숫자를 입력해주세요");

            num1 = Integer.parseInt(sc.next());
            oper = sc.next();
            num2 = Integer.parseInt(sc.next());

            switch(oper) {
                case "+":
                    result = ""+(num1+num2);
                    break;
                case "-":
                    result = ""+(num1-num2);
                    break;
                case "*":
                    result = ""+(num1*num2);
                    break;
                case "/":
                    if(num2 !=0) {
                        result = ""+(num1/num2);
                    }
                    else {
                        result= "0으로 나눌 수 없습니다.";
                    }
                    break;
                default:
                    result="사직연산 외에 연산자는 사용할 수 없습니다.";
            }
            System.out.println(result);
        }
    }
}