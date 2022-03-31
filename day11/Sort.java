import java.util.*;
public class Sort{
	public static void main(String[] args){
		int[] data = {3,1,5,2,7};
		System.out.println(Arrays.toString(data));

		//単純ソート(昇順)
		for(int i=0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i]>data[j]){
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(data));
	}
}
