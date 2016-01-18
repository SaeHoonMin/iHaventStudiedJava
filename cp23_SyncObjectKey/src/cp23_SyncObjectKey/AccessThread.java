package cp23_SyncObjectKey;

public class AccessThread extends Thread{
	IHaveTwoNum twoNumInst;
	
	public AccessThread(IHaveTwoNum inst)
	{
		twoNumInst = inst;
	}
	public void run()
	{
		twoNumInst.addOneNum1();
		twoNumInst.addOneNum2();
		
		twoNumInst.addTwoNum1();
		twoNumInst.addTwoNum2();
		
	}

}
