import java.util.*;
public class Ex2{
	public static void main(String[] args){
		Hero saitou = new Hero("斎藤");
		Hero suzuki = new Hero("鈴木");
		List<Hero> list = new ArrayList<Hero>();
		list.add(saitou);
		list.add(suzuki);
		for(Hero h :list){
			System.out.println(h.getName());
		}
	}
}
