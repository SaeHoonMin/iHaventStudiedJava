package cp17_MultiInheriAlternative;

public class IPTV extends TV implements Computer {
	
	ComputerImpl comp = new ComputerImpl();
	
	public void dataReceive()
	{
		comp.dataReceive();
	}
	public void PowerOn()
	{
		dataReceive();
		onTV();
	}
}
