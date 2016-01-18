package cp23_OrderSync;

public class OrderSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsPaper paper = new NewsPaper();
		NewsReader reader1 = new NewsReader(paper);
		NewsReader reader2 = new NewsReader(paper);
		NewsWriter writer = new NewsWriter(paper);
		
		try{
			reader1.start();
			reader2.start();
			
			Thread.sleep(1000);
			
			writer.start();
			
			reader1.join();
			reader2.join();
			writer.join();
			
		}catch(InterruptedException e){
			
		}
	}

}
