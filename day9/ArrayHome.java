public class ArrayHome{
	public static void main(String[] args){
		int[] array1 = {100,200,300};
		int[] array2 = array1;
		
		array2[1] = 500;

		System.out.printf("array1[1]:%d%narray2[1]:%d%n",array1[1],array2[1]);
	}
}
