import java.util.*;

public class Cleric{
	String name;
	int hp = 50;
	final int Max_Hp = 50;
	int mp = 10;
	final int Max_Mp = 10;

	public void selfAid(){
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = Max_Hp;
		System.out.println("Hpが最大まで回復した");
	}

	public int pray(int sec){
		System.out.println(this.name + "は" + sec + "秒間天に祈った！"); 

		int recover = new Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.Max_Mp - this.mp, recover);

		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");

		return recoverActual;
	}
}
