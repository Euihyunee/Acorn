package Basic;

import java.util.Scanner;

public class VariablePractice9 {

	public static void main(String[] args) {

//		int numArr[] = {1,2,3,4,5,6,7,8,9,10};
//
//		for(int num : numArr) {
//			System.out.print(num + " ");
//		}
		
		Scanner sc = new Scanner(System.in);
		
		String str = new String();
		char word;
		System.out.print("문자열을 입력해주세요 : ");  str = sc.nextLine();
		System.out.print("문자을 입력해주세요 : ");  word = sc.nextLine().charAt(0);
		
		System.out.println("입력된 문자열 : " + str +", 입력된 문자 : " + word);
		
		int [] wordIndex = searchNumberString(str, word);
		System.out.print("Index : ");
		
		for(int i = 0 ; i<wordIndex.length ; i++) {
			if(wordIndex[i] != 0) {
				System.out.print(wordIndex[i] + "번 ");	
			}
		}
	}


	// String -> char 캐스팅
	public static char[] castStrToChar(String str) {

		char[] charArr = new char[str.length()];
		for(int i = 0; i<str.length(); i++) {
			charArr[i] = str.charAt(i);
		}

		return charArr;
	}
	// 검색할 문자 검색 받아서 일치 문자열 갯수 찾아줌 
	public static int[] searchNumberString(String searchStr, char word) {

		char[] searchChar = castStrToChar(searchStr);

		int[] indexNumbers =  new int[searchChar.length] ;
		int num = 0;
		for(int i = 0; i<searchChar.length; i++) {
			if(searchChar[i] == word) {
				indexNumbers[i] = i+1;
				num++;
			}
		}
		return indexNumbers;
	}

}
