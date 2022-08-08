package j14_lombok.builderPractice;

public class Builder extends ProductBuilder{

	@Override  //내가 재정의한겨
	public ProductBuilder code(int productCode) {
		product.setProductCode(productCode);
		return this;
	}

	@Override
	public ProductBuilder name(String productName) {
		product.setProductName(productName);
		return this;
	}

	@Override
	public ProductBuilder category(String productCategory) {
		product.setProductCategory(productCategory);;
		return this;
	}

	@Override
	public ProductBuilder date(String createDate) {
		product.setCreateDate(createDate);;
		return this;
	}

	
	
}
