import java.util.*;
public class Ex3{
	public static void main(String[] args){
		Hero saitou = new Hero("斎藤");
		Hero suzuki = new Hero("鈴木");
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put(saitou.getName(),2);
		map.put(suzuki.getName(),7);
		for(String key:map.keySet()){
			int value = map.get(key);
			System.out.println(key + "が倒した数=" + value);
		}
	}
}
