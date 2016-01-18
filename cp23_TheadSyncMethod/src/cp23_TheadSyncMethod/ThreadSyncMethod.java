package cp23_TheadSyncMethod;

public class ThreadSyncMethod {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		AddThread ad = new AddThread(cal);
		MinThread md = new MinThread(cal);
		
		ad.start();
		md.start();
		
		try{
			ad.join();
			md.join();
		}
		catch(InterruptedException e)
		{
			
		}
		
		cal.ShowOpCnt();
	}
}
