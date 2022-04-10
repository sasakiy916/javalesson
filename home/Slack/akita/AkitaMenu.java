import java.util.*;
public class AkitaMenu{
	public static void main(String[] args){
		String [] menus = {"パーティー","アイテム","クエスト"};
		String [] heros = {"リバァイ","ゆうた","†クラウド†","わし(53)"};
		String [] items = {"やくそう","どくけし","らすとえりくさー","しろいこな","メガトンコイン"};
		String [] quests = {"迷子の猫を探して！","隣町までお使い","ちょっと魔王倒してこい","わがまま王女のお願い","古の秘宝"};
		bullet(menus);
		switch(selectNum(menus.length)){
			case 1:
				bullet(heros);
				break;
			case 2:
				bullet(items);
				break;
			case 3:
				bullet(quests);
				break;
		}
	}

	public static void bullet(String[] strs){
		System.out.println("-------------------------------");
		for(int i=0;i<strs.length;i++){
			System.out.println(i+1 + ":" + strs[i]);
		}
		System.out.println("-------------------------------");
	}

	public static int selectNum(int num){
		System.out.printf("1~%dの整数を入力>>",num);
		int selectNum = 0;
		while(true){
			selectNum = new Scanner(System.in).nextInt();
			if(selectNum < 1 || selectNum > num){
				System.out.println("再入力をお願いします.");
				System.out.printf("1~%dの整数を入力>>",num);
			}else{
				break;
			}
		}
		return selectNum;
	}
}
