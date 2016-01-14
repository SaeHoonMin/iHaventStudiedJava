package cp17_MultiInheriAlternative;

public class MultiInheriAlternative {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV ipTV = new IPTV();
		ipTV.PowerOn();
		
		TV tv = ipTV;
		Computer comp = ipTV;
		
	}

}
