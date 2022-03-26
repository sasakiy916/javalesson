import java.util.*;
public class Main{
	public static void main(String[] args){
		Hero h = new Hero();
		Wizard w = new Wizard();
		Wand wand = new Wand();
		h.setName("勇者");
		System.out.print("魔法使いの名前:");
		w.setName(new Scanner(System.in).nextLine());
		w.setWand(wand);
		System.out.print("杖の増幅率:");
		wand.setPower(new Scanner(System.in).nextDouble());
		System.out.print("HP:");
		w.setHp(new Scanner(System.in).nextInt());
		System.out.print("MP:");
		w.setMp(new Scanner(System.in).nextInt());
		System.out.println(w.getName().length());
		System.out.println(w.getHp());
		System.out.println(w.getMp());
		w.heal(h);
	}
}
