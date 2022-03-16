public class Rpg2{
	public static void main(String[] args){
		String name = "アルク";
		int hp = 100;
		int attack =50;

		String ename = "ドラキー";
		int ehp = 50;
		int eattack = 50;

		System.out.println(ename + "が現れた");
		System.out.println(ename + "の先制攻撃！");
		System.out.println(name + "に" + eattack + "のダメージ");
		hp = hp - eattack;
		System.out.println(name + "(" + hp + ")");
		System.out.println(name + "の攻撃！");
		System.out.println(ename + "に" + attack + "のダメージ");
		ehp = ehp - attack;
		System.out.println(ename + "(" + ehp + ")");
		System.out.println(ename + "を倒した");
	}
}
