import java.util.*;
public class ListEx{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<>();
		System.out.println("ArrayListを使ってみよう!");
		System.out.println("Listに数字をどんどん追加していってみよう。");
		while(true){
			System.out.print("要素追加するよ数字を入れてね(0で終了):");
			int input = scan.nextInt();
			if(input == 0){
				break;
			}
			nums.add(input);
			System.out.printf("%dをListに追加したよ！%n",input);
		}
		System.out.println("——結果——");
		System.out.printf("要素数:%d%n",nums.size());
		System.out.printf("要素:%s%n",nums);
	}
}
