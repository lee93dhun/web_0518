package Day09;

public class ���� {
	
	String ISBN;
	String ������;
	String ����;
	boolean �뿩;
	String �뿩ȸ��; // �ʵ� �߰� 
	
	public ����() {
		// TODO Auto-generated constructor stub
	}
	public ����(String iSBN, String ������, String ����) {
		ISBN = iSBN;
		this.������ = ������;
		this.���� = ����;
		this.�뿩 = true;
	}
	
	public void �������() {
		System.out.println("-----> ������� ");
		// �ߺ� ���� 
			while( true ) {
				int ����ġ = 0; 
				System.out.println(" ISBN : "); String ISBN = Day09_�����������α׷�.scan.next();		
				
				if( ISBN.equals("N") ) return;
				
				for( ���� temp : Day09_�����������α׷�.�������) {
					// �ӽð�ü : ����Ʈ��  => ����Ʈ�� ��ü �� ��ŭ �ݺ� 
					if( temp.ISBN.equals(ISBN) ) {
						System.out.println("----> ������ ISBN �� �ֽ��ϴ� [ N : ���� ] ");
						����ġ = 1;
						break; // for�� Ż�� 
					}
				}
				if( ����ġ == 0 ) {
					System.out.println(" ������ : "); String ������ = Day09_�����������α׷�.scan.next();		
					System.out.println(" ���� : "); String ���� = Day09_�����������α׷�.scan.next();	
					Day09_�����������α׷�.�������.add( new ����(ISBN, ������, ����) );
					return;
				}
			}
	}
	public void �������() {
		System.out.println("-----> �������");
		System.out.println(" ISBN\t\t������\t\t����\t\t�뿩����");
		for( ���� temp : Day09_�����������α׷�.������� ) {
			System.out.println(temp.ISBN+"\t\t"+temp.������+"\t\t"+temp.����+"\t\t"+temp.�뿩);
		}
	}
	public void ��������() {
		
	}
	public void ��������() {
		
	}
	public void �뿩( String ���̵� ) {
		
		System.out.println("-----> �����뿩 ");
		System.out.println(" ������ : "); String ������ = Day09_�����������α׷�.scan.next();		
		
		for( ���� temp : Day09_�����������α׷�.������� ) {
			if( temp.������.equals(������) ) {

				// �뿩���� �Ǵ� 
				if(temp.�뿩) { // �뿩�� true 
					System.out.println("-----> �뿩���� ");
					System.out.println("--> 1.�뿩��û 2.���"); int ���� = Day09_�����������α׷�.scan.nextInt();
					
					if( ���� == 1 ) {
						System.out.println( temp.������ + " �� ������ �뿩�մϴ� ");
						temp.�뿩 = false; // �뿩 �� ��� 
						temp.�뿩ȸ�� =  ���̵�;
					}
					if( ���� == 2 ) {
						return; 
					}
					
				}else { // �뿩�� false
					System.out.println("-----> �뿩�Ұ���");
				}
			}
		}
	}
	public void �ݳ�( String ���̵� ) {
		
		System.out.println("-----> �����ݳ� ");
		System.out.println(" ������ : "); String ������ = Day09_�����������α׷�.scan.next();		
		
		for( ���� temp : Day09_�����������α׷�.������� ) {
			if( temp.������.equals(������) ) {

				// �뿩���� �Ǵ� 
				if( !temp.�뿩 ) { // �ݳ��� : !���� ������ ���� :  false => true  
					System.out.println("-----> �ݳ� ���� ");
					System.out.println("--> 1.�ݳ���û 2.���"); int ���� = Day09_�����������α׷�.scan.nextInt();
					
					// �뿩ȸ���� ��츸 �ݳ� 
					if( temp.�뿩ȸ��.equals(���̵� )) {
						if( ���� == 1 ) {
							System.out.println( temp.������ + " �� ������ �ݳ��մϴ� ");
							temp.�뿩 = true; // �ݳ� �� ��� 
							temp.�뿩ȸ�� = null; 
						}
						if( ���� == 2 ) {
							return; 
						}
					}else {
						System.out.println("-----> �ݳ� ������ �����ϴ�");
						return;
					}
				}else { // �뿩�� false
					System.out.println("-----> �ݳ� �Ұ���");
				}
			}
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
