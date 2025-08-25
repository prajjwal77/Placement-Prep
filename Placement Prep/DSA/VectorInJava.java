package CollectionInJava;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class VectorInJava {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		
		System.out.println(v);
		//Enumeration and Iterator is use to access the object inside the Collection 
		//Enumeration present in only two classes Stack and Vector of collection framework
		System.out.println("By Enumeration......");
		Enumeration en = v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		//Iterator present in all the 7 classes of the collection framework
		System.out.println("By Iterator......");
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
