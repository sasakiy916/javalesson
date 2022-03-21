import java.util.*;

public class Ex3_0{
	public static void main(String[] args){
		//ex1();
		//ex3();
		ex5();
		//ex6();
	}

	public static void ex1(){
		int weight = 60;
		int age1 = 30;
		int age2 = 3;
		int age = 3;
		String name = "湊";

		if(weight == 60){
			System.out.println("等しい");
		}
		if((age1 + age2) * 2 > 60){
			System.out.println("60より大きい");
		}
		if(age % 2 == 1){
			System.out.println("奇数");
		}
		if(name == "湊"){
			System.out.println(name);
		}
	}

	public static void ex3(){
		int isHungry = 1;
		String food = "豚汁";

		System.out.println("こんにちは");

		if(isHungry == 0){
			System.out.println("お腹がいっぱいです");
		}else{
			System.out.println("はらぺこです");
			System.out.println(food + "をいただきます");
		}

		System.out.println("ごちそうさまでした");
	}

	public static void ex5(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("1:検索 2:登録 3:削除 4:変更>");
		int selected = scanner.nextInt();

		switch(selected){
			case 1:
				System.out.println("検索します");
				break;
			case 2:
				System.out.println("登録します");
				break;
			case 3:
				System.out.println("削除します");
				break;
			case 4:
				System.out.println("変更します");
				break;
		}
	}
	
	public static void ex6(){
		System.out.println("【数あてゲーム】");
		int ans = new Random().nextInt(10);
		System.out.println("答え：" + ans);
		Scanner scanner = new Scanner(System.in);

		for(int count=5; count > 0; count--){
			System.out.print("0~9の数字を入力してください。残り" + count + "回:");
			int num = scanner.nextInt();

			if(num == ans){
				System.out.println("アタリ！");
				break;
			}else{
				System.out.println("違います");
			}
		}

		System.out.println("ゲームを終了します");
	}
}
