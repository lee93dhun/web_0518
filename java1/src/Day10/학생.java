package Day10;

public class �л� extends ��� {

	int �г� ; 
	// ������ 
	public �л�(String �̸�, int ���� , int �г�) {
		super(�̸�, ����); // ����Ŭ����ȣ�� 
		this.�г� = �г�;
	}
	// �޼ҵ� ������
	@Override // ��ӹ��� Ŭ������ �޼ҵ带 �������ϱ� 
	public void ����() {
		System.out.println("�л��� �̸��� : " + this.�̸�);
	}
	// �޼ҵ� 
	public void �л�����() {
		System.out.println( this.�̸�);
	}
}
