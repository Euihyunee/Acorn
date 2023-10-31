package Inheritance;

public class Main {

	public static void main(String[] args) {
		
//		Person p1= new Person("정의현", "01066485205", 26, "정왕");
//		System.out.println(p1);
//		
//		Person p2 = new Person();
//		System.out.println(p2);
//		
//		BusinessPerson p3 = new BusinessPerson();
//		System.out.println(p3);
//		
//		BusinessPerson p4 = new BusinessPerson("에이콘이즈");
//		System.out.println(p4);
//		
//		BusinessPerson p5 = new BusinessPerson("정의현", "01066485205", 26, "정왕","에이콘이즈");
//		System.out.println(p5);
		
		Test1 t1 = new Test1();
		SubTest2 t2 = new SubTest2("정의현");
		
		System.out.println(t1 +" : " +t1.getClass());
		System.out.println(t2+" : " +t2.getClass());
		System.out.println();
		
		t1.setName(t2.getName());
		System.out.println(t1 +" : " +t1.getClass());
		System.out.println(t2+" : " +t2.getClass());
		System.out.println();
		
		t1 = t2;	
		System.out.println(t1 +" : " +t1.getClass());
		System.out.println(t2+" : " +t2.getClass());
	}
}
