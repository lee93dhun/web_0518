package Day02;

import java.util.ArrayList;
import java.util.Random;

public class Day02_2 {
	
	/*
	�� ��ȣ 
		1. ����ȣ �������� 0000~9999 ������ ������ 10�� ����
		2. [������ȣ]���� 10�� ���� 
		3. ������ȣ�� ���ڸ��� Ȧ�� / ¦�� �����Ͽ� ��� 
	*/

	public static void main(String[] args) {
		
		Random random = new Random();
		// ArrayList< Integer > ������� = new ArrayList<>();
		// int[] ������ȣ = new int[10];
		String[] ������ȣ = new String[10];
		ArrayList< String > Ȧ������ = new ArrayList<>();
		ArrayList< String > ¦������ = new ArrayList<>();
		
		// ���� ���� 
		for( int i = 0 ; i<10 ; i++ ) {
//			������ȣ[i] = random.nextInt(10000);
//			System.out.println(  String.format( "%04d", random.nextInt(10000) ) );
			������ȣ[i] = String.format( "%04d", random.nextInt(10000) );
						// random.nextInt() : int ���� 
						// random.nextInt(10) : 0 ~ 9 
						// random.nextInt(10000) : 0 ~ 9999		
				// String.format( 
						// ���Ĺ��� 
							// %d : ���� 
								// %����d : �����Ͱ� �����ϴ� �ڸ���
								// %0����d : �����̸� 0 ä���
		}
		// �迭 ��� 
		for( int i = 0 ; i<10 ; i ++ ) {
			int ����ȣ = Integer.parseInt(������ȣ[i].substring(3));
			if( ����ȣ % 2 == 1 ) Ȧ������.add( ������ȣ[i]);
			else ¦������.add(������ȣ[i]);
		}
		
		// Ȧ������ ��� 
		System.out.println(" ---Ȧ������ ���---");
		for( String temp : Ȧ������ ) { System.out.println( temp );}
		// ¦������ ��� 
		System.out.println(" ---¦������ ���---");
		for( String temp : ¦������ ) { System.out.println( temp );}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
