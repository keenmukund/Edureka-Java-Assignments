import java.util.*;
class Daniel{
	public int removeElementArrayList(String ele,ArrayList<String> arrList){
		Iterator iterator = arrList.iterator();
		int index = -1;
		while(iterator.hasNext()){
			String name = (String)iterator.next();
			if(name.equals(ele)){
				 index = arrList.indexOf(name);
				arrList.remove(new String(name));
				return index;
			}
		}
		return index;
	}
}
public class DanielAssignment{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arrList = new ArrayList<>();
		String answer = "yes";
		while(answer.equals("yes")){
			System.out.println("Enter the elements in the arrayList ");
			arrList.add(sc.next());
			System.out.println("Do u want to add more elements ");
			answer = sc.next();
		}
		System.out.println("Dispalying ArrayList and also showing that it can contain duplicate elemnts");
		Iterator iterator = arrList.iterator();
		while(iterator.hasNext()){
			String name = (String)iterator.next();
			System.out.println(name);
		}
		Daniel daniel = new Daniel();
		System.out.println("Enter the element u want to delete : ");
		String ele = sc.next();
		System.out.println("Index of the deleted element is :"+daniel.removeElementArrayList(ele,arrList));
	}
}