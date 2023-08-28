package acorn_project;

public class BasketProduct extends Product{
	
	private int Num;

	public BasketProduct(Product product) {
		super(product);
		this.Num = 1;
	}
	public void setterNum(int num) {
		this.Num = num;
	}
	public int getterNum() {
		return Num;
	}
	public Long getTotalPrice() {
		return Num * super.getterPrice();
	}
    @Override
    public String toString() {
    	return String.format(super.getterProductId() 
    			+ ". "
    			+ "상품명 : " 
    			+ super.getterProductName() 
    			+ ", 가격 : " + super.getterPrice() + "원"
    			+ this.Num +"개"
    			);
    }
	
}
