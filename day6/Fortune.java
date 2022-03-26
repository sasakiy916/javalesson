import java.util.*;
public class Fortune{
	public static void main(String[] args){
		int fortune = new Random().nextInt(10)+1;
		switch(fortune){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("大吉");
				break;
			case 7:
				System.out.println("中吉");
				break;
			case 8:
				System.out.println("吉");
				break;
			default:
				System.out.println("凶");
		}
	}
}
