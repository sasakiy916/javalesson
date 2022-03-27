public abstract class Asset{
	String name;
	int price;

	public Asset(String name, int price){
		this.name = name;
		this.price = price;
	}
	public abstract getName(){return this.name;}
	public abstract getPrice(){return this.price;}
}
