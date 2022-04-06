import java.util.*;
public class SuzukiQues{
	public static void main(String[] args){
		int[] arrA = {2,5,8};
		for(int i=0;i<arrA.length;i++){
			System.out.println(arrA[i]);
		}

		Random rnd = new Random();
		int[][] nums = new int[2][3];
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				nums[i][j] = rnd.nextInt(13)+12;
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
	}
}
