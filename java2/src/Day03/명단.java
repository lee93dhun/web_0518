package Day03;

public class ���<�Ű�Ŭ����> {
	
	String ��ܸ�;
	�Ű�Ŭ����[] �����;
	
	public ���(String ��ܸ�) {
		this.��ܸ� = ��ܸ�;
		����� = (�Ű�Ŭ����[])new Object[10];
	}
	
	// �迭�� �����ϴ� �޼ҵ� [ �����̸� ��� �߰� ]  
	public void add( �Ű�Ŭ���� �Ű���ü ) {
		for( int i = 0 ;  i< �����.length ; i++ ) {
			if( �����[i] == null ) { �����[i] = �Ű���ü; break; }
		}
	}
	public String get��ܸ�() {
		return ��ܸ�;
	}

	public void set��ܸ�(String ��ܸ�) {
		this.��ܸ� = ��ܸ�;
	}

	public �Ű�Ŭ����[] get�����() {
		return �����;
	}

	public void set�����(�Ű�Ŭ����[] �����) {
		this.����� = �����;
	}
	
	
	
	
	
	
	
	
	
	
	

}
