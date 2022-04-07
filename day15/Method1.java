import java.util.*;
public class Method1{
	public static void main(String[] args){
		int max = maxOf(3,8);
		System.out.println(max);
		double area = calcTriangleArea(2.0,3.0);
		System.out.println(area);
		boolean isSame = isSame(new int[]{3,3,3});
		System.out.println(isSame);
		int price = 2800;
		int tax = 10;
		int taxIn = calcTaxIn(price,tax);
		System.out.printf("定価%d円、消費税%d%%の価格は%d円%n",price,tax,taxIn);
		double weight = 50.5;
		double height = 170.5;
		double bmi = calcBMI(weight,height);
		System.out.printf("BMI:%f%n",bmi);
		System.out.printf("%d line win%n",slot());
	}

	public static int maxOf(int a,int b){
		return a>b ? a:b;
	}
	public static double calcTriangleArea(double bottom, double height){
		double area = bottom * height / 2;
		return area;
	}
	public static boolean isSame(int[] arr){
		int first = arr[0];
		for(int i=1;i<arr.length;i++){
			if(first != arr[i]){
				return false;
			}
		}
		return true;
	}
	public static int calcTaxIn(int price, int tax){
		int taxIn = (int)(price * (1+tax/100d));
		return taxIn;
	}
	public static double calcBMI(double weight,double height){
		return weight * height;
	}
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
