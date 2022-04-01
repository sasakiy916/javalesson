import java.util.*;
public class IntMethod{
	public static void main(String[] args){
		System.out.print("整数はカンマ区切りで入力>>");
		String num = new Scanner(System.in).nextLine();
		String[] data = num.split(",");
		int sum = 0;
		for(int i=0;i<data.length;i++){
			sum += Integer.parseInt(data[i]);
		}
		System.out.printf("合計は%dです。%n",sum);
	}
}
