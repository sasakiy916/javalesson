import java.util.*;
public class SortDown{
	public static void main(String[] args){
		System.out.print("人数>>");
		int num = new Scanner(System.in).nextInt();
		int[] data = new int[num]; 
		for(int i=0;i<data.length;i++){
			data[i] = new Random().nextInt(101);
		}
		System.out.println(Arrays.toString(data));

		//単純ソート(降順)
		for(int i=0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i]<data[j]){
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(data));
	}
}
