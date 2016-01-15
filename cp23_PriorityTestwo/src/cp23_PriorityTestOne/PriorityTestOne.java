package cp23_PriorityTestOne;

public class PriorityTestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageSendingThread tr1 = new MessageSendingThread("First",Thread.MAX_PRIORITY);
		MessageSendingThread tr2 = new MessageSendingThread("Second",Thread.NORM_PRIORITY);
		MessageSendingThread tr3 = new MessageSendingThread("Third",Thread.MIN_PRIORITY);
		tr1.run();
		tr2.run();
		tr3.run();
	}

}
