package Day03;

import java.util.Scanner;

public class Day03_3 {
	
	
	public static void main(String[] args) {
		
/*	
		// IF
		
		// ����1 
		if( 3 > 1 ) System.out.println("3��ũ��"); // ���O
		
		if( 3 > 5 ) System.out.println("3��ũ��"); // ���X
		
		// ����2 
		if( 3 > 1 ) { // if s
			System.out.println("�� �Դϴ� ");
			System.out.println("3�� ũ�� ");
		} // if e
		
		// ����3 
		if( 3 > 5 ) {
			System.out.println("3ũ�� ");
		}else {
			System.out.println("5�� ũ��");
		}
		
		// ����4 
		if( 3 > 5 ) {
			System.out.println("3ũ��5");
		}
		else if( 3 > 4 ) {
			System.out.println("3ũ��4");
		}
		else if( 3 > 3 ) {
			System.out.println("3ũ��3");
		}
		else if( 3 > 2 ) {
			System.out.println("3ũ��2");
		}else {
			System.out.println("T�� ���� ");
		}
*/		
		Scanner scan = new Scanner(System.in);
/*		
		// ����5 : �ϳ��� ������ �Է¹޾� 80�� �̻��̸� �հ���� �ƴϸ� Ż�� 
		System.out.println(" ���� �Է� : ");
		int ���� = scan.nextInt();
		
		if( ���� >=80 ) System.out.println("�հ�");
		else System.out.println("���հ�");
		
		// ����6 : �ϳ��� ������ �Է¹޾� 
		//			90�� �̻��̸� A
		//			80�� �̻��̸� B
		//			70�� �̻��̸� C
		//			60�� �̻��̸� D
		//			�׿� Ż��
		System.out.println("���� �Է� : ");
		int ����2 = scan.nextInt();
		
		if( ����2 >= 90 )System.out.println(" A��� ");
		else if( ����2 >= 80 )System.out.println(" B��� ");
		else if( ����2 >= 70 )System.out.println(" C��� ");
		else if( ����2 >= 60 )System.out.println(" D��� ");
		else System.out.println("Ż��");
*/		
		// ���� 7 : �ϳ��� ���� �� ���� �� �Է¹޾� 
		//			90�� �̻��̸� 
						// �����̸� A - 1 ��� 
						// �����̸� A - 2 ��� 
		//			80�� �̻��̸� B
						// �����̸� B - 1 ��� 
						// �����̸� B - 2 ��� 
		//			70�� �̻��̸� C
						// �����̸� C - 1 ��� 
						// �����̸� C - 2 ��� 
		//			60�� �̻��̸� D
						// �����̸� D - 1 ��� 
						// �����̸� D - 2 ���
		//			�׿� Ż��
		System.out.println("���� �Է� : ");
		int ����3 = scan.nextInt();
		System.out.println("���� �Է� : ");
		String ���� = scan.next();
		
		if( ����3 >= 90 ) {
			if( ����.equals("����") ) { // ���ڿ� �񱳽� == ���Ұ� 
					//  ���ڿ� �� �޼ҵ� : .equals
				System.out.println(" A-1 ");
			}else {
				System.out.println(" A-2 ");
			}
		}
		else if( ����3 >= 80 ) {
			if( ����.equals("����") )System.out.println(" B-1 ");
			else System.out.println(" B-2 ");
		}
		else if( ����3 >= 70 ) {
			if( ����.equals("����") )System.out.println(" C-1 ");
			else System.out.println(" C-2 ");
		}
		else if( ����3 >= 60 ) {
			if( ����.equals("����") )System.out.println(" D-1 ");
			else System.out.println(" D-2 ");
		}
		else {
			System.out.println("Ż��");
		}

	}
}
