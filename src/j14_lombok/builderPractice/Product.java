package j14_lombok.builderPractice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
//스태틱 활용 방법 + 빌더   : 근데 이렇게 하면 세터 필요 없나?
public class Product {
	
	
	private int productCode;  		//제품코드  	:20220802
	private String productName; 	//제품명		:스타벅스 텀블러
	private String productCategory;	//제품 카테고리	:텀블러
	private String createDate; 		//생산일자		:2022-08-02
	
	
	public static Product builder() {
//		Product product = new Product();
//		product.setProduct(product);
		return new Product();
	}
	
	public Product build() {
		return this;
	}
	
	public Product productCode(int productCode) {
		this.productCode = productCode;
		return this;
	}
	public Product productName(String productName) {
		this.productName = productName;
		return this;
	}
	public Product productCategory(String productCategory) {
		this.productCategory = productCategory;
		return this;
	}
	public Product createDate(String createDate) {
		this.createDate = createDate;
		return this;
	}

	
	

	
	
}
