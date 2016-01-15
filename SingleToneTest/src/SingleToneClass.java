
public class SingleToneClass {
	public static SingleToneClass inst;
	public static int instCount=0;
	int value = 100;
	
	public static SingleToneClass getSingleToneClass()
	{
		if(inst==null)
		{
			inst =new  SingleToneClass();
			instCount++;
			return inst;
		}
		else
			return inst;
	}
	public int getValue()
	{
		return value;
	}
}
