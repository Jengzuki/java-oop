package polymophism;

import java.util.Scanner;

import encapsule.Account;

public class HanbitBank {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankService servi = new BankService();
		Account account = new Account();
		System.out.println("입금액을 입력해주세요");
		
		while (true) {
			System.out.println("원하는 업무를 선택해주세요.\n" + "1 : 통장개설 2 : 잔액조회 3 : 출금 4 : 입금 5 : 종료");
			int key = scanner.nextInt();
			switch (key) {
			case 1: System.out.println("이름을 입력하세요");
			String name = scanner.next();
			System.out.println("통장 비밀번호를 입력하세요");
			int number = scanner.nextInt();
			System.out.println(servi.open(name,number)); break;
			
			case 2: System.out.println(servi.search()); break;
			
			case 3:	System.out.println("출금이 가능합니다.");
			System.out.println("출금할 금액을 입력해주세요");
			int money = scanner.nextInt();
			account.withdraw(money);
			System.out.println(servi.withdraw(money));  break;
			
			case 4:
			System.out.println("입금이 가능합니다.");
			System.out.println("입금할 금액을 입력해주세요.");
			money = scanner.nextInt();			
			System.out.println(servi.deposit(money));break;
			case 5: return;
			default: break;

			}
		}
	}
}