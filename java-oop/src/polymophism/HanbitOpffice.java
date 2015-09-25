package polymophism;

import java.util.Scanner;

public class HanbitOpffice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		AdminService service = new AdminService(1000);
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
			service.openAccount(accountNo, name, restMoney); break;
			
			case 2: 
				System.out.println("검색해주세요.");
				int retrieval = scanner.nextInt(); 
				Account aa = new Account();
				aa = service.searchAccountByAccountNo(retrieval);
					if (aa == null) {
					System.out.println("계좌가 없습니다.");
				} else {
					aa.toString();
				}
				service.searchAccountByAccountNo(account.getAccountNo());
				break;
			
			case 3:
				for (int i = 0; i < args.length; i++) {
					if ( i == 0) {
						
					}
					System.out.println();
				}
				break;
			case 4:break;
			case 5: break;
			case 6: return;
			default: break;

			}
		}
	}
	}
