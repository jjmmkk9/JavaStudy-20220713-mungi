package j14_lombok.builderPractice;

public class BuilderMain {
	public static void main(String[] args) {
		Builder builder = new Builder();
		Product product = builder.builder()
		.code(20220802)
		.name("크리스피크림 도넛")
		.date("20220802")
		.build();
		System.out.println(product);
	}
}
