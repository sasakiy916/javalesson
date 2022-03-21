import java.util.*;
public class Area{
public static void main(String[] args){
	System.out.print("円の半径(cm)を入力:");
  int pi = new Scanner(System.in).nextInt();
	System.out.println("円の面積は"+ Math.pow(pi, 2) * 3.14 +"㎠です");
 }
}
