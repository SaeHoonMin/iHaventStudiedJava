package cp17_LocalClass;

public class LocalClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass out1 =  new OuterClass("seni");
		Readable localInst1 = out1.createLocalClassInst();
		localInst1.read();
		
		OuterClass out2 =  new OuterClass("fuck");
		Readable localInst2 = out2.createLocalClassInst();
		localInst2.read();
	
	}

}
