package cp22_IteratorUsage;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		
		Iterator <String> itr = list.iterator();
		
		System.out.println("반복자 이용한 1차 출력과  \"Third\" 삭제" );
		for(;itr.hasNext();)
		{
			System.out.println(itr.next());
		}
		list.remove(list.indexOf("Third"));
		
		System.out.println("\n\"Thrid\"삭제 후 반복자를 이용한 2차 출력 ");
		for(itr = list.iterator(); itr.hasNext(); )
		{
			System.out.println(itr.next());
		}
		
	}

}
