package cp22_IntroComparator;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StrLenComparator implements Comparator<String>
{
	public int compare(String str1, String str2)
	{
		int len1 = str1.length();
		int len2 = str2.length();
		if(len1 > len2)
			return 1;
		else if(len1 < len2)
			return -1;
		else
			return 0;
	}
}

public class IntroComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tSet = new TreeSet<>(new StrLenComparator());
		tSet.add("seny");
		tSet.add("KingsMan");
		tSet.add("Take That");
		tSet.add("Hope1");
		
		Iterator <String> itr = tSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
	}

}