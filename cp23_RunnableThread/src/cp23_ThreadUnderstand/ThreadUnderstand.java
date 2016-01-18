package cp23_ThreadUnderstand;

public class ThreadUnderstand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowThread s1 = new ShowThread("이쁜이");
		ShowThread s2 = new ShowThread("설사맨");
		
//		s1.run();
//		s2.run();
		
		s1.start();
		s2.start();
	}

}
