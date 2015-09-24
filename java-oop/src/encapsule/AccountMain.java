package encapsule;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class AccountMain {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int i = 1 , key = 0;
	Account account = new Account();
	int number2;
	while (true) {
		System.out.println("원하는 업무를 선택해주세요.\n"
	+ "1 : 통장개설, 2 : 잔액조회, 3 : 입금, 4 : 출금, 5 : 정지");
		key = scanner.nextInt();
		System.out.println(i+"\t");
	switch (key) {
	case 1: System.out.println("이름을 입력하세요");
		 String name = scanner.next(); 
		 System.out.println("통장 비밀번호를 입력하세요");
		 String number = scanner.next();
		 account.setAccountNo();
		 account.setOwnerName(name);
		 System.out.println(account.toString());
		 break; 
	case 2:System.out.println("잔액은");
		number2 = scanner.nextInt();
	 	account.setRestMoney(number2);
	 	System.out.println(account.toString());
	 	break;
	case 3: 
		System.out.println("입금이 가능합니다.");
		System.out.println("입금할 금액을 입력해주세요.");
		number2 = scanner.nextInt();
		account.deposit(number2);
		System.out.println("잔액은"+account.getRestMoney());
		System.out.println(account.toString());break;
	case 4:
		System.out.println("출금이 가능합니다.");
		System.out.println("출금할 금액을 입력해주세요");
		number2 = scanner.nextInt();
		account.withdraw(number2);
		System.out.println("잔액은"+account.getRestMoney());;
		System.out.println(account.toString());break;
	case 5: return;

	default:
		break;
	}
	}
	}	
}