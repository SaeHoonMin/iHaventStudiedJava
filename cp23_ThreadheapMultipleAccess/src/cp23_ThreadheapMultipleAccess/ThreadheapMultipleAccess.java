package cp23_ThreadheapMultipleAccess;

public class ThreadheapMultipleAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum s = new Sum();
		AdderThread at1 = new AdderThread(s,1,5000);
		AdderThread at2 = new AdderThread(s,5000,10001);
		Thread t1 = new Thread(at1);
		Thread t2 = new Thread(at2);
		t1.start();
		t2.start();
		
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException e )
		{
			
		}
		System.out.println(s.getNum());
	}

}
