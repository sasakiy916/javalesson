import java.util.Arrays;
public class ArrLesson3{
	public static void main(String[] args){
		int[] dataA = {3,5,10};
		int[] dataB = new int[]{4,6,10};
		//dataA = new int[]{3,55,23};
		//まとめて中身の要素を変更する場合、new 型名[]{}で入力することが出来る
		for(int i = 0;i < dataA.length;i++){
			System.out.println(dataA[i]);
		}
		//dataB = new int[]{7,7,7};
		for(int n:dataB){
			System.out.println(n);
		}
		System.out.println(Arrays.toString(dataA));
	}
}
