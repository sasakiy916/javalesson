public abstract class TangibleAsset extends Asset implements Thing{ 
	String color;
	double weight;

	public TanfibleAsset(String name, int price, String color){
		super(name,price);
		this.color = color;
	}

	public void getColor(){return this.color;}
	public void getWeight(){return this.weight;}
	public double setWeight(double weight){this.weight = weight;}
}
