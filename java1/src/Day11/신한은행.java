package Day11;

public class �������� extends ���� {
	//�ʵ� 
	int �����ڵ� = 01; // �ĺ���
	// ������
	public ��������() {}
	public ��������(String ���¹�ȣ, int �ݾ�) {
		super(���¹�ȣ, �ݾ�);
	}
	
	@Override
	public void �޴�() {
		super.�޴�();
	}
	@Override
	public void ���µ��() {
		System.out.println("----->�������� ���µ��");
		System.out.println(" ���¹�ȣ : ");
		String ���¹�ȣ = Day11_3.scan.next();
		// ����Ʈ�� �ֱ� 
		Day11_3.���¸��.add(  new ��������(���¹�ȣ, 0));
		System.out.println("----->�������� ���µ�� �Ϸ�");
	}
	@Override
	public void ����() {
		// TODO Auto-generated method stub
		super.����();
	}
	@Override
	public void ���() {
		// TODO Auto-generated method stub
		super.���();
	}
	@Override
	public void �ܰ�() {
		// TODO Auto-generated method stub
		super.�ܰ�();
	}

}
