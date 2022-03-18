import java.util.*;
public class Ex3_6{
	public static void main(String[] args){
		System.out.println("数あてゲーム");
		int ans = new Random().nextInt(10);

		for(int i=5; i>0; i--){
			System.out.println("0~9の数字を入力してください:残り " + i + "回");
			int num = new Scanner(System.in).nextInt();
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
