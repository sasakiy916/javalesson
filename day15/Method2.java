import java.util.*;
public class Method2{
	public static void main(String[] args){
		System.out.printf("%d line win%n",slot());
	}
	//配列の中が全部一緒か判定
	public static boolean isSame(int[] arr){
		int first = arr[0];
		for(int i=1;i<arr.length;i++){
			if(first != arr[i]){
				return false;
			}
		}
		return true;
	}
	//スロット
	public static int slot(){
		int bingo = 0;
		int[][] nums = new int[3][3];
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				nums[i][j] = new Random().nextInt(3)+1;
				System.out.print(nums[i][j]);
			}
			if(isSame(nums[i])){
			bingo++;
			}
			System.out.println();
		}
		return bingo;
	}
}
