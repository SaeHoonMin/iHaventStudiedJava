package cp23_SyncObjectKey;

public class IHaveTwoNum {
	int num1 = 0;		//동기화가 필요한 변수 1
	int num2 = 0;		//동기화가 필요한 변수 2
	
	Object key1 = new Object();
	Object key2 = new Object();

	public void addOneNum1() {
		synchronized (key1) {
			num1++;
		}
	} // key1

	public void addOneNum2() {
		synchronized (key2) {
			num2++;
		}
	} // key2

	public void addTwoNum1() {
		synchronized (key1)
		{
			num1 += 2;	
		}
	} // key1

	public void addTwoNum2() {
		synchronized ( key2)
		{
			num2 += 2;	
		}
	} // key2

	public void showAllNums() {
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
	
}
