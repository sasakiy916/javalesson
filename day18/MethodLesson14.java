import java.util.*;
public class MethodLesson14{
	static int[] makeArrFirstToLast(int first, int last){
		int[] retArr = new int[Math.abs(first-last)+1];
		for(int i=0;i<retArr.length;i++){
			retArr[i] = first;
			if(first<last){
				first++;
			}else{
				first--;
			}
		}
		return retArr;
	}

	public static void main(String[] args){
		int[] arr1 = makeArrFirstToLast(-2,4);
		System.out.println(Arrays.toString(arr1));
	}
}
