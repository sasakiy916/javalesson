import java.util.*;
public class For1{
	public static void main(String[] args){
		System.out.print("いくつ>>");
		int num = new Scanner(System.in).nextInt();
		for(int i=0;i<num;i++){
			System.out.print("*");
		}
		System.out.print();
	}
}
