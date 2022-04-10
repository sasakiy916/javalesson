import java.util.*;
public class AkitaBasic2{
	public static void main(String[] args){
		int Num1 = selectNum(5);
		System.out.printf("選ばれた数字は%dです%n",Num1);
		int Num2 = selectNum(3);
		System.out.printf("選ばれた数字は%dです%n",Num2);
		int Num3 = selectNum(4);
		System.out.printf("選ばれた数字は%dです%n",Num3);
	}
	public static int selectNum(int num){
		System.out.printf("1~%dの整数を入力>>",num);
		int selectNum = 0;
		while(true){
			selectNum = new Scanner(System.in).nextInt();
			if(selectNum < 1 || selectNum > num){
				System.out.println("再入力をお願いします.");
				System.out.printf("1~%dの整数を入力>>",num);
			}else{
				break;
			}
		}
		return selectNum;
	}
}
