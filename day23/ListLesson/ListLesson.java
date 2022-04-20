import java.util.*;
public class ListLesson{
	public static void main(String[] args){
		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		names.add("Paul");
		names.add("George");
		names.add("Ringo");
		System.out.println(names.size());
		System.out.println(names.get(0));
		names.remove(0);
		System.out.println(names.size());
		System.out.println(names);

		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		for(int i=0;i<nums.size();i++){
			System.out.println(nums.get(i));
		}
		for(int n:nums){
			System.out.println(n);
		}
		nums.add(0,100);
		System.out.println(nums);
		nums.set(0,1000);
		System.out.println(nums);
		if(nums.contains(1000)){
			System.out.println("含みます");
		}
		System.out.println(nums.indexOf(10));
		nums.remove(0);
		nums.remove("Ringo");
		nums.clear();
		if(nums.isEmpty()){
			System.out.println("空っぽ");
		}
	}
}
