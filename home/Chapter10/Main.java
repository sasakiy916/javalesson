public class Main{
	public static void main(String[] args){
		Hero h = new Hero();
		System.out.println("現在HP：" + h.hp);
		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(h);
		System.out.println("残りHP：" + h.hp);
		System.out.println("saasaki\nsasaki");
	}
}
