import java.util.*;
public class ArrayMulti{
	public static void main(String[] args){
		//マップ表示やテトリスの盤面やミノ表示など、ゲーム制作で多用する
		//int[][] nums = {
		//	{1,2,3},
		//	{2,3,4},
		//	{8,9,10},
		//};
	//	int[][] nums = new int[3][2];
	//	nums[0][0] = 2;
	//	System.out.println(nums.length);
	
		//ジャグ配列
		int[][] nums = new int[3][];
		//nums[0] = new int[2];
		nums[0] = new int[]{3,5};
		//int[][] nums = 
		//{
		//	{3,5},
		//	{3,6,8,9},
		//	{4,6,3},
		//}
		System.out.println(nums[0][1]);
	}
}
