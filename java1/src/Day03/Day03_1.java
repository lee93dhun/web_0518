package Day03;

import java.util.Scanner; // import

public class Day03_1 {
	

	public static void main(String[] args) {
		
		int a = 12 ;
		int b = 24 ;
		int c = 45 ;
		
		// ��������� 
		System.out.println("���ϱ� : " + (a + b) );
		System.out.println("���� : " + (a - b) );
		System.out.println("���ϱ� " + (a * b) );
		System.out.println("������ " + (c / a) );
		System.out.println("������ " + (c % a) );
		
		// ���Կ����� 
		a += 5 ;
		System.out.println("���Կ����� �� : " + a);
		
		// �񱳿����� => T / F
		System.out.println("�ʰ� : " + ( a>b ) );		// F
		System.out.println("�̸� : " + ( a<b ) );		// T
		System.out.println("�̻� : " + ( a>=b ) );	// F
		System.out.println("���� : " + ( a<=b ) );	// T
		System.out.println("���� : " + ( a==b ) );	// F
		System.out.println("�����ʴ� : " + ( a!=b ) );	// T
		
		// �������� => �񱳿����� 2�� �̻� 
		System.out.println("AND : " + ( a>b && c>b ) );		// F T => F
		System.out.println("OR : " + ( a>b || c>b ) );		// F T => T
		
		// ���������� 
		System.out.println("�������� : " + a++ ); // print ����Ŀ� ���� 
		System.out.println(" Ȯ�� : " + a );
		System.out.println("�������� : "+ ++a);  	// print ������� ����
		
		System.out.println("�������� : "+ a--); 	// print ����Ŀ� ���� 
		System.out.println(" Ȯ�� : " + a );
		System.out.println("�������� : "+ --a); 	// print ������� ���� 
		
		
		// ����1 
		/*
		 * 		*�޿� ���� 
		 * [ ���� ] �Է¹ޱ� : �⺻�� , ���� 
		 * [ ��� ] �Ǽ��ɾ� = �⺻�� + ���� - ����[ �⺻��10% ]
		 * 
		 */
		Scanner scan = new Scanner(System.in); // �Է���ġ ��ü 1���� ���� 
		
		System.out.print(" �⺻�� �Է� : ");
		int �⺻�� = scan.nextInt();
		System.out.print(" ���� �Է� : ");
		int ���� = scan.nextInt();
		int ���� = (int)(�⺻��*0.1); // java �⺻ �Ǽ��� => double
			
		System.out.println(" �Ǽ��ɾ� : " + (  �⺻�� + ���� - ���� ) );
		// ����2
			/*
			 * 		* ���� ���� ����
			 * 	[����] �Է¹ޱ� : �ݾ� 
			 * 	[���] �ݾ׿� �ش��ϴ� ����� ����
			 * 	[ �� ] : 356789 =>
			 * 			�ʸ��� : 3��
			 * 			���� : 5��
			 * 			õ�� : 6��
			 * 			��� : 7�� 
		 */
		System.out.println(" �ݾ� �Է� : ");
		int �ݾ� = scan.nextInt();
		System.out.println("�ʸ����� : " + �ݾ�/100000 + "��");
			�ݾ� -= (�ݾ�/100000) * 100000; // ����ݾ׿��� �ʸ��� ���� 
		System.out.println("������ : " + �ݾ�/10000 + "��");
			�ݾ� -= (�ݾ�/10000) * 10000; // ����ݾ׿��� ���� ���� 
		System.out.println("õ���� : " + �ݾ�/1000 + "��");
			�ݾ� -= (�ݾ�/1000) * 1000; // ����ݾ׿��� õ�� ���� 
		System.out.println("��� : " + �ݾ�/100 + "��");
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
