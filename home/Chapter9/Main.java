public class Main{
	public static void main(String[] args){
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero("ミナト");
		h.sword = s;
		System.out.println(h.name + "は" + h.sword.name + "で攻撃した！");
		System.out.println(h.hp);
	}
}
