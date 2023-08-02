package Basic;

import java.util.Scanner;

public class VariablePractice5 {
    public static void main(String[] args) {
        // 입력 : 인원수 사탕 개수
        // 출력 : 1인당 나눠진 사탕 + 남은 사탕 (몫, 나머지)

        Scanner sc = new Scanner(System.in);
        int peopleNum, candyNum;
        System.out.print("인원 수 : ");
        peopleNum = sc.nextInt();
        System.out.print("사탕 개수 : ");
        candyNum = sc.nextInt();

        System.out.println("1인당 사탕 개수 : " + (candyNum/peopleNum ));
        System.out.println("남은 사탕 개수 : " + (candyNum % peopleNum ));
    }
}
