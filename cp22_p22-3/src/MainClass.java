import java.util.HashSet;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("����",26));
		hSet.add(new Person("����",23));
		hSet.add(new Person("����ȣ",20));
		hSet.add(new Person("����ȣ",10));
		hSet.add(new Person("����ȣ",10));
		hSet.add(new Person("����",26));
		
		System.out.println("����� ������ �� : "+hSet.size());
		
		Iterator<Person> itr = hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}