package Day02;

import java.util.Random;

public class Day02_1 {
	
	
	public static void main(String[] args) {
		
		
		// Math : ���� ��� ���� Ŭ���� 
			// 1. Math.abs( �� ) : ���밪 
		int ����1 = Math.abs(-5);  System.out.println( ����1 );
		double �Ǽ�1 = Math.abs(-5.14); System.out.println(�Ǽ�1);
		
			// 2. Math.ceil( �� ) : �Ҽ� ù��° �ڸ����� �ø�
		double �Ǽ�2 = Math.ceil(5.3); System.out.println( �Ǽ�2 );
		double �Ǽ�3 = Math.ceil(-5.3); System.out.println( �Ǽ�3 );
			// 3. Math.floor( �� ) : �Ҽ� ù��° �ڸ����� ����
		double �Ǽ�4 = Math.floor( 5.3 ); System.out.println(�Ǽ�4);
		double �Ǽ�5 = Math.floor( -5.3 ); System.out.println(�Ǽ�5);
			// 4. Math.max( ��1 , ��2 ) : �� ū���� ��ȯ 
		int ����2 = Math.max( 5 , 9 ); System.out.println( ����2 );	
		double �Ǽ�6 = Math.max( 5.3 , 2.5 ); System.out.println( �Ǽ�6 );
			// 5. Math.min( ��1 , ��2 ) : �� �������� ��ȯ
		int ����3 = Math.min( 5 , 9 ); System.out.println(����3);
		double �Ǽ�7 = Math.min( 5.3 , 2.5 ); System.out.println( �Ǽ�7 );
		
		// ���� 
			// 1. Math.random() [ ������ ��ȯ => double ( 0 ~ 1 )  ]
		double �Ǽ�8 = Math.random(); System.out.println(  �Ǽ�8 );
						
			// 2. Random Ŭ���� [ ������ ��ȯ Ÿ�� ���ϱ� ] 
		Random random = new Random();
		double �Ǽ�9 = random.nextDouble(); System.out.println( �Ǽ�9 );
			
			// 7. Math.rint( �� ) : ����� ������ �Ǽ��� [ �ݿø� ] 
		double �Ǽ�10 = Math.rint( 5.3 ); System.out.println( �Ǽ�10 );
		double �Ǽ�11 = Math.rint( 5.7 ); System.out.println( �Ǽ�11 );
		
			// 8. Math.round( �� ) : �ݿø� 
		double �Ǽ�12 = Math.round(5.3); System.out.println( �Ǽ�12 );
		double �Ǽ�13 = Math.round(5.7); System.out.println( �Ǽ�13 );
		
			// 9. �Ҽ� ��°�ڸ����� �ݿø�
		double �Ǽ�14 = 12.3456; 
				// 1. �ڸ��� ���� 
		double temp = �Ǽ�14 * 100;
		temp = Math.round( temp );
		�Ǽ�14 = temp / 100.0; System.out.println( �Ǽ�14 );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
