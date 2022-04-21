public class MonsterApp{
	public static void main(String[] args){
		Goblin g = new Goblin(50,20);
		WereWolf w = new WereWolf(120,30);
		DeathBat d = new DeathBat(30,20);
		g.attack();
		w.attack();
		d.attack();
		g.run();
		w.run();
		d.run();
	}
}
//モンスター
abstract class Monster{
	int hp;
	int mp;
	Monster(int hp,int mp){
		this.hp = hp;
		this.mp = mp;
	}
	public abstract void attack();
	public abstract void run();
}
//歩行モンスター
abstract class WalkingMonster extends Monster{
	WalkingMonster(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void run(){
		System.out.println("トコトコ走って逃げる");
	}
}
//飛行モンスター
abstract class FlyingMonster extends Monster{
	FlyingMonster(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void run(){
		System.out.println("バサバサ飛んで逃げる");
	}
}
//ゴブリン
class Goblin extends WalkingMonster{
	Goblin(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void attack(){
		System.out.println("ナイフで斬りつける");
	}
}
//ウェアウルフ
class WereWolf extends WalkingMonster{
	WereWolf(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void attack(){
		System.out.println("かみつく");
	}
}
//デスバット
class DeathBat extends FlyingMonster{
	DeathBat(int hp,int mp){
		super(hp,mp);
	}
	@Override
	public void attack(){
		System.out.println("突っつく");
	}
}
