import java.util.*;
public class Main{
	public static void main(String[] args){
		int x = 10;
		int y = x++;//yに入るのは10。後置だとyにxを代入後にx=x+1される。
		System.out.println(y);
		System.out.println(x);
		int x2 = 10;
		int y2 = ++x2;//yに入るのは11。前置だとxに+1してyに代入。
		System.out.println(y2);
		System.out.println(x2);
	}
}
