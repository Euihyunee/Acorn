package Inheritance;

public class Person {
	
	// 필드 영역
	private String name; 
	private String number;
	private int age;
	private String address;

	
	// 생성자 영역 
	public Person(String name, String number, int age, String address) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.address = address;
	}
	// 기본 생성자 
	public Person() {	}
	
	// Getter/Setter

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// 오버라이드(재정의 함수) : toString() : return "이름 :
	@Override
	public String toString() {
		return String.format("이름 : %s, 휴대전화 : %s, 나이 : %d, 주소 : %s ",
				this.name, this.number, this.age, this.address);
	}

}
