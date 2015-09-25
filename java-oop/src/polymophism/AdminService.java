package polymophism;

public class AdminService implements Admin{
	private Account[] accountList;
	private int count;
	public AdminService(){
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
			if (this.getCount() == accountNo) {
				serchAccount = accountList[i];
						}
		}
		return serchAccount;
	}

	@Override
	public Account[] searchAccountsByName(String name) {
		int tempCount = searchCountByName(name);
		if (tempCount == 0) {
			return null;
		}
		Account[] tempList = new Account[tempCount];
		tempCount = 0; 
		for (int i = 0; i < tempList.length; i++) {
			
			tempCount++;
		}
		return tempList;
	}

	private int searchCountByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String closeAccount(int accountNo) {
		
		return null;
	}

	@Override
	public int countAll() {
		return 0;
	}


	

}
