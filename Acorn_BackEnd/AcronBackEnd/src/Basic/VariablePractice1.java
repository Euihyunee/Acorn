package Basic;


import java.util.Scanner;

public class VariablePractice1 {
    public static void main(String[] args) {
        // 이름, 성별, 나이, 키를 사용자에게 입력 받아 각가의 값을 변수에 담고 출력

        Scanner sc = new Scanner(System.in);
        String name, gender;
        int age;
        double height;


        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("성별을 입력하세요(남/여) : ");
        gender = sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        age = sc.nextInt();
        System.out.print("키를 입력하세요(cm) : ");
        height = sc.nextDouble();

        System.out.printf("키 %.1fcm인 %d살 %s자 %s님 반갑습니다 ^^", height, age, gender, name);
    }
}
