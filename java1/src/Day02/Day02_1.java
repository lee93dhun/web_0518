package Day02; // ��Ű����

import java.util.Scanner;

public class Day02_1 { // Ŭ���� ���� 	
	
	// Ŭ���� ����
	
	public static void main(String[] args) { // main ���� 
	// ??  // ??? //?? // main : ������ => �ڵ带 �о��ִ� ��Ȱ 	
	
//		 �����ڵ� 
//		System.out.println("�ڹ� �Դϴ�");
//		// �Է� Ŭ������ �̿��� �Է� ��ü �����  
//		Scanner �Է���ġ = new Scanner(System.in);
//			// ��ü ����� : Ŭ������ ��ü�̸� = new �����ڸ�();
//				// new ������ : ��ü�� �޸� �Ҵ� 
//					// System.in : �Է���ġ 
//		// �Է°�ü�� �Էµ� �� �����ͼ� ������ ����  
//		int ���� = �Է���ġ.nextInt();
//				// �Է���ġ ��ü�� ����� ���� �������� 
//					// ���� ����� : �ڷ��� �����̸� = ������ ;
//		// ������ ��� 
//		System.out.println("���� �Է��� ���� " + ����);
		
		
		
		// ����
		int ����1 = 0 ; // int�� ���� ���� 
		int ����2 = 10 ; // int�� ���� ����� ������ �־��ֱ� 
		System.out.println( ����1 ); //
		System.out.println( ����2 );
			// int ����1 = 123 ; // ���� ������ �ѹ��� ���� 
		����1 = 123 ; // ������ ������ ���� ���� 
		System.out.println( ����1);
		
		// ���� ���  : " " ó�� x
		System.out.println( "����2 ������ ����� �� : " + ����2);
		
		// �ڷ��� 
		boolean ������ = true;
			// true , false �� ���� ���� 
		// boolean : 1��Ʈ 
		System.out.println("boolean�� ���� : " + ������ );
		
		char ���ں��� = 'a';
		// char : 2����Ʈ : ������� 
		System.out.println("char�� ���� : "+���ں���);
		char ���ں���2 = 97;
		System.out.println("char�� ���� : "+���ں���2);
		
		byte ����Ʈ���� = 100;
		System.out.println("����Ʈ�� ���� : "+����Ʈ����);
		byte ����Ʈ����2 = 'a';
		System.out.println("����Ʈ�� ���� : "+����Ʈ����2);
		// byte : 1����Ʈ : +-127
		
		short ��Ʈ���� = 300;
		System.out.println("��Ʈ�� ���� : " + ��Ʈ���� );
		short ��Ʈ����2 = 'a';
		System.out.println("��Ʈ�� ���� : " + ��Ʈ����2);
		// byte : 2����Ʈ : +-3������ 
		
		int ��Ʈ���� = 3000;
		System.out.println("��Ʈ�� ���� : " + ��Ʈ���� );
			// int ��Ʈ����2 ="abc"; // ���ڿ��� ������ 
		int ��Ʈ����2 = 'a';
		System.out.println("��Ʈ�� ���� : " + ��Ʈ����2);
		// int : 4����Ʈ : +-3������ 
		
		long �պ��� = 999999999999999999L;
		System.out.println("���� ���� : "+ �պ���);
		// long : 8����Ʈ 
		
		float �Ǽ����� = 10.511111111111111111111f;
		System.out.println("�Ǽ��� ���� : " + �Ǽ����� );
		
		double �Ǽ�����2 = 10.511111111111111111111;
		System.out.println("�Ǽ���2 ���� : "+�Ǽ�����2);
		
		String ���ڿ���ü = new String();
		���ڿ���ü = "�ȳ��ϼ���";
		System.out.println("���ڿ� ��ü : " + ���ڿ���ü);
		
		String ���ڿ���ü2 = "�ȳ��ϼ���2";
		System.out.println("���ڿ� ��ü2 : "+ ���ڿ���ü2);
		
		// int�� �ڷ����� Ŭ���� 
		Integer ����3 = 123;
		System.out.println("Ŭ������ ��Ʈ��ü : " + ����3);
		
		// �� ��ȯ => Ŭ����/�ڷ��� ���� 
			// ū ���� => ��������   ���� 
		char ��ȯ1 = 123;
		int ��ȯ2 = ��ȯ1; // ���� 
		
		float ��ȯ3 = 10.5f;
		double ��ȯ4 = ��ȯ3; // ���� 
		
		// ���� ����ȯ 
			// ������ �տ� ( �ڷ���/Ŭ���� ) 
		double ��ȯ5 = 10.5;
		float ��ȯ6 = (float)��ȯ5; // �Ұ��� 
		
		
	} // main �� 
} // Ŭ���� �� 
