package ch7;

class Tv{
	boolean power;
	int channel; 
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() { --channel;}
}
class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}


public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv cTv = new CaptionTv();
		cTv.channel = 10;
		cTv.channelUp();
		System.out.println(cTv.channel);
		cTv.displayCaption("hello, World");
		cTv.caption = true;
		cTv.displayCaption("hello, World");
		
	}
}
