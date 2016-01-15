
public class MultipleClass extends SingleToneClass{
	SingleToneClass stc;
	int id;
	
	public MultipleClass(int id)
	{
		this.id=id;
		stc = getSingleToneClass();
	}
	
	public int getValue()
	{
		return stc.value;
	}
	public void setValue(int i)
	{
		stc.value =i;
	}
	

}
