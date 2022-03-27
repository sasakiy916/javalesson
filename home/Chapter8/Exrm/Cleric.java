import java.util.*;
public class Cleric{
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfAid(){
		System.out.println(this.name + "はセルフエイドを唱えた");
		this.mp -= 5;
		System.out.println(this.name + "のHPが最大まで回復した");
		this.hp = this.MAX_HP;
	}
	public int prey(int sec){
		System.out.println(this.name + "は" + sec + "秒間祈った");
		int recover = sec + new Random().nextInt(3);
		int recoverActual = Math.min(this.MAX_MP - this.mp,recover);
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
}
