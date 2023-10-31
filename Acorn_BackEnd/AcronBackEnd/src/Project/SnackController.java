package Project;

public class SnackController {
	private Snack s;
	
	public SnackController() {}
	
	public Snack saveData(String kind, 
			String name, String flavor,
			int numOf, int price) {
		System.out.println("SnackController 개체의 saveData() 메소드 실행.");
		s = new Snack(kind, name, flavor, numOf, price);
		System.out.println("저장 완료되었습니다.");
		
		return s;
	}
	
}
