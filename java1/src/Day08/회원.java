package Day08;

public class ȸ�� {
	
	// �ʵ� 
	String ���̵�;
	String ��й�ȣ;
	String ����;
	int ����;
	
	// ������ : ��ü�� �ʱⰪ : ��ü�� �����ɶ� �⺻��
	//������1 : �� ������ 
	public ȸ��() {
		// �� ������ 
	}
	
	// ������2 : ���̵� �޴� ������ 
	public ȸ��( String new���̵� ) {
		���̵� = new���̵�;
		// �ش� Ŭ������ �ʵ�� �μ��� �ʵ���� �ٸ���� this ����
		
	}
	// ������3 : ��� �ʵ带 �޴� ������ 
	public ȸ��( String ���̵� , String ��й�ȣ , String ���� , int ���� ) {
		
		this.���̵� = ���̵�;
		// ����Ŭ�����Ǻ��� = �����ڷ� ���� �μ��� ����
		this.��й�ȣ = ��й�ȣ;
		this.���� = ����;
		this.����=����;
			// this.�ʵ�� : ���� Ŭ���������� ����� �ʵ� 
		
	}
	// �޼ҵ� : �Լ� 
	public void ȸ������() {
		System.out.println( this.���̵�);
		System.out.println( this.��й�ȣ);
		System.out.println( this.����);
		System.out.println( this.����);
	}
	
	
	

}
