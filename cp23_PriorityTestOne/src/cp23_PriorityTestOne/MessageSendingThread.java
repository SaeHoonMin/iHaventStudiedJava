package cp23_PriorityTestOne;

public class MessageSendingThread extends Thread{
	String message;
	
	public MessageSendingThread(String str)
	{
		message = str;
	}
	public void run()
	{
		for(int i=0; i<1000000; i++)
			System.out.println(message + "("+getPriority()+")");
	}

}
