import java.util.*;

public class Janken{
	public static void main(String[] args){
		/*
		 * 手を入力(グー:0, チョキ:1, パー:2)>>1
		 * あなたはチョキ、PCはパー
		 * あなたの勝ちです。
		 */

		System.out.print("手を入力(グー:0, チョキ:1, パー:2)>>");
		int myHand = new Scanner(System.in).nextInt();
		int pcHand = new Random().nextInt(3);
		String myHandString;
		String pcHandString;
		if(myHand == 0){
			myHandString = "グー";
		}else if(myHand == 1){
			myHandString = "チョキ";
		}else if(myHand == 2){
			myHandString = "パー";
		}else{
			myHandString = "反則";
		}

		if(pcHand == 0){
			pcHandString = "グー";
		}else if(pcHand == 1){
			pcHandString = "チョキ";
		}else{
			pcHandString = "パー";
		}
		
		String game;
		if(myHand == 0){
			if(pcHand == 0){
				game = "あいこ";
			}else if(pcHand == 1){
				game = "勝ち";
			}else{
				game = "負け";
			}
		}else if(myHand == 1){
			if(pcHand == 0){
				game = "負け";
			}else if(pcHand == 1){
				game = "あいこ";
			}else{
				game = "勝ち";
			}
		}else if(myHand == 2){
			if(pcHand == 0){
				game = "勝ち";
			}else if(pcHand == 1){
				game = "負け";
			}else{
				game = "あいこ";
			}
		}else{
			game = "グーチョキパー以外なのであなたの反則負けです。";
		}

		System.out.println("あなたは" + myHandString + " PCは"+ pcHandString);
		if(game.equals("あいこ")){
			System.out.println("あいこです！");
		}else if(game.equals("勝ち") || game.equals("負け")){
			System.out.println("あなたの" + game + "です。");
		}else{
			System.out.println(game);
		}
	}
}
