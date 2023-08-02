package Basic;

import java.util.Scanner;

public class ForChar {
    public static void main(String[] args) {
        // TODO 1. 이용
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("문자열을 입력하세요 : ");
//        String s_char = sc.nextLine();
//        print_sChar(s_char);
//        sc.close();
        // TODO 2. 이용
        int[] numArray = {3, 4, 5, 6, 7, 8};
        String[] charArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        for (int i = 0; i < numArray.length; i++) {
            System.out.printf("이번엔 %d개까지 출력함 ", numArray[i]);
            for (int j = 0; j < numArray[i]; j++ ) {
                System.out.print(charArray[j] + " ");
            }
            System.out.println("");
        }


    }

    // TODO 1. 문자열을 입력받아 1~5번 번호를 매겨 출력하는 함수
    public static void print_sChar(String s_char){
        for (int i = 0; i < 5; i++) {
            System.out.println(s_char + (i+1));
        }
    }
}
