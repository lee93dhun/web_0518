package Day12;

	// ������ , get �޼ҵ� , set�޼ҵ� => �ڵ��ϼ� ���� 
	// ���콺 ������Ŭ�� => Source

public class ȸ�� {
	private String ���̵�;
	private String ��й�ȣ;
	private String ����;
		
	// ���� �޼ҵ� => setter [ �μ� o , ��ȯx ]
	public void set���̵�( String ���̵� ) {
		// ���̵� �μ��� �޾� ���� Ŭ������ ���̵� ���� 
		this.���̵� = ���̵�;
	}
	public void set��й�ȣ( String ��й�ȣ ) {
		this.��й�ȣ = ��й�ȣ;
	}
	public void set����( String ���� ) {
		this.���� = ����;
	}
	
	// ���� �޼ҵ� => getter  [ �μ� x , ��ȯ o ]
	public String get���̵�() {
		return this.���̵�;
	}
	public String get��й�ȣ() {
		return this.��й�ȣ;
	}
	public String get����() {
		return this.����;
	}
	
	// �α��� 
	public void login( String ���̵� , String ��й�ȣ ) throws Exception {
		
		if( !���̵�.equals("qwe") ) {
			// ���� ����� 
			throw new Exception("���̵� �ٸ��ϴ�");
		}
			// ! : ���� ������ : True => False
		if( !��й�ȣ.equals("qwe") ) {
			// ���ܸ���� 
			throw new Exception("��й�ȣ�� �ٸ��ϴ�");
		}
		System.out.println("�α��� ���� ");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
