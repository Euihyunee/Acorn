package acorn_project;

public class Product {

    private  Long ProductId;
    private  String ProductName;
    private  Long Price;

    public Product() {
    }
    public Product(Long productId, String productName, Long price) {
		ProductId = productId;
		ProductName = productName;
		Price = price;
	}
	public Product(Product product) {
    	this.ProductId =product.getterProductId();;
    	this.ProductName =product.getterProductName();;
    	this.Price =product.getterPrice();; 
    }
    public Long getterProductId() {
    	return ProductId;
    }
    public String getterProductName() {
    	return ProductName;
    }
    public Long getterPrice() {
    	return Price;
    }
    
    @Override
    public String toString() {
    	return String.format(this.ProductId + ". "
    			+"상품명 : " 
    			+ this.ProductName 
    			+ ", 가격 : " + this.Price + "원"
    			);
    }

}