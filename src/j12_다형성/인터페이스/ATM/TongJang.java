package j12_다형성.인터페이스.ATM;

import java.util.Scanner;

public class TongJang {
	private Scanner scanner;
	private String name;
	private String accountNumber;
	private String password;
	private String copy;
	private short money;
	
	public TongJang() {}
	
	public TongJang(String name, String accountNumber, String password) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.password = password;
		copy = password;
	}
	
	public void Deposit() {
		System.out.println("입금합니다.");
	}
	
	public void Withdrawal(String password) {
		System.out.print("비밀번호를 입력하세요: ");
		password = scanner.nextLine();
		if(copy.equals(password)) {
			System.out.print("인출합니다. 금액을 입력하세요: ");
			
			
		}else {
			System.out.println("비밀번호 오류.");
		}
		
	}
}
