import java.util.*;
public class Ques{
	public static void main(String[] args){
		int[][] nums = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		for(int[] num1:nums){
			for(int num2:num1){
				System.out.print(num2);
			}
			System.out.println();
		}
	}
}
