public class Main{
	public static void main(String[] args){
		Account a = new Account("4649",1592);
		System.out.println(a);
		Account b = new Account(" 4649 ",1592);
		System.out.println(a.equals(b));
	}
}
