import java.util.ArrayList;

public class IntroArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(30);
		list.add(0);
		list.add(40);
		
		try{
		list.remove(list.indexOf(1));
		}catch (IndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		System.out.println("1차 참조");
		for(int i=0; i<list.size();i++)
			System.out.println(list.get(i));
		
		list.remove(0);
		System.out.println("2차 참조");
		for(int i=0; i<list.size();i++)
			System.out.println(list.get(i));
		
		
	}

}
