package Day11;

public class ���� implements ATM {
	// �ʵ� 
	String ���¹�ȣ; // �ĺ���
	int �ݾ�;
	// �� ������
	public ����() {}
	// �ʵ� ���� ������
	public ����(String ���¹�ȣ, int �ݾ�) {
		this.���¹�ȣ = ���¹�ȣ;
		this.�ݾ� = �ݾ�;
	}
	@Override
	public void �޴�() {
		while( true ) {
			System.out.println("----->�޴�");
			System.out.println("1.���µ�� 2.���� 3.��� 4.�ܰ� 5.����");
			int ���� = Day11_3.scan.nextInt();
			if( ���� == 1 ) ���µ��();
			if( ���� == 2 ) ����();
			if( ���� == 3) ���();
			if( ���� == 4 ) �ܰ�();
			if( ���� == 5 ) return;
		}
	}
	@Override
	public void ���µ��() {
		System.out.println("-----> ���µ��");
	}
	@Override
	public void ����() {
		System.out.println("-----> ����");
		int result = ����ã��(); // �޼ҵ� ��ȯ 
		if( result == -1 ) return;
		else {
			System.out.println("-----> ���� �� �ݾ� : ");
			int �ݾ� = Day11_3.scan.nextInt();
			Day11_3.���¸��.get(result).�ݾ� += �ݾ�; 
			System.out.println("-----> ���� ���� ");
		}
	}
	
	@Override
	public void ���() {
		System.out.println("-----> ���");
		int result = ����ã��(); // �޼ҵ� ��ȯ 
		if( result == -1 ) return; // �޼ҵ� ���� 
		else {
			System.out.println("-----> ��� �� �ݾ� : ");
			int �ݾ� = Day11_3.scan.nextInt();
			// ���� : ���ݺ��� �� ū �ݾ��� ���x 
			if( Day11_3.���¸��.get(result).�ݾ� < �ݾ� ) {
				System.out.println("-----> ���ݾ��� �����մϴ� ");
				return; // �޼ҵ� ���� 
			}
			Day11_3.���¸��.get(result).�ݾ� -= �ݾ�; 
			System.out.println("-----> ��� ���� ");
		}
	}
	@Override
	public void �ܰ�() {
		System.out.println("-----> �ܰ�");	
		int result = ����ã��(); // �޼ҵ� ��ȯ 
		if( result == -1 ) return;
		else {
			System.out.println("-----> ���� �ܰ� : " 
					+ Day11_3.���¸��.get(result).�ݾ�);
		}
		
	}
	
	@Override
	public int ����ã��() {
		System.out.println(" ���¹�ȣ : ");
		String ���¹�ȣ = Day11_3.scan.next();
		// forȰ�� => ����Ʈfor�� 
		for( int i = 0 ; i<Day11_3.���¸��.size() ; i++ ) {
			���� temp = Day11_3.���¸��.get(i);
			if( temp.���¹�ȣ.equals(���¹�ȣ) ) {
				return i ; // ��ȯ���� 0 �̻��̸� ���¹�ȣ ã�� ���� 
			}
		}
		System.out.println("-----> ������ ���¹�ȣ�� �����ϴ� ");
		return -1; // ��ȯ���� -1 �̸� ���¹�ȣ ã�� ���� 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
