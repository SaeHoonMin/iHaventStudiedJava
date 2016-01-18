package cp23_OrderSync;

public class NewsReader extends Thread{
	NewsPaper paper ; 
	
	public NewsReader (NewsPaper paper)
	{
		this.paper = paper;
	}
	public void run()
	{
		System.out.println("ø¿¥√¿« ¥∫Ω∫ : "+paper.getTodayNews());
	}

}
