package Day06;

public class Day06_1 {
	
	
	public static void main(String[] args) {
		
		
		// ��� = if[������] , switch[������]
		// �ݺ��� = for , while , do~while
		
		// switch 
			// 1. (key) �� �ش��ϴ� case ã���� �Ʒ� case ��� ��� 
			// 2. break; : switch Ż��
			// 3. case ��X
		int ���� = 80;
		switch( ���� ) {
			case 90 :
				System.out.println("A���");
				break;
			case 80 :
				System.out.println("B���");
				break;
			case 70 :
				System.out.println("C���");
				break;
			default :
				System.out.println("Ż��");
		}
		// ���� �������ִ� ����� �� �Ǵ� 
		int ��ư = 3 ;
		switch( ��ư ) {
			case 1 :
			case 2 : 
			case 3 :
			default :
		}
		// 3���� ������ ����� ����Ŀ� ����� 90���̻��̸� "A" 80���̻��̸� "B" ������ "Ż��"
		int ����=80,����=80,����=90;
		int ��� = (����+����+����) / 3 ;
			// 90�̻� -> 9 
			// 80�̻� -> 8
		switch( ���/10 ) {
			case 9 : System.out.println("A���"); break;
			case 8 : System.out.println("B���"); break;
			default : System.out.println("Ż��");
		}

		// while : ���ѹݺ�
		int i = 0 ; // �ʱⰪ
		int sum = 0; 
		while ( i < 10 ) { // �ش� ���� T �̸� ���� �ƴϸ� F �̸� ����
			i++; // ������
			sum += i;
		} // i �� 10 �̸� �ݺ��� Ż�� 
		
		int j = 0; 
		while(true) {
			j++;
			System.out.println("���ѹݺ�");
			if( j == 10 ) break;
		}
	
	}
	
}
