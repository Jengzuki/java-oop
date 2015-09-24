package inheritance;

import java.util.Scanner;

public class MinousAccountMain {
	public static void main(String[] args) {
		MinousAccount maccount = new MinousAccount();
		int key = 0, i = 1;
		int number2;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("원하는 업무를 선택해주세요.\n"
		+ "1 : 통장개설, 2 : 잔액조회, 3 : 입금, 4 : 출금, 5 : 정지");
			key = scanner.nextInt();
			System.out.println(i+"\t");
		switch (key) {
		case 1:
			System.out.println("이름입력");
			String name = scanner.next();
			System.out.println("통장비번");
			String number = scanner.next();
			maccount.setOwnerName(name);
			maccount.setAccountNo();
			System.out.println(maccount.toString()); break;
		case 2:
			System.out.println("고객님의 잔액은"+maccount.getRestMoney()+"입니다.");
			number2 = scanner.nextInt();
			maccount.setRestMoney(number2);
			System.out.println(maccount.toString()); break;
		case 3: System.out.println("입금하실 금액을 입력해주세요.");
			number2 = scanner.nextInt();
			maccount.deposit(number2);
			System.out.println("잔액은"+maccount.getRestMoney()+"입니다.");
			System.out.println(maccount.toString());			
			break;
		case 4:
			System.out.println("출금하실 금액을 입력해주세요.");
			number2 = scanner.nextInt();
			maccount.withdraw(number2);
			System.out.println(maccount.toString());
			break;
		case 5: 
			return;
			
		default:
			break;
		}
		}
	}
}
