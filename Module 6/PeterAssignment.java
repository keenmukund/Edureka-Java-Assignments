import java.util.*;
public class PeterAssignment{
	public static void main(String[] args){
		HashMap<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1,"Peter");
		hashMap.put(2,"Sia");
		hashMap.put(3,"Shiv");
		hashMap.put(4,"Neha");
		hashMap.put(5,"Harsh");
		System.out.println("Keys of the HashMap : ");
		Set<Integer> keys = hashMap.keySet();
		for(Integer key: keys){
			System.out.println(key);
		}
		System.out.println("Values of the HashMap : ");
		Collection<String> values = hashMap.values();
		for(String v: values){
			System.out.println(v);
		} 
		System.out.println("The HashMap is : ");
		Set set = hashMap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}
	}
}