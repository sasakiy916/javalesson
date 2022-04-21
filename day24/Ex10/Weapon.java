public class Weapon extends Item{
	public Weapon(){
		super("無銘");
	}
	public Weapon(String name){
		super(name);
	}
}
class Item{
	String name;
	int price;
	Item(){
	}
	Item(String name){
		this.name = name;
		this.price = 0;
	}
	Item(String name,int price){
		this(name);
		this.price = price;
	}
}
