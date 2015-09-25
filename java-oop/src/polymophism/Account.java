package polymophism;
/**
 * @file_name : Account.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 9. 24.
 * @Story	  : 통장 개설 프로그램
 */
public class Account {
	protected int accountNo; // 계좌번호
	protected String ownerName; // 계좌주인
	private String passsword; // 통장비번
	protected int restMoney; 	  //잔액
	protected static final String BANK_NAME = "한빛뱅크";
	
	
	/**
	 * 생성자를 만드시오.
	 * 단, 통장을 만듬과 동시에 은행이름이 통장바깥에 새겨지며 (상수)
	 * 계좌번호는 랜덤숫자로 만들어지며(총 6자리로 합시다)
	 * 계좌주인의 이름은 새겨지며 비번도 설정합니다.
	 * 다만, 잔액은 통장이 만들어진 이후에 입금이 되겠지요.
	 */
	public void deposit(int money) {
		
			this.restMoney += money;
			if (money >= 0) {
				}
		}
		public void withdraw(int money) {
			this.restMoney -= money;
			if (money == 0){
			}
			}
		
	public int getAccountNo() {
		return accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getPasssword() {
		return passsword;
	}

	public int getRestMoney() {
		return restMoney;
	}

	public void setAccountNo() {
		this.accountNo = (int)((Math.random()*999999)+100000);
	}

	public void setOwnerName(String name) {
		this.ownerName = name;
	}

	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}

	public void setRestMoney(int money) {
		this.restMoney = money;
		
	}
@Override
public String toString() {
	return ownerName+"님\n 비밀번호:******\n계좌번호: "+accountNo+"\n은행 :" + BANK_NAME+"통장.\n"
			+ "현재 통장의 잔액은 "+restMoney+"원 입니다.";
	}

}
