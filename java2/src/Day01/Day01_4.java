package Day01;

import java.util.ArrayList;
import java.util.Scanner;

public class Day01_4 {
	
//				���� �˻� ���α׷� 
//				[������] 
//				1. �ȴ�! ���̹� ��α�&����Ʈ
//				2. ������ ��Ʈ ���� Ȱ�� ������
//				3. Tucker�� Go ��� ���α׷���
//				4. ȥ�� �����ϴ� C ���
//			
//			1. �˻��� �Է¹޾� �˻��� �ܾ ���Ե� ������ ��� ����ϱ� 
//			2. �˻��� �ܾ ���ο� ��ü�� ���ڸ� �Է¹޾� ��ü �ϱ� 		
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> ������� = new ArrayList<>();
		�������.add("�ȴ�! ���̹� ��α�&����Ʈ");
		�������.add("������ ��Ʈ ���� Ȱ�� ������");
		�������.add("Tucker�� Go ��� ���α׷���");
		�������.add("ȥ�� �����ϴ� C ���");
		
		// �˻� �ޱ� 
		System.out.print("�˻��� ������ : ");
		String �˻��� = scanner.next();
		
		ArrayList<String> �˻���� = new ArrayList<>();
		
		// �˻��� ã�� 
			//for( int i =0 ; i<�������.size() ; i++ ) {}
		for( String temp : ������� ) {
			// ����Ʈ�� Ŭ������ : ����Ʈ�� 
				// ����Ʈ�� ��ü �� ��ŭ temp �� �ϳ��� ����
			if( temp.indexOf(�˻���) != -1 ) { // -1 : �ε����� ���� 
				�˻����.add(temp);
				System.out.println( temp );
			}	
		}
		// ��ü�� �ܾ� �Է� 
		System.out.print("��ü �ܾ� : ");
		String ��ü�ܾ� = scanner.next();
		System.out.print("���ο�ܾ� : ");
		String ���ο�ܾ� = scanner.next();
		for( String temp : �˻���� ) {
			System.out.println( temp.replace( ��ü�ܾ� , ���ο�ܾ� ) ) ;
		}		
	}
	

}
