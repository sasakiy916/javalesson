public class Hero{
	String name = "ミナト";
	int hp = 100;

	Hero(){
		System.out.println("Heroのコンストラクタ");
	}
	public void attack(Matango m){
		System.out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた");
	}
	public void run(){
		System.out.println(this.name + "は逃げ出した");
	}
}
class Matango{
	int hp = 50;
	char suffix;
	public Matango(char suffix){
		this.suffix = suffix;
	}
	public void attack(Hero h){
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
}
class PoisonMatango extends Matango{
	int poisonCount = 5;
	PoisonMatango(char suffix){
		super(suffix);
	}
	@Override
	public void attack(Hero h){
		super.attack(h);
		if(poisonCount > 0){
			System.out.println("更に毒の胞子をばらまいた!");
			int damage = h.hp/5;
			h.hp -= damage;
			System.out.println(damage + "ポイントのダメージ!");
			poisonCount--;
		}
	}
}
