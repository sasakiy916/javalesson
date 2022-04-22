import java.util.*;
public class HeroApp{
	public static void main(String[] args){
		Sword[] swords = {
			new Sword("ひのきの棒",15),
			new Sword("鉄の槍",50),
			new Sword("御剣先輩",999),
		};
		int idx = new Random().nextInt(3);
		Hero h = new Hero("佐々木");
		h.attack();
		System.out.printf("%sは%sを拾った。%n",h.name,swords[idx].name);
		h.setSword(swords[idx]);
		h.attack();
	}
}

class Hero{
	String name;
	int hp;
	Sword sword;
	Hero(String name){
		this(name,100);
	}
	Hero(String name,int hp){
		this.name = name;
		this.hp = hp;
	}
	public void attack(){
		if(this.sword == null){
			System.out.printf("%sは素手で攻撃した。5ポイントのダメージ！%n",this.name);
		}else{
			System.out.printf("%sは%sで攻撃した。%dポイントのダメージ！%n",this.name,this.sword.name,this.sword.damage);
		}
	}
	void setSword(Sword sword){
		this.sword = sword;
		System.out.printf("%sは%sを装備した！%n",this.name,this.sword.name);
	}
}

class Sword{
	String name;
	int damage;
	Sword(String name , int damage){
		this.name = name;
		this.damage =damage;
	}
}
