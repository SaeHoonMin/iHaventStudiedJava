package cp23_TheadSyncMethod;

public class Calculator {
	int opCnt = 0;
	
	public int add (int n1, int n2)
	{
		opCnt++;			//����ȭ�� �ʿ��� ����.
		return n1 + n2;
	}
	public int min (int n1, int n2)
	{
		opCnt++;
		return n1-n2;
	}
	public void ShowOpCnt()
	{
		System.out.println("�� ���� Ƚ�� : "+opCnt);
	}
}
