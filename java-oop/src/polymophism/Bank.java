package polymophism;

public interface Bank {
	
	public String open(String name,int number);
	//개설
	public String search();
	//조회
	public String deposit(int money);
	//입금
	public String withdraw(int money);
	//출금
	
}
