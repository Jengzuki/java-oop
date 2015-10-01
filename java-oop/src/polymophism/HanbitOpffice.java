package polymophism;

import java.util.Scanner;

public class HanbitOpffice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Admin service = new AdminService(1000);
		//인터페이스 객체 = new 인터페이스를 구현한 클레스 생성자.
		Account account = new Account();
		BankService bang = new BankService();
		
		while (true) {
			System.out.println("관리자 화면.\n" + "1 : 통장개설 2. 검색(계좌번호) 3.검색(이름) 4.총계좌수 5.해지 6.종료 ");
			int key = scanner.nextInt();
			switch (key) {
			case 1: System.out.println("계좌번호 입력");
			int accountNo = scanner.nextInt();
			System.out.println("이름입력");
			String name = scanner.next();
			System.out.println("입금액 입력");
			int restMoney = scanner.nextInt();
			System.out.println(service.openAccount(accountNo, name, restMoney)); break;
			
			case 2: 
				System.out.println("찾는 계좌를 적어주세요.");
				int retrieval = scanner.nextInt(); 
				System.out.println(service.searchAccountByAccountNo(retrieval));
				break;
			
			case 3: System.out.println("찾는 이름을 적어주세요");
				String name2 = scanner.next();
				System.out.println(service.searchAccountsByName(name2)); 
				
			break;
			case 4: System.out.println(service.countAll()); break;
				
			case 5: System.out.println("해지할 계좌번호를 입력해주세요.");
					int closeAccount = scanner.nextInt();
					System.out.println(service.closeAccount(closeAccount));
					break;
						
				case 6:
					return;

				default: System.out.println("입력이 잘못되었습니다. 하실 업무를 다시 입력해주세요.");
					break;

			}
	}
}
}