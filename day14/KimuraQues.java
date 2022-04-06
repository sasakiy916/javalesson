import java.util.*;
public class KimuraQues{
	public static void main(String[] args){
		Random rnd = new Random();
		System.out.print("何回戦やる?(偶数)>>");
		int num = new Scanner(System.in).nextInt();
		int[] nums = new int[num];
		//比較開始
		for(int i=0;i<num;i++){
			int first = rnd.nextInt(100);
			int second = rnd.nextInt(100);
			nums[i] = Math.max(first,second);
			System.out.printf("%d回目:ランダム生成された数字は「%d」と「%d」、「%d」が大きい%n",i+1,first,second,nums[i]);
		}
		System.out.println("--比較終了--");
		System.out.println("生き残った数字は【"+Arrays.toString(nums)+"】(降順)");
		int[] numsR = new int[nums.length/2];
		System.out.println("--再度比較!--");
		//再比較
		for(int i=0;i<nums.length/2;i++){
			int max = Math.max(nums[i],nums[i+1]);
			numsR[i] = max;
			System.out.printf("%d回目：選ばれた数字は「%d」と「%d」、「%d」が大きい%n",i+1,nums[i],nums[i+1],numsR[i]);
		}
		System.out.println("生き残った数字は【"+Arrays.toString(numsR)+"】");
	}
}
