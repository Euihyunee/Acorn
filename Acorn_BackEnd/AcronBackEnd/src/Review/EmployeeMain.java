package Review;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee em = new Employee(12, "정의현", 300);
		
		System.out.println("연봉 : " + em.getSalaryForYear() + "만원");
	}

}
