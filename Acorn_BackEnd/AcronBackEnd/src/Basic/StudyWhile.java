package Basic;

public class StudyWhile {
    public static void main(String[] args) {


        int[] iEvenOddConntArr = {0,0};

        int iWhileValue = 1;
        while (iWhileValue <= 30) {
            System.out.println(iWhileValue);
            if(iWhileValue % 2 == 0){
                iEvenOddConntArr[0]++;
            }else iEvenOddConntArr[1]++;
            iWhileValue++;
        }
        System.out.println(iEvenOddConntArr[0]);
        System.out.println(iEvenOddConntArr[1]);
    }
}