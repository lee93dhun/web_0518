package Day05;

import java.util.Scanner;

public class Day05_1 {
	
	
	public static void main(String[] args) {
		
		// ����1 : 369 ����
			// 1. �ϳ��� ������ �Է¹޾� �ش� �������� ���� ��� 
			// 2. 3 Ȥ�� 6 Ȥ�� 9 �� ���ԵǾ� �ִ� ���� �ڼ� ��� 
			// 3. 3-> �ڼ� 13-> �ڼ� 33 -> �ڼ��ڼ�	36-> �ڼ��ڼ�
		
		Scanner scan = new Scanner( System.in);
		
		System.out.println("�ϳ��� ���� : ");int ���� = scan.nextInt();
		int i = 1; // �ݺ�Ƚ�� 
		
		while(true) { // ���ѷ��� 
			
			int j = i / 10;
			
			// 1�� �ڸ��� 3 6 9		
			if( i % 10 == 3 || i % 10 == 6 || i % 10 == 9 ) {
				System.out.print("�ڼ�" );
				
				// 10�� �ڸ��� 3 6 9	
				if( j % 10 == 3 || j % 10 == 6 || j % 10 == 9 ) {
					System.out.print("�ڼ�");
				}	
				
			// 10�� �ڸ��� 3 6 9
			}else if( j % 10 == 3 || j % 10 == 6 || j % 10 == 9   ) {
				System.out.print("�ڼ�");
			}
			else {
				System.out.print(i);
			}
			System.out.println();
			i++; // �ݺ�Ƚ�� 1 ���� 
			if((����+1)==i)break; // �ݺ��� ���� 
		}
		
		
		
	}
}
