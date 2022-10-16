package collectionofframework;
import java.util.Vector;;
public class VectorClassEx {

	public static void main(String[] args) {
		Vector<String> v= new Vector<>();
		v.add("shri");
		v.add(0,"gowz");
		v.add(1,"kani");
		v.add("vini");
		System.out.println("List of elements:"+v);
		System.out.println("get value from list:"+v.get(0));
		System.out.println("set value from list:"+v.set(1,"kani"));
		System.out.println("Remove element from list:"+v.remove(0));
		System.out.println("List of elements:"+v);

	}

}
