public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		if(name.length() < 3){
			throw new IllegalArgumentException("名前は3文字以上で設定してください。");
		}else{
			this.name = name;
		}
	}
	public void setWand(Wand wand){
		this.wand = wand;
	}
	public int getHp(){
		return this.hp;
	}
	public void setHp(int hp){
		if(hp < 0){
			this.hp = 0;
		}else{
			this.hp = hp;
		}
	}
	public int getMp(){
		return this.mp;
	}
	public void setMp(int mp){
		if(mp < 0){
			throw new IllegalArgumentException("MPは0以上で設定する");
		}else{
			this.mp = mp;
		}
	}
	public void heal(Hero h){
		int basePoint = 10;
		int recoverPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した!");
	}
}
