

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StrLenComparator implements Comparator<String>
{
	public int compare(String str1, String str2)
	{
		
		//길이로 먼저 비교

		int len1 = str1.length();
		int len2 = str2.length();
		if(len1 > len2)
			return 1;
		else if(len1 < len2)
			return -1;
		else
		{
			int strcmp = str1.compareToIgnoreCase(str2);
			if( strcmp > 0 )
				return 1;
			else if( strcmp < 0)
				return -1;
			return 0;
		}
		
	}
}

public class IntroComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tSet = new TreeSet<>(new StrLenComparator());
		tSet.add("abc");
		tSet.add("def");
		tSet.add("def");
		tSet.add("abcd");
		tSet.add("defg");
		
		Iterator <String> itr = tSet.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
	}

}