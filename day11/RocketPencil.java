import java.util.*;
public class RocketPencil{
	public static void main(String[] args){
		String[] core = {"A","B","C","D","E",};

		while(true){
			System.out.println(Arrays.toString(core));
			System.out.print("もう一度？(適当なキー:もう一度　or　q:終わる)>>");
			String temp = core[0];
			for(int i=0;i<core.length-1;i++){
				core[i] = core[i+1];
			}
			core[core.length-1] = temp;
			String s =new Scanner(System.in).nextLine();
			if(s.equals("q")){
				break;
			}
		}
	}
}
