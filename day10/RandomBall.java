import java.util.*;
public class RandomBall{
	public static void main(String[] args){
		int[] balls = {1,2,3,4,5};
		for(int i=0;i<balls.length-1;i++){
			int index = new Random().nextInt(balls.length-i)+i;
			int tmp = balls[index];
			balls[index] = balls[i];
			balls[i] = tmp;
		}
		System.out.println(Arrays.toString(balls));
	}
}
