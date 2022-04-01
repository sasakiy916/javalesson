import java.util.*;
public class Score{
	public static void main(String[] args){
		System.out.print("人数>>");
		int num = new Scanner(System.in).nextInt();
		int[] scores = new int[num];
		for(int i=0;i<scores.length;i++){
			scores[i] = new Random().nextInt(101)+1;
		}
		System.out.println(Arrays.toString(scores));
		for(int i=0;i<scores.length-1;i++){
			for(int j=i+1;j<scores.length;j++){
				if(scores[i]<scores[j]){
					int temp = scores[i];
					scores[i] = scores[j];
					scores[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(scores));
	}
}
