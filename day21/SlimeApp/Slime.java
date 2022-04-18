public class Slime{
	String name;
	int power;
	//コンストラクタ
	public Slime(String name,int power){
		this.name = name;
		this.power = power;
		appear();
	}
	//出現
	public void appear(){
		System.out.printf("%sが現れた！！%n",this.name);
	}
	//攻撃
	public void attack(){
		System.out.printf("%sは%dのダメージを与えた!%n",this.name,this.power);
	}
}
