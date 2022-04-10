import java.util.*;
public class ShuffleMethod{
	public static void main(String[] args){
		int[] shuffles = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(shuffles));
		System.out.println();

		System.out.println("レッツ！シャッフル！");
		int shuffleNum = shuffleMethod(shuffles);
		System.out.println(Arrays.toString(shuffles));
		System.out.println("頭の数字:" + shuffleNum);
		System.out.println();
		
		System.out.println("再度！シャッフル！");
		shuffleNum = shuffleMethod(shuffles);
		System.out.println(Arrays.toString(shuffles));
		System.out.println("頭の数字:" + shuffleNum);
	}

	public static int shuffleMethod(int[] shuffles){
		for(int i=0;i<shuffles.length-1;i++){
			for(int j=0;j<shuffles.length;j++){
				int idx = new Random().nextInt(shuffles.length);
				int temp = shuffles[idx];
				shuffles[idx] = shuffles[j];
				shuffles[j] = temp;
			}
		}
		return shuffles[0];
	}
}
