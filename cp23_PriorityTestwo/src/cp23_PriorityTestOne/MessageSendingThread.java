package cp23_PriorityTestOne;

public class MessageSendingThread extends Thread{
	String message;
	
	public MessageSendingThread(String str, int priority)
	{
		message = str;
		setPriority(priority);
	}
	public void run()
	{
		for(int i=0; i<1000000; i++)
			System.out.println(message + "("+getPriority()+")");
	}

}
