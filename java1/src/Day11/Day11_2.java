package Day11;

import java.util.Scanner;

public class Day11_2 {
	
	
	public static void main(String[] args) {
		
		// extends : ��� 
		// implements : �������̽� ���� 
		
		// 1. �������̽� ��ü ����
		Ű����ũ Ű����ũ = null; // ����ó�� 
			// Ű����ũ Ű����ũ; // �����Ⱚ[���ǰ�]
		// 2. ���� ��� ���� 
		Scanner scan = new Scanner(System.in);
		System.out.println("1.�Ե����� 2.ī��");
		int ������ = scan.nextInt();
			if( ������ == 1 ) Ű����ũ = new �Ե�����();
			if( ������ == 2 ) Ű����ũ = new ī��();
		
		while( true ){
			System.out.println("===== Ű����ũ =====");
			System.out.println("1.�޴� 2.��ٱ��� 3.���� 4.����");
			System.out.print("���� : "); int ���� = scan.nextInt();
			if( ���� == 1 ) Ű����ũ.�޴�();
			if( ���� == 2 ) Ű����ũ.��ٱ���();
			if( ���� == 3 ) Ű����ũ.����();
			if( ���� == 4 ) Ű����ũ.����();
		}
	}
}
