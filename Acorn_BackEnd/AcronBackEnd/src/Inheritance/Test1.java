package Inheritance;

public class Test1 {

	// 필드 영역
	private String name;
	// 생성자 영역
	public Test1() {}
	
	public Test1(String name) {
		this.name = name;
	}
	
	// 메소드 영역
	
	
	
	// Getter/Setters 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	// 정적 영역
	
	@Override
	public String toString() {
		
		return String.format("=> %s", name);
	}
	// 동적 영역 
}
