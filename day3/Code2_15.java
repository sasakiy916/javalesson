import java.util.*;
public class Code2_15{
	public static void main(String[] args){
		System.out.println("あなたの名前を入力してください。");
		System.out.print("name>>");
		String name = new Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください。");
		System.out.print("age>>");
		int age = new Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + age + "歳の" + name + "さん");
	}
}	
