public class Main{
	public static void main(String[] args){
		Account a = new Account("4649 ");
		Account b = new Account(" 4649");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
	}
}
