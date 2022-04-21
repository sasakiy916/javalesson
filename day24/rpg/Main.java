public class Main{
	public static void main(String[] args){
		Dancer d = new Dancer("ゼシカ");
		Matango m = new Matango();
		d.attack(m);
		d.dance();
		m.hp += 20;
		Wizard w = new Wizard("ピピ");
		w.attack(m);
		w.warp();
	}
}
