package cp23_OrderSync;

public class NewsWriter extends Thread{
	NewsPaper paper;
	
	public NewsWriter(NewsPaper paper)
	{
		this.paper = paper;
	}
	public void run()
	{
		paper.setTodayNews("�ڹ��� ���Ⱑ �߰̽��ϴ�.");
	}
	
}
