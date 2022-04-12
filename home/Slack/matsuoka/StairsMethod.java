import java.util.*;
public class StairsMethod{
	public static void main(String[] args){
		System.out.print("何段作りますか？>>");
		int num = new Scanner(System.in).nextInt();
		makeStairs(num);
	}
	static void makeStairs(int num){
		for(int i=0;i<num;i++){
			for(int j=0;j<i+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
