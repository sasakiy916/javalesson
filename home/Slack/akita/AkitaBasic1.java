public class AkitaBasic1{
	public static void main(String[] args){
		String[] menus = {"パーティー","アイテム","クエスト"};
		String[] heros = {"リバァイ","ゆうた","†クラウド†","わし(53)"};
		String[] items = {"やくそう","どくけし","らすとえりくさー","しろいこな","メガトンコイン"};
		String[] quests = {"迷子の猫を探して！","隣町までお使い","ちょっと魔王倒してこい","わがまま王女のお願い","古の秘宝"};
		bullet(menus);
		bullet(heros);
		bullet(items);
		bullet(quests);
	}
	public static void bullet(String[] strs){
		System.out.println("-------------------------------");
		for(int i=0;i<strs.length;i++){
			System.out.println(i + ":" + strs[i]);
		}
		System.out.println("-------------------------------");
	}
}
