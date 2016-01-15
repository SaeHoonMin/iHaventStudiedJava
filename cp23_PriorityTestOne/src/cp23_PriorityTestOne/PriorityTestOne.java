package cp23_PriorityTestOne;

public class PriorityTestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageSendingThread tr1 = new MessageSendingThread("First");
		MessageSendingThread tr2 = new MessageSendingThread("Second");
		MessageSendingThread tr3 = new MessageSendingThread("Third");
		tr1.run();
		tr2.run();
		tr3.run();
	}

}
