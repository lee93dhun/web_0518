package Day01;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Day01_2 {
	
	public static void main(String[] args) {
		
		//  ���� ���� .charAt()
		String ���ڿ�4 = "�ڹ� ���α׷���";
		System.out.println( ���ڿ�4.charAt(0) );
		System.out.println( ���ڿ�4.charAt(1) );
		System.out.println( ���ڿ�4.charAt(2) );
		System.out.println( ���ڿ�4.charAt(3) );
		
		String �ֹε�Ϲ�ȣ = "880420-1587452";
		char �����Ǻ� = �ֹε�Ϲ�ȣ.charAt(7);
		System.out.println( �����Ǻ� );
		
		switch ( �����Ǻ� ) { // switch : ��x
		//		  (����/������) 
			case '1' :   // ������ '1' �̸� 
			case '3' :	 // ������ '3' �̸� 
				System.out.println(" ���� �Դϴ� ");
				break; // switch Ż�� 
			case '2' :
			case '4' :
				System.out.println(" ���� �Դϴ� ");
				break; 
		}
		// ���ڿ� ��  .equals() 
			// �⺻�ڷ���[int, float �� ] �� �� �����ڸ� ��밡�� 
		
		String �̸�1 = new String("���缮"); // ��ü ���� 
		// Ŭ������ ��ü�� = new �����ڸ�() ;
				// Ŭ������ == �����ڸ� 
				// new : ��ü ������ �޸� �Ҵ� 
		String �̸�2 = "���缮";
		
		// ���ڿ��� == �񱳿����ڸ� ����Ҽ� ���� 
		if( �̸�1 == �̸�2 ) System.out.println(" �θ��� �̸��� �����ϴ�1 ");
		// ���ڿ��� equals ����Ͽ� �� ���� 
		if( �̸�1.equals(�̸�2) ) System.out.println(" �θ��� �̸��� �����ϴ�2 ");
		
		// 1.  ==  �����ڴ� �ּҰ��� �̿��� �� 
		// 2. equals �޼ҵ�� ���� ��ü�� �� 
		
		
		// getBytes : ���ڿ� => ����Ʈ�� ��ȯ 
			// ���ڵ� : 1. EUC_KR  	, 	2. UTF-8 
					//   �ѱ�:2����Ʈ		//�ѱ�:3����Ʈ
		String ���ڿ�1 = "�ȳ��ϼ���";
		
		// 1. EUC-KR : String �⺻��
		byte[] ����Ʈ�迭 = ���ڿ�1.getBytes();
		System.out.println( ����Ʈ�迭.length );
		String ��ȯ1 = new String(����Ʈ�迭);
		System.out.println( ��ȯ1 ); 
		//
		try {
			byte[] EUC_KR = ���ڿ�1.getBytes("EUC-KR");
			System.out.println(EUC_KR.length);
			String ��ȯ2 = new String(EUC_KR , "EUC-KR");
			System.out.println(��ȯ2);
			
			byte[] UTF_8 = ���ڿ�1.getBytes("UTF-8");
			System.out.println( UTF_8.length );
			String ��ȯ3 = new String( UTF_8 , "UTF-8" );
			System.out.println( ��ȯ3 );
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// indexOf() : ���� ã�� 
		String ���ڿ�2 = "�ڹ� ���α׷���";
		
		int location = ���ڿ�2.indexOf("���α׷���");
					// ���ڿ�2.indexof("�˻���");
						// ã�� ������ �ε��� ��ġ
		System.out.println( location );
		
		Scanner scanner = new Scanner(System.in);
		String �˻��� = scanner.next();
		
		if( ���ڿ�2.indexOf(�˻���) != -1 ) {
			// �ε��� ��ȯ => -1 : �ε����� ����
			System.out.println(" �ش� ���õ� ���� �Դϴ� ");
		}else {
			System.out.println(" �ش� ���õ� ������ �ƴմϴ� ");
		}
		
		// length : ������ �� 
		System.out.println( ���ڿ�2.length());
		
		// replace : ���� ��ü 
		String �������� = "�ڹٴ� ��ü���� ��� �Դϴ� ";
		String ��ü���� = ��������.replace("�ڹ�", "java");
						// ���ڿ�.replace("��������" , "���ο��" )
		System.out.println( ��ü���� );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
