package Inheritance;

public class SubTest2 extends Test1{
	
	private String name1;
	
	public SubTest2() {}
	
	public SubTest2(String name) {
		super(name);
	}
	@Override
	public String toString() {
		
		return String.format("111=> %s", this.getName());
	}
	
}
