package CollectionFramework;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List list =new ArrayList();
		list.add(1);
		list.add(1);
		list.add("java");
		list.add(1233456);
		list.add("amee");
		list.add("amee");
		
		System.out.println(list);
		System.out.println(list.size());
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
