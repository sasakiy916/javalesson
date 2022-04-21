public class Wizard extends Character{
	Wizard(String name){
		super(name);
	}
	Wizard(String name, int hp){
		super(name, hp);
	}
	public void attack(Matango m){
		System.out.println(this.name + "はファイガを唱えた！");
		System.out.println("敵に500ダメージ与えた!");
		m.hp -= 500;
		System.out.println("敵は灰と化した・・・");
	}
	public void warp(){
		System.out.println(this.name + "はルーラを唱えた!");
		System.out.println("しかしMPがないため呪文は発動しなかった・・・");
	}
}
