package Day06;

import java.util.Random;
import java.util.Scanner;

public class Day06_4 {
	
	
	public static void main(String[] args) {
		
		
		// �ζ� �Ǻ��� 
		
		// �غ� = �迭 ���� [ 1.���� 2.��÷��ȣ ]
		int [] �ζ� = new int[6];
		int [] ��÷��ȣ = new int[6];
		Scanner scan =new Scanner(System.in);
		
		
		// 1. �Է¹ޱ� 
		for( int i = 0 ; i<=5 ; i++ ) {
			
			while( true ) { // �������� �Է� �ҋ����� ���ѷ��� 
				
				int ����ġ = 0; // �����Է����� �ƴ��� �Ǵ� ����
				
				// i�� 0���� 5���� 1�� �����ݺ�
				System.out.print( (i+1)+"��° 1~45 ������ ���� �Է� :");
				int temp = scan.nextInt();
				// 1~45 ����
					if( temp <= 0 || temp > 45 ) {
						System.out.println(" 1~45 ���̸� �����մϴ�"); // �ٽ� �Է� 
						����ġ = 1; // ������
					}
				// �ߺ��� ���� [ ���� �迭�� �̹� �ִ� �� ]
					for( int j = 0 ; j<=5 ; j++  ) {
						if( �ζ�[j] == temp ) {
							System.out.println("�̹� �����ϴ� �� �Դϴ�"); // �ٽ� �Է�
							����ġ = 1; // ������
						}
					}
				// �����Է� 
				if( ����ġ == 0 ) { �ζ�[i] = temp; break; }
			}
		}
		
		// Ȯ�� 
		System.out.print(" �����Ͻ� ��ȣ : ");
		for( int i = 0 ; i<=5 ; i++ ) {
			System.out.print( �ζ�[i]+"  ");
		}
		
		// ��÷��ȣ => ���� 6�� ���� 
		for( int i = 0 ; i<=5 ; i++ ) {
			
			while( true ) { // �������� �Է� �ҋ����� ���ѷ��� 
				int ����ġ = 0; // �����Է����� �ƴ��� �Ǵ� ����
				// i�� 0���� 5���� 1�� �����ݺ�
				Random random = new Random();
				int temp = random.nextInt(45)+1; // 0~44 +1  => 1~45
				// 1~45 ����
					if( temp <= 0 || temp > 45 ) {
						����ġ = 1; // ������
					}
				// �ߺ��� ���� [ ���� �迭�� �̹� �ִ� �� ]
					for( int j = 0 ; j<=5 ; j++  ) {
						if( ��÷��ȣ[j] == temp ) {
							����ġ = 1; // ������
						}
					}
				// �����Է� 
				if( ����ġ == 0 ) { ��÷��ȣ[i] = temp; break; }
			}
		}
		// ��÷Ȯ��
		System.out.print("\n�ζ� ��÷ ��÷��ȣ : ");
		for( int i = 0 ; i<=5 ; i++ ) {
			System.out.print( ��÷��ȣ[i]+"  ");
		}
		
		
		// ��÷ ��� [ �迭 �� ] 
		int ��÷���� = 0;
		for( int i =0 ; i<=5 ; i++ ) {
			for( int j = 0 ; j<=5 ; j++ ) {	
				if( �ζ�[i] == ��÷��ȣ[j] ) ��÷����++;
			}
		} // i�� 1�� �����Ҷ����� j�� 6���� ����  => �� ����Ƚ�� => 36��
		
		if( ��÷���� == 6 ) System.out.println(" ��÷��� : 1�� ");
		if( ��÷���� == 5 ) System.out.println(" ��÷��� : 2�� ");
		if( ��÷���� == 4 ) System.out.println(" ��÷��� : 3�� ");
		if( ��÷���� == 3 ) System.out.println(" ��÷��� : 4�� ");
		if( ��÷���� == 2 ) System.out.println(" ��÷��� : 5�� ");
		if( ��÷���� == 1 ) System.out.println(" ��÷��� : �� ");
		if( ��÷���� == 0 ) System.out.println(" ��÷��� : �� ");

	}
	
	
	

}
