public class Account{
	String accountNumber;
	int balance = 1412;
	public Account(String accountNumber){
		this.accountNumber = accountNumber;
	}
	public String toString(){
		return "¥" + this.balance + "(口座番号:" + this.accountNumber + ")";
	}
	public boolean equals(Object o){
		if(this == o){return true;}
		if(o instanceof Account){
			Account a = (Account)o;
			if(this.accountNumber.trim().equals(a.accountNumber.trim())){
				return true;
			}
		}
		return false;
	}
}
