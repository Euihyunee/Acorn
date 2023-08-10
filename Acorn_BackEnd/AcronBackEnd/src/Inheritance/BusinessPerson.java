package Inheritance;

public class BusinessPerson extends Person{
	// 필드 영역
	private String company;

	// 생성자 영역
	
	// 기본 생성자 
	public BusinessPerson() {
		System.out.println("BusinessPerson() 기본 생성자");
	}
	// 인자 있는 생성자 
	public BusinessPerson(String company) {
		System.out.println("BusinessPErson() company 인자 생성자 ");
		this.company = company;
	}
	public BusinessPerson(String name, String number, int age, String address,String company) {
		super(name,number,age,address);
		this.company = company;
	}
	// 메소드 영역
	@Override
	public String toString() {
		return String.format("이름 : %s, 회사 : %s,  휴대전화 : %s, 나이 : %d, 주소 : %s ",
				this.getName(), this.company, this.getNumber(), this.getAge(), this.getAddress());
	}
	// Getter/Setter
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
}
