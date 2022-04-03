import java.util.*;
public class Account{
	String accountNumber;
	int balance;

	public Account(String accountNumber, int balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String toString(){
		return "\\" + this.balance + "(口座番号:" + this.accountNumber +")";
	}
	public boolean equals(Object o){
		if(this == o){return true;}
		if(o instanceof Account){
			Account a = (Account)o;
			String str1 = this.accountNumber.trim();
			String str2 = a.accountNumber.trim();
			if(str1.equals(str2)){
				return true;
			}
		}
		return false;
	}
}
