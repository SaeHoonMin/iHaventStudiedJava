package cp24_RunnableThread;

public class Sum {
	private int num ; 
	public Sum() { num =0; }
	public void addNum(int n )
	{
		num+=n;
		System.out.println("num : "+num);
	}
	public int getnum(){ return num; }
}
