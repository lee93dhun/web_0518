package Day11;

public class �ڷ����� implements ������ {
	
	// �ʵ� 
	int ���� = 0 ;
	
	// �߻�޼ҵ� ����
	@Override // ������
	public void ����() {
		System.out.println("�ڷ����� ����");
	}
	@Override
	public void ����() {
		System.out.println("�ڷ����� ����");
	}
	@Override
	public void ��������( int ����) {
		
		if( ���� > ������.�ִ���� ) {
			���� = ������.�ִ����;
		}else if( ���� < ������.�ּҼ���) {
			���� = ������.�ּҼ���;
		}else {
			this.���� = ����;
		}
		System.out.println(" ���� ���� : " + ���� );		
	}

}
