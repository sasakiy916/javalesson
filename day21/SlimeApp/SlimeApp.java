public class SlimeApp{
	public static void main(String[] args){
		Slime slime = new Slime("スラ基地",5);
		Slime slime2 = new Slime("スラぼう",6);
		slime.attack();
		slime2.attack();

		Slime[] slimes = new Slime[2];
		slimes[0] = slime;
		slimes[1] = slime2;

		for(Slime s:slimes){
			s.attack();
		}
	}
}
