package Day01;

import java.io.IOException;
import java.util.Scanner;

public class Day01_1 {
	
	public static void main(String[] args) throws IOException {
	
		
		// API Ŭ���� : �̸� ������� Ŭ���� 
		
		// 1. Class Ŭ����  : Ŭ������ ���õ� ����

			Car car = new Car();
			Class class1 = car.getClass();
							// ��ü��.getCalss():
								// �ش� ��ü�� Ŭ���� ������ ��ȯ
			// ��ü�� Ŭ���� ���� 
				System.out.println( class1.getName() ); // ������.Ŭ������
				System.out.println( class1.getSimpleName() ); // Ŭ������
				System.out.println( class1.getPackageName() ); // ��Ű���� 
				System.out.println( class1.getPackage().getName() );
			
			try {
				Class class2 = Class.forName("Day01.Car");
								// forname("ã��Ŭ����")
								// ����ó�� : �ش� Ŭ���� ���°�쿡 ���� ����ó��
				System.out.println( class2.getName());
				System.out.println( class2.getSimpleName() );
				System.out.println( class2.getPackageName() );
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		// 2. String Ŭ���� : ���ڿ� Ŭ����  [ ����Ʈ => ���ڿ� ] 
			// ��ǻ�Ͱ� ���ڿ� ó���ϴ� ��� !!!! 
				// ��ǻ�� �⺻���� [ 0 , 1 ] : ���� 
					// 0,1 : 1��Ʈ   => 8��Ʈ  => 1����Ʈ
			
			// 1. �迭�� ���� ���� 
			byte[] ����Ʈ�迭 = { 72 , 101 , 108 , 108 , 111 , 32 , 74 , 97 , 118 , 97  } ;
					// �ƽ�Ű�ڵ� : H  ,  e , l  ,  l  , o		���� ,  J , a   , v  , a 
			String ���ڿ� = new String( ����Ʈ�迭 );
			System.out.println(" ����Ʈ => ���ڿ� : " + ���ڿ� );
				// ��ǻ�� : 0,1				// ��� : ����
				
			String ���ڿ�2 = new String( ����Ʈ�迭 , 6 , 4 ) ;
			System.out.println(" ����Ʈ => ���ڿ� : " + ���ڿ�2 );
			
			// �ܺ���ġ[ ��Ŭ������ ������ ] ������ ���� : ����Ʈ���� 
			
			// �Է°��� ���ڿ� ��ȯ
			
			// 1. 100���� ����Ʈ�� �����Ҽ� �ִ� �迭 
			byte[] ����Ʈ�迭2 = new byte[100];
				
			System.out.print("  �Է� : ");
			int ���� = System.in.read( ����Ʈ�迭2 );
					// System.in : �Է���ġ�� ���� 
						// read : �о���� => �迭�� ���� 
							//Scanner scanner = new Scanner(System.in);
			
			System.out.println( ���� ); // ���ڿ����� + 2 [ '\n' , '\r' ]
			String ���ڿ�3 = new String( ����Ʈ�迭2 , 0 , 4);
			System.out.println(" ���ڿ� : " + ���ڿ�3 );

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
						
				
			
		
	}

}
