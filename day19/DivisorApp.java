package divisorapp.main;
import java.util.*;
import divisorapp.logics.*;
public class DivisorApp{
	public static void main(String[] args){
		if(args.length == 0){
			System.out.println("error:引数を入れて実行してください!");
			return;
		}
		System.out.println("約数を表示");
		for(String s:args){
			System.out.println(s + ":" + Arrays.toString(DivisorAppLogic.createDivisorArr(Integer.parseInt(s))));
		}
	}
}
