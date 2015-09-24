package inheritance;


public class MinousAccount extends HanbitAccount {
	private int restMoney; // 잔액 
	private int yaho;	//야호!
	private String ownerName;
	private String password; 
	public static final String BANK_NAME1 = "러시앤 캐시";
	 //오버라이딩
	@Override
	public void withdraw(int money) {
		/**
		 * 출금 메소드
		 */
		this.restMoney -= money;
		if (money == -30000000){
		}
		}
	public void dipeosit(int money) {
		this.restMoney += money;
		if (money >=0 ) {
					}
	}
	
	
	public int getRestMoney() {
		return restMoney;
	}
	public void setRestMoney(int number2) {
		this.restMoney = number2;
	}
	public int getYaho() {
		return yaho;
	}
	public void setYaho() {
		this.yaho = (int)((Math.random()*999999)+100000);
	}
	
	public String getOwnerName() {
		return ownerName;
	}

	public String getPassword() {
		return password;
	}

	public void setOwnerName(String name) {
		this.ownerName = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return ownerName+"님\n 비밀번호:******\n계좌번호: "+yaho+"\n은행 :" + BANK_NAME1+"통장이 개설되었습니다.\n"
				+ "현재 통장의 잔액은 "+restMoney+"원 입니다.";
	}
	
}