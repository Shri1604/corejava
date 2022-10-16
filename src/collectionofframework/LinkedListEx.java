package collectionofframework;
import java.util.LinkedList;
public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<>();
		list.add(-2);
		list.add(0,-1);
		list.add(null);
		list.add(1,4);
		list.add(5);
		System.out.println("List of elements:"+list);
		System.out.println("get value from list:"+list.get(0));
		System.out.println("set value from list:"+list.set(1,4));
		System.out.println("Remove element from list:"+list.remove(0));
		System.out.println("List of elements:"+list);

	}

}
