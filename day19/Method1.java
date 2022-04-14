import java.util.*;
public class Method1{
	public static void main(String[] args){
		if(args.length == 0){
			System.out.println("コマンドライン引数はありません");
		}else{
			System.out.println(Arrays.toString(args));
			int sum=0;
			for(String s:args){
				System.out.println(s);
				sum += Integer.parseInt(s);
			}
			System.out.println("引数の合計は"+sum);
		}
	}
}
