package Day07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day07_1 {
	
	
	public static void main(String[] args) {
	
		// �л� ���� ���� ���α׷� 
			// 1. 1�����迭 ��� 
			// 2. �޴� < while(true) >
				// 1. �л� �� 	=> �迭ũ�Ⱑ ���� 
				// 2. ���� �Է� 	=> �л� �� ��ŭ ���� �Է�
				// 3. ��� 		=> 1�� �л������� , ��ü������� , �������� ���� ��� 
				// 4. ���� 		=> ��������
		
		Scanner scan = new Scanner(System.in);
		Integer[] ���� = null ; // �迭 ���� => �޸��Ҵ� X
				// new : �޸� �Ҵ� 
		while(true) {
			
			System.out.println(" ===�л����� ���α׷�===");
			System.out.println("1.�л��� 2.�����Է� 3.��� 4.����"); int ���� = scan.nextInt();
			if(����==1) {
				System.out.print(" --> �л��� : "); int �ο��� = scan.nextInt();
				���� = new Integer[�ο���]; // �Է��� ����ŭ �޸��Ҵ�
			}
			if(����==2) {
				// �迭�� ����ŭ �ݺ��ؼ� ������ �Է¹ޱ�
				for( int i=0 ; i<����.length ; i++ ) {
					System.out.print((i+1)+"���� �л��� ���� �Է� : ");
					����[i] = scan.nextInt();
				}
				System.out.println("-->��� �л��� ������ �Է¹޾ҽ��ϴ�. ");
			}
			if(����==3) {
				//  Arrays : �迭 Ŭ����
					// .sort(�迭��) : ����(��������) �޼ҵ�
				Arrays.sort(����); // �������� 
				Arrays.sort( ���� , Collections.reverseOrder() ); // �������� => �ݴ� => ��������
									// Ŭ������ reverseOrder �޼ҵ� ��밡�� => int => Integer
				for( int i = 0 ; i<����.length ; i++ ) {
					System.out.println( (i+1)+"�� ������: "+ ����[i]);
				}
				// ���� ���� ���� 
				int max = 0 ; 
				int sum = 0 ;
					for( int i = 0 ; i<����.length ; i++ ) {		
						// �����հ�
						sum += ����[i];
						// ���� �������� ��ü 
						if( max < ����[i] ) {
							max = ����[i];
						}
					}
				System.out.println(" ���� ���� ������ : " + max );
				System.out.println(" ��ü ������ ����� : " + sum/����.length);
			}
			if(����==4) { break; }
		}
		
	}
}
