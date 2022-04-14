import java.util.*;
public class Method{
	public static void main(String[] args){
		int sum = 0;
		if(args.length == 0){
			System.out.println("コマンドライン引数はありません。");
		}else{
			for(String s:args){
				sum += Integer.parseInt(s);
			}
		}
		System.out.println(sum);
	}

}
