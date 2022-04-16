import java.util.*;
public class Cleric{
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP =10;

	//セルフエイド
	public void selfAid(){
		System.out.println(this.name + "セルフエイドを唱えた");
		if(this.mp < 5){
			System.out.println("MPが足りない。");
			return;
		}
		this.mp -= 5;
		this.hp = this.MAX_MP;
		System.out.println("HPが最大まで回復しました。");
	}
	//祈る
	public int pray(int sec){
		System.out.println(this.name + "は" + sec + "秒間祈った");
		int rand = new Random().nextInt(3);
		int recover = sec + rand;
		recover = Math.min(recover,MAX_MP-this.mp);
		this.mp += recover;
		System.out.printf("MPが%d回復した%n",recover);
		return recover;
	}
}
