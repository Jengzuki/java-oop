package polymophism;

public class AdminService implements Admin {
	private Account[] accountList;
	private int count;

	public AdminService() {
		this(0);
	}

	public AdminService(int count) {
		accountList = new Account[1000];
	}

	public Account[] getAccountList() {
		return accountList;
	}

	public int getCount() {
		return count;
	}

	public void setAccountList(Account[] accountList) {
		this.accountList = accountList;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String openAccount(int accountNo, String name, int restMoney) {
		Account account = new Account();
		String msg = "";
		account.setAccountNo();
		account.setOwnerName(name);
		account.setRestMoney(restMoney);
		accountList[count] = account;
		count++;
		msg = account.toString();
		return msg;
	}

	@Override
	public Account searchAccountByAccountNo(int accountNo) {
		Account serchAccount = null;
		for (int i = 0; i < this.getCount(); i++) {
			if (accountList[i].getAccountNo() == accountNo) {
				serchAccount = accountList[i];
			}
		}
		return serchAccount;
	}

	@Override
	public Account[] searchAccountsByName(String name) {
		int tempCount =0; //searchAccountbyName(name);
		for (int i = 0; i < count; i++) {
			if (accountList[i].getOwnerName().equals(name)) {
					tempCount++;
			}
		}
		
		Account[] tempList = new Account[tempCount];
		tempCount = 0; 
		for (int i = 0; i < count; i++) {
			if (accountList[i].getOwnerName().equals(name)) {
				tempList[tempCount] = accountList[i];
				tempCount++;
			}
		}
		return tempList;
	}
	
	@Override
	public String closeAccount(int accountNo) {
		String result = "해지할 계좌가 존재하지 않습니다.";
		for (int i = 0; i < accountList.length; i++) {
			if (accountList[i].getAccountNo() == accountNo) {
				accountList[i] = accountList[count - 1];
				accountList[count-1] = null;
				result = "요청하신 계좌를 해지하였습니다.";
			}
			
		}
		count--;
		return result;
	}

	@Override
	public int countAll() {
		return this.getCount();
	}

}
