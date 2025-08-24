package MapInJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import javax.swing.text.html.HTMLDocument.Iterator;

class Student{
	public String name;
	public int age;
	public String city;
	public Student (String name , int age , String city) {
		this.name=name;
		this.age=age;
		this.city=city;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
}
public class Map1 {
	public static void main(String[] args) {
		Student st1 =new Student("Rohan",20,"Bengluru");
		Student st2 =new Student("Prajjwal",22,"Noida");
		Student st3 =new Student("Utsah",24,"Greater Noida");
		
		Map map =new HashMap();
		map.put(1, st1);
		map.put(2, st2);
		map.put(3, st3);
		
		System.out.println(map);
		
		Set set  = map.entrySet();
		java.util.Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
