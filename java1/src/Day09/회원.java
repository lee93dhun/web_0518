package Day09;

public class ȸ�� {
	// �ʵ� 
	String ���̵� ;
	String ��й�ȣ; 
	String ���� ;
	String �ּ� ;
	
	// �� ������
	public ȸ��() {
		// TODO Auto-generated constructor stub
	}
	// ��� �ʵ� ������ 
	public ȸ��(String ���̵�, String ��й�ȣ, String ����, String �ּ�) {
		this.���̵� = ���̵�;
		this.��й�ȣ = ��й�ȣ;
		this.���� = ����;
		this.�ּ� = �ּ�;
	}
	// �޼ҵ� 
	public void ȸ������() {
		System.out.println("----> ȸ������ �����Է� ");
			// �ߺ�����
			int ����ġ = 0;
			while( true ) {

				System.out.print("���̵� : "); String ���̵� = Day09_�����������α׷�.scan.next();
				
				if( ���̵�.equals("N") ) return;
				
				for( int i = 0 ; i< Day09_�����������α׷�.ȸ�����.size() ; i++  ) {
											// ����Ʈ�� ��ü �� 
					if( Day09_�����������α׷�.ȸ�����.get(i).���̵�.equals(���̵�) ) {
									// i��°�� ���̵� ���� ���� �Էµ� ���̵�� �����ϸ� 
						System.out.println("-----> ���� ������� ���̵� �Դϴ� [ �ٽ� �Է� : N ���� ] ");
						����ġ = 1;
						break;
					}
				}
				
				if( ����ġ == 0 ) {
					System.out.print("��й�ȣ : "); String ��й�ȣ = Day09_�����������α׷�.scan.next();
					System.out.print("���� : "); String ���� = Day09_�����������α׷�.scan.next();
					System.out.print("�ּ� : "); String �ּ�  = Day09_�����������α׷�.scan.next();
					
					// ��ü ����
					ȸ�� temp = new ȸ��(���̵�, ��й�ȣ, ����, �ּ�);
					// ����Ʈ�� ��� 
					Day09_�����������α׷�.ȸ�����.add(temp); // �ش� ��ü ���   = ����Ʈ��.add(��ü��)
					System.out.println("----> ȸ������ �Ϸ� ");
					return;
				}
			}
	}
	public void �α���() {
		System.out.println("----> �α��� �����Է� ");
		System.out.print("���̵� : "); String ���̵� = Day09_�����������α׷�.scan.next();
		System.out.print("��й�ȣ : "); String ��й�ȣ = Day09_�����������α׷�.scan.next();
		
		for( int i = 0 ; i< Day09_�����������α׷�.ȸ�����.size() ; i++  ) {
			
			if( Day09_�����������α׷�.ȸ�����.get(i).���̵�.equals(���̵�) 
					&&Day09_�����������α׷�.ȸ�����.get(i).��й�ȣ.equals(��й�ȣ)) {
				System.out.println( "----> �α��� ���� ");
				// �α��μ����� �޴� 
					
					if( ���̵�.equals("admin") ) �����ڸ޴�();
					else �Ϲݸ޴�( ���̵� ); // �α��� ������ ȸ�� ���̵�

				return; // �α׾ƿ� 
			}
		}
	System.out.println("----> ������ ȸ�������� �����ϴ� ");
		
	}
	public void ���̵�ã��() {
		// ���� , �ּ� �Է¹޾� �ݺ����� �̿��� ����Ʈ���� ������ ��ü ã�� 
		System.out.println("----> �α��� �����Է� ");
		System.out.print("���� : "); String ���� = Day09_�����������α׷�.scan.next();
		System.out.print("�ּ� : "); String �ּ� = Day09_�����������α׷�.scan.next();
		
		// for Ȱ�� => ����Ʈ Ȱ��
		// for( int i = 0 ; i<Day09_�����������α׷�.ȸ�����.size() ; i++  ){ }
		for( ȸ�� temp : Day09_�����������α׷�.ȸ����� ) {
			// �ӽð�ü : ����Ʈ��    => ����Ʈ�� ��ü ����ŭ �ϳ��� �ӽð�ü ���� 
			if( temp.����.equals(����) && temp.�ּ�.equals(�ּ�) ) {
				System.out.println("----> "+����+"ȸ������ ���̵�� :  "+temp.���̵�);
				return;
			}
		}
		System.out.println("----> ������ ȸ�������� �����ϴ�. ");
	}
	public void ��й�ȣã��() {
		
		System.out.println("----> �α��� �����Է� ");
		System.out.print("���̵� : "); String ���̵� = Day09_�����������α׷�.scan.next();
		System.out.print("���� : "); String ���� = Day09_�����������α׷�.scan.next();
		
		for( ȸ�� temp : Day09_�����������α׷�.ȸ����� ) {
			if( temp.����.equals(����) && temp.���̵�.equals(���̵�) ) {
				System.out.println("----> "+���̵�+"���̵��� ��й�ȣ :  "+temp.��й�ȣ);
				return;
			}
		}
		System.out.println("----> ������ ȸ�������� �����ϴ�. ");
	}
	public void ȸ������() {
		
	}
	public void ���������() {
	
	}
	public void �Ϲݸ޴�( String ���̵� ) {
		while( true ) {
			System.out.println("---->"+ ���̵� +"�� ȸ�� �޴� ----> ");
			System.out.println("1.������� 2.�뿩 3.�ݳ� 4.���������� 5.ȸ������ 6.�α׾ƿ�");
			int ���� = Day09_�����������α׷�.scan.nextInt();
			
			���� temp = new ����();
			
			if( ���� == 1) { temp.�������(); }
			if( ���� == 2) { temp.�뿩( ���̵� );}
			if( ���� == 3) { temp.�ݳ�( ���̵� );}
			if( ���� == 4) {}
			if( ���� == 5) {}
			if( ���� == 6 ) { System.out.println("----> �α׾ƿ� ó��"); return;}
		}
	}
	
	public void �����ڸ޴�() {
		while( true ) {
			System.out.println("----> ������ �޴� ----> ");
			System.out.println("1.������� 2.�������� 3.�������� 4.ȸ����� 5.�α׾ƿ�");
			int ���� = Day09_�����������α׷�.scan.nextInt();
			
			���� temp = new ����(); // �ӽ� ��ü
			
			if( ���� == 1 ) { 
				temp.�������();
			}
			if( ���� == 2 ) {
				temp.��������();
			}
			if( ���� == 3 ) {
				temp.��������();
			}
			if( ���� == 4 ) { }
			if( ���� == 5 ) { System.out.println("----> �α׾ƿ� ó��"); return;}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
