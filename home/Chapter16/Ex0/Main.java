import java.util.*;
public class Main{
	public static void main(String[] args){
		Hero saitou = new Hero("斎藤");
		Hero suzuki = new Hero("鈴木");
		List<Hero> h = new ArrayList<Hero>();
		h.add(saitou);
		h.add(suzuki);
		for(Hero n:h){
			System.out.println(n.getName());
		}

		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put(saitou.getName(),3);
		map.put(suzuki.getName(),7);
		for(String key:map.keySet()){
			System.out.println(key + "が倒した敵=" + map.get(key));
		}
	}
}
