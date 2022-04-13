import java.util.*;
public class MethodLesson11{
	static void arrReverse(int[] arr){
		for(int i=0;i<arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
	public static void main(String[] args){
		int[] arr1 = new int[]{1,2,3,4,5};
		System.out.println(Arrays.toString(arr1));
		arrReverse(arr1);
		System.out.println(Arrays.toString(arr1));
		arrReverse(arr1);
		System.out.println(Arrays.toString(arr1));
	}
}
