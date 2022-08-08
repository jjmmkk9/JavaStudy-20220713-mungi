package j14_lombok.builderPractice;

public class ProductMain {

	public static void main(String[] args) {
		
		Product product = Product.builder()  //생성한 적 없는데 . 찍고 메소드 씀
		.productCode(20220802)
		.productCategory("텀블러")
		.build();
		
		System.out.println(product);

	}

}
