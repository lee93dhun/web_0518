package Day18;

import java.util.Scanner;

public class Day18_2 {
	//1. �迭���� 
	public static int[] ����� = new int[10];

	public static void main(String[] args) {
		System.out.println("------���α׷� ����------\n\n");
		Start();
		System.out.println("\n\n------���α׷� ����------ ");
	}
	public static void Start() {
		while( true ) {	
			Scanner scanner = new Scanner(System.in); // ����ó�� : scanner�� �ִ� ���ڸ� �ٽ� �ʱ�ȭ
			System.out.println("====�����====");	
		
			// ����� �� 
			int ������� = 0 ;
			for( int i = 0 ; i<10 ; i++) {
				if( �����[i] !=0 ) {
					�������++;
				}
			}
			// ����� ���
			for( int i = 0 ; i<������� ; i++ ) {
				if( �����[i] == 0 ) { 
					System.out.println("----> ���� ����� �����ϴ� "); 
				}
				else { 
					System.out.println(  (i+1)+"��° �� �ο��� : " + �����[i]+"��" );
				}
			}
			System.out.print("1.����߰� 2.��ܻ���");
			System.out.print("���� : "); 
			int ���� = 0;
			try {
				���� = scanner.nextInt();	//  ���� �߻�  => ���� : scanner�� ���ڸ� �Է�������� 	
			}
			catch (Exception e) {
				System.out.println("---->���ڸ� �Է°����մϴ� ");
			}
			if( ���� == 1 ) {
				for( int i = 0 ; i<10; i++ ) {
					if( �����[i] == 0 ) {
						System.out.println("�ο��� �Է� : ");
						�����[i] = scanner.nextInt();
						System.out.println("����ȣ : " + (i+1) +"\n\n");
						break;
					}
					// 10�� ��� �Է� ������� 
					if( (i+1) == 10 ) {
						System.out.println("-----> ����� ���� [ ��ٷ��ּ��� ]");
					}
				}
			}
			if( ���� == 2 ) {
				for( int i = 0 ; i<10 ; i++ ) {
					// ������ ��ܿ� null 
					if( (i+1) == 10 ) {
						�����[i] = 0;
						break;
					}
					// ��ĭ�� ���� 
					�����[i] = �����[i+1];
				}
			}
			if( ���� == 3 ) { return; }
		}
		
	}
}
