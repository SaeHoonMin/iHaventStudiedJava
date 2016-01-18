package cp23_ThreadheapMultipleAccess;

public class AdderThread implements Runnable{

	Sum sumInst;
	int start, end;
	
	public  AdderThread(Sum sum, int s, int e)
	{
		sumInst = sum;
		start = s;
		
		end = e;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=start; i <end; i++)
			sumInst.addNum(i);
	}

}
