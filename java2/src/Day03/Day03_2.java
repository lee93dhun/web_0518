package Day03;

public class Day03_2 {
	
	
	public static void main(String[] args) {
		// ���ٽ�
			// 1. �͸��Լ�[ �̸����� �Լ� ] 
			// 2. �ܼ�ǥ��
			// 3. ��Ƽ������ 4
			// 4. (�μ�) -> { �����ڵ�; return;};
				// (  ) -> �����ڵ�;
		
		// ����1 
			// �������̽��� �߻�޼ҵ带 ���� 
		// 1. �μ�x ��ȯx
		�Լ��������̽� fi ; // �������̽� ��ü
		fi = () -> { 
			String str = "�޼ҵ� ����1";
			System.out.println(str);
		};
		fi.�޼ҵ�();
		
		fi = () -> { System.out.println("�޼ҵ� ����2");};
		fi.�޼ҵ�();
		
		fi = () -> { System.out.println("�޼ҵ� ����3");};
		fi.�޼ҵ�();
		
		// 2. �μ�o ��ȯx
		�Լ��������̽�2 fi2;
		fi2 = (x) -> { 
			int ��� = x * 5 ;
			System.out.println("��� : " + ���);
		};
		fi2.�޼ҵ�(3);
		
		fi2 = (x) -> { System.out.println(x*5); };
		fi2.�޼ҵ�(3);
	
		// 3. �μ�o ��ȯo
		�Լ��������̽�3 fi3;
		fi3 = ( x , y )  -> {
			int ��� = x+y;
			return ���;
		};
		System.out.println( fi3.�޼ҵ�(3, 5) );
		
		fi3 = ( x , y ) -> {return x+y;};
		System.out.println( fi3.�޼ҵ�(3, 5) );
		
		fi3 = ( x , y ) -> x+y;
		System.out.println( fi3.�޼ҵ�(3, 5) );
		
		fi3 = ( x , y ) -> sum(x, y);
		System.out.println( fi3.�޼ҵ�(3, 5) );
		
	} // main ��
	
	public static int sum( int x , int y ) { return(x+y); }

	
	
	
	
}
