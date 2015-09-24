package polymophism;

import java.util.Scanner;

public class BankService implements Bank {
	Account account = new Account();
	
	@Override
	public String deposit(int money) {
		account.deposit(money);
	return account.toString();
	}

	@Override
	public String withdraw(int money) {
		account.withdraw(money);
		return account.toString();
	}

	@Override
	public String search() {
		return account.toString();		
	}

	@Override
	public String open(String name,int number) {
		account.setAccountNo();
		account.setOwnerName(name);
		return account.toString();
				
	}
}