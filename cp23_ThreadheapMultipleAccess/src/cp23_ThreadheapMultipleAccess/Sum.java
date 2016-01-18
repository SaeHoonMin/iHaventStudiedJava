package cp23_ThreadheapMultipleAccess;

public class Sum {
	private int num;
	public Sum()
	{
		num=0;
	}
	public synchronized void addNum(int n) { num+=n; }
	public int getNum() { return num; }
}
