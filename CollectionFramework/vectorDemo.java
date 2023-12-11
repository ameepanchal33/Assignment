package CollectionFramework;
import java.util.Enumeration;
import java.util.Vector;
public class vectorDemo {
public static void main(String[] args) {
	Vector v= new Vector();
	v.add(1);
	v.add(11223);
	v.add("java");
	v.add("avva");
	v.add("java");
	v.add(null);
	System.out.println(v);
	Enumeration em=v.elements();
	while(em.hasMoreElements()) {
		System.out.println(em.nextElement());
	}
}
}
