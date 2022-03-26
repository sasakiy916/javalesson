public class Wand{
	private String name;
	private double power;
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		if(name.length() < 3){
			throw new IllegalArgumentException("3文字以上で名前を設定してください");
		}else{
			this.name = name;
		}
	}
	public double getPower(){
		return this.power;
	}
	public void setPower(double power){
		if(power < 0.5 || power >100){
			throw new IllegalArgumentException("powerは0.5以上100以下で設定してくだい");
		}else{
			this.power = power;
		}
	}
}
