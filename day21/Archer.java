public class Archer{
	char suffix;
	int power;
	public Archer(char suffix,int power){
		this.suffix = suffix;
		this.power = power;
	}
	public int attack(){
		System.out.printf("アーチャー%sの攻撃(%dpower)",this.suffix,this.power);
		return this.power;
	}
}
