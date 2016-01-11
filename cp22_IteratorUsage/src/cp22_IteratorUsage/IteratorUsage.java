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
		
		System.out.println("�ݺ��� �̿��� 1�� ��°�  \"Third\" ����" );
		for(;itr.hasNext();)
		{
			System.out.println(itr.next());
		}
		list.remove(list.indexOf("Third"));
		
		System.out.println("\n\"Thrid\"���� �� �ݺ��ڸ� �̿��� 2�� ��� ");
		for(itr = list.iterator(); itr.hasNext(); )
		{
			System.out.println(itr.next());
		}
		
	}

}
