package j14_lombok.builderPractice;

public abstract class ProductBuilder {
	protected Product product; //이거 왜하는 건데../\?
	
	public Product build() {
		return product;  
	}
	
	public ProductBuilder builder() {
		product = new Product();
		return this;
	}
	 
	public abstract ProductBuilder code(int productCode);
	public abstract ProductBuilder name(String productName);
	public abstract ProductBuilder category(String productCategory);
	public abstract ProductBuilder date(String createDate);

}

