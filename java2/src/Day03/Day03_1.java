package Day03;

import java.util.Arrays;
import java.util.Scanner;

import Day02.�ڽ�;

public class Day03_1 {
	
//	�������� �̸� , ���� �Է¹޾� ��� ��ġ�ϱ� 
//	
//			<����>	��ġ�� ���  [ ���̰� 8�̸��̸� ] 
//			<�л�>	�ʵ��л� ��� [ ���̰� 8�̻��̸� ] 
//<���>		<�л�>	���л� ��� [ ���̰� 14�� �̻��̸� ]
//			<�л�>	����л� ��� [ ���̰� 17�� �̻��̸� ] 
//			<����>	���л� ��� [ ���̰� 20�� �̻��̸� ] 
//			<����>	������ ��� [ ���̰� 25�� �̻��̸� ]

	public static Scanner scanner = new Scanner(System.in);
	public static ���<����> ���Ƹ�� = new ���<>("���Ƹ��");
	
	public static void main(String[] args) {
			
		while( true ) {
		
			System.out.println(" �� ��� ���� ");
			System.out.println("------> ���� ��� -------> ");
				������(���Ƹ��);
			System.out.println("------> ��� �߰�  -------> ");
			System.out.println("�̸� : "); String �̸� = scanner.next();
			System.out.println("���� : "); int ���� = scanner.nextInt();
			
			if( ���� <8 ) { 
				���� temp = new ����(�̸�, ����);
				System.out.println("-----> ������ ���� �Դϴ� ");
				���Ƹ��.add(temp);
			}
			else if( ���� >=8 ) { }
			else if( ���� >=14 ) { }
			else if( ���� >=17 ) { }
			else if( ���� >=20 ) { }
			else if( ���� >=25 ) { }
			else { System.out.println("------> ���� �Է� ���� "); }
		}	
	} // main �� 
	//  �л� ���  // ? : ���ϵ�ī�� 
	public static void ������( ��� <?> course ) {
		System.out.println( course.get��ܸ�() + " ��� �ο� :" 
					+ Arrays.toString( course.get�����() ));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
