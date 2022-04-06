import java.util.*;
public class MorozumiQues{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int result = 1;
		for(int i=0;i<b;i++){
			result *= a;
		}
		System.out.printf("%dの%d乗は%dです",a,b,result);
	}
}
