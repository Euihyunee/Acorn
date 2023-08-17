package ch6;

class Tv{
	// Tv 속성 (멤버변수)
	String color;
	boolean power;
	int channel;
	
	// Tv 기능(메서드)
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}


public class TvTest {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.channel = 7;
		tv.channelDown();
		System.out.println(tv.channel);
	}
}
