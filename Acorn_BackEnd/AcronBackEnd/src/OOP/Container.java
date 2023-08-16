package OOP;

public class Container {
	
	private String name;
	public Container(String name, int product1, int product2, int product3, int product4) {
		super();
		this.name = name;
		this.product1 = product1;
		this.product2 = product2;
		this.product3 = product3;
		this.product4 = product4;
	}
	public Container() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProduct1() {
		return product1;
	}
	public void setProduct1(int product1) {
		this.product1 = product1;
	}
	public int getProduct2() {
		return product2;
	}
	public void setProduct2(int product2) {
		this.product2 = product2;
	}
	public int getProduct3() {
		return product3;
	}
	public void setProduct3(int product3) {
		this.product3 = product3;
	}
	public int getProduct4() {
		return product4;
	}
	public void setProduct4(int product4) {
		this.product4 = product4;
	}
	private int product1;
	private int product2;
	private int product3;
	private int product4;
	
	
}
