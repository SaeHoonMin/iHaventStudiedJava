
public class SingleToneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleClass mc1 = new MultipleClass(1);
		MultipleClass mc2 = new MultipleClass(2);
		MultipleClass mc3 = new MultipleClass(3);
		mc1.setValue(10);
		System.out.println("mc1 id : "+mc1.id+" mc1 value:"+mc1.getValue());
		System.out.println("mc2 id : "+mc2.id+" mc2 value:"+mc2.getValue());
		System.out.println("mc3 id : "+mc3.id+" mc3 value:"+mc3.getValue());
	}
}
