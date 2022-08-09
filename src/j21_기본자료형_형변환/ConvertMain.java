package j21_기본자료형_형변환;

public class ConvertMain {

	public static void main(String[] args) {
		String num1 = "10";
		int num2 = 20;
		
		int result = (Integer.parseInt(num1)) + num2 ;
					//문자열을 int로 변환
		System.out.println(result);
		
		
		
		String dnum1 = "3.14";
		double dnum2 = 1.2;
		
		double resultD = (Double.parseDouble(dnum1)) + dnum2;
							//문자열을 double로 변환
		System.out.println(resultD);
		
		
		
		String flag = "true";
		boolean flag2 = Boolean.parseBoolean(flag);
		
		System.out.println(!flag2);  //!true
		
		String flag3 = Boolean.toString(flag2);
		System.out.println(flag3);

	}

}
