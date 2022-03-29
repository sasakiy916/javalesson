import java.util.*;
public class Dice{
	public static void main(String[] args){
		int r = new Random().nextInt(6)+1;
		/*
		String result;
		if(r%2 == 0){
			result = "偶数";
		}else{
			result = "奇数";
		}
		*/
		String result = r%2 == 0?"偶数":"奇数"; 
		System.out.printf("%dは%sです%n",r,result);
	}
}
