package Day11;

public interface ATM {
	public void �޴�();
	public void ���µ��();
	public void ����();
	public void ���();
	public void �ܰ�();
	public int ����ã��();
	public default void ����() {
		System.out.println("-----> ATM ����");
	};
}
