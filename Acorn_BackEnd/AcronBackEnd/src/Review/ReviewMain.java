package Review;


public class ReviewMain {

	public static void main(String[] args) {
		
		int a = 10; int b = 2; double c = 2.7; double d = 6.0;
		System.out.printf("정수 : %d %d \n실수 : %.1f %.1f \n", a,b,c,d);
		
		
		totalNum(a,b,c,d);
	}
	public static void scanNum(int a) {
		if(a<3) {
			System.out.println("3미만 숫자(정수) : " + a);
		}
	}
	public static void scanNum(double a) {
		if(a<3.0) {
			System.out.println("3미만 숫자(실수) : " + a);
		}
	}

	public static void totalNum(int a, int b, double c, double d) {
		scanNum(a);
		scanNum(b);
		scanNum(c);
		scanNum(d);
	}
}
