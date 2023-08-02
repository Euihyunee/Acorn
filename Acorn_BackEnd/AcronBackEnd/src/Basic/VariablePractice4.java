package Basic;

import java.util.Scanner;

public class VariablePractice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
        String s1;

        System.out.print("문자열을 입력하세요 : ");
        s1 = sc.nextLine();

        for (int i = 0; i < s1.length(); i++) {
            System.out.println((i+1) + "번째 문자열 : "+s1.substring(i, i+1));
        }

    }
}
