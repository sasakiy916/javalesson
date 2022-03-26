import java.util.*;

public class Ex5_1{
	public static void main(String[] args){
		introduceOneself();
	}

	public static void introduceOneself(){
		String name;
		int age;
		double height;
		char zodiac;

		System.out.print("あなたの名前は：");
		name = new Scanner(System.in).nextLine();
		System.out.print("年齢は：");
		age = new Scanner(System.in).nextInt();
		System.out.print("身長は：");
		height = new Scanner(System.in).nextDouble();
		System.out.print("十二支は：");
		zodiac = new Scanner(System.in).next().charAt(0);

		System.out.println("私の名前は" + name + "。年齢は" + age + "歳で、身長は" + height + "cm。十二支は" + zodiac + "座です。");
	}
}
