import java.util.*;
public class HighLow{
	public static void main(String[] args){
		/*
		 * 最初に１枚のカードが表示される。(1~13のランダム)
		 * 次のカードが１枚目のカードより大きいか小さいかを予想する。
		 * 当たられたらwin。
		 *○1が最小、13が最大と考えて良い
		 *○同じ番号が出た場合は無条件でLose
		 */

		System.out.println("【High&Lowゲーム】\n");
		int firstCard = new Random().nextInt(13) + 1;
		int nextCard = new Random().nextInt(13) + 1;

		System.out.println("現在のカード;" + firstCard);
		System.out.print("High か Low か（High:0, Low:1で入力）:");
		int highLow = new Scanner(System.in).nextInt();
		System.out.println(nextCard);
		boolean isHighLow;

		if(nextCard == firstCard){
		isHighLow = false;	
		}else if(nextCard > firstCard){
			if(highLow == 0){
				isHighLow = true;
			}else{
				isHighLow = false;
			}
		}else{
			if(highLow == 1){
				isHighLow = false;
			}else{
				isHighLow = true;
			}
		}

		if(isHighLow){
			System.out.println("You Win!!");
		}else{
			System.out.println("You Lose");
		}
	}
}
