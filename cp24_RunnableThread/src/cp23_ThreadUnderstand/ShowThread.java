package cp23_ThreadUnderstand;

public class ShowThread extends Thread{
	String threadName;
	
	public ShowThread(String name)
	{
		threadName = name;
	}
	
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("¾È³ç. "+ threadName+"thread´Ù.");
			try{
				sleep(100);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}

}
