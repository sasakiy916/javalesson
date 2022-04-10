import java.util.*;
public class BattleManager{
	public static void main(String[] args){
		int turnNum = new Random().nextInt(5)+1;
		int attack = new Random().nextInt(50)+1;
		System.out.println("モンスターを見つけた!!");
		System.out.printf("奇襲に成功!%dターンの間、攻撃出来る%n",turnNum);
		if(battle(turnNum,attack)){
			System.out.println("---------------------------");
			System.out.println("モンスターを倒した!!");
		}else{
			System.out.println("---------------------------");
			System.out.println("モンスターを倒しきれなかった・・・");
		}
	}

	public static boolean battle(int turnNum,int attack){
		int enemyHp = 100;
		for(int i=1;i<=turnNum;i++){
			System.out.printf("モンスターの残りHP:%d%n",enemyHp);
			System.out.println("---------------------------");
			System.out.printf("%dターン目%n",i);
			System.out.printf("%dダメージを与えた%n",attack);
			enemyHp -= attack;
		}
		System.out.println("攻撃終了");
		if(enemyHp>=0){
			System.out.printf("モンスターの残りHP:%d%n",enemyHp);
			return false;
		}
		enemyHp = 0;
		System.out.printf("モンスターの残りHP:%d%n",enemyHp);
		return true;
	}
}
