package Day02;

import java.util.ArrayList;
import java.util.Random;

public class Day02_2 {
	
	/*
	차 번호 
		1. 차번호 랜덤으로 0000~9999 사이의 난수를 10개 생성
		2. [차량번호]난수 10개 저장 
		3. 차량번호의 끝자리가 홀수 / 짝수 구분하여 출력 
	*/

	public static void main(String[] args) {
		
		Random random = new Random();
		// ArrayList< Integer > 차량목록 = new ArrayList<>();
		// int[] 차량번호 = new int[10];
		String[] 차량번호 = new String[10];
		ArrayList< String > 홀수차량 = new ArrayList<>();
		ArrayList< String > 짝수차량 = new ArrayList<>();
		
		// 난수 생성 
		for( int i = 0 ; i<10 ; i++ ) {
//			차량번호[i] = random.nextInt(10000);
//			System.out.println(  String.format( "%04d", random.nextInt(10000) ) );
			차량번호[i] = String.format( "%04d", random.nextInt(10000) );
						// random.nextInt() : int 범위 
						// random.nextInt(10) : 0 ~ 9 
						// random.nextInt(10000) : 0 ~ 9999		
				// String.format( 
						// 형식문자 
							// %d : 정수 
								// %숫자d : 데이터가 차지하는 자릿수
								// %0숫자d : 공백이면 0 채우기
		}
		// 배열 출력 
		for( int i = 0 ; i<10 ; i ++ ) {
			int 끝번호 = Integer.parseInt(차량번호[i].substring(3));
			if( 끝번호 % 2 == 1 ) 홀수차량.add( 차량번호[i]);
			else 짝수차량.add(차량번호[i]);
		}
		
		// 홀수차량 출력 
		System.out.println(" ---홀수차량 목록---");
		for( String temp : 홀수차량 ) { System.out.println( temp );}
		// 짝수차량 출력 
		System.out.println(" ---짝수차량 목록---");
		for( String temp : 짝수차량 ) { System.out.println( temp );}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
