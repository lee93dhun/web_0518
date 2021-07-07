package Day01;

import java.io.IOException;
import java.util.Scanner;

public class Day01_1 {
	
	public static void main(String[] args) throws IOException {
	
		
		// API 클래스 : 미리 만들어진 클래스 
		
		// 1. Class 클래스  : 클래스의 관련된 정보

			Car car = new Car();
			Class class1 = car.getClass();
							// 객체명.getCalss():
								// 해당 객체의 클래스 정보를 반환
			// 객체의 클래스 정보 
				System.out.println( class1.getName() ); // 도메인.클래스명
				System.out.println( class1.getSimpleName() ); // 클래스명
				System.out.println( class1.getPackageName() ); // 패키지명 
				System.out.println( class1.getPackage().getName() );
			
			try {
				Class class2 = Class.forName("Day01.Car");
								// forname("찾을클래스")
								// 예외처리 : 해당 클래스 없는경우에 따른 예외처리
				System.out.println( class2.getName());
				System.out.println( class2.getSimpleName() );
				System.out.println( class2.getPackageName() );
			
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		// 2. String 클래스 : 문자열 클래스  [ 바이트 => 문자열 ] 
			// 컴퓨터가 문자열 처리하는 방법 !!!! 
				// 컴퓨터 기본단위 [ 0 , 1 ] : 기계어 
					// 0,1 : 1비트   => 8비트  => 1바이트
			
			// 1. 배열에 숫자 저장 
			byte[] 바이트배열 = { 72 , 101 , 108 , 108 , 111 , 32 , 74 , 97 , 118 , 97  } ;
					// 아스키코드 : H  ,  e , l  ,  l  , o		공백 ,  J , a   , v  , a 
			String 문자열 = new String( 바이트배열 );
			System.out.println(" 바이트 => 문자열 : " + 문자열 );
				// 컴퓨터 : 0,1				// 사람 : 문자
				
			String 문자열2 = new String( 바이트배열 , 6 , 4 ) ;
			System.out.println(" 바이트 => 문자열 : " + 문자열2 );
			
			// 외부장치[ 이클립스를 제외한 ] 데이터 전송 : 바이트단위 
			
			// 입력값을 문자열 변환
			
			// 1. 100개의 바이트를 저장할수 있는 배열 
			byte[] 바이트배열2 = new byte[100];
				
			System.out.print("  입력 : ");
			int 쓰기 = System.in.read( 바이트배열2 );
					// System.in : 입력장치로 부터 
						// read : 읽어오기 => 배열에 저장 
							//Scanner scanner = new Scanner(System.in);
			
			System.out.println( 쓰기 ); // 문자열개수 + 2 [ '\n' , '\r' ]
			String 문자열3 = new String( 바이트배열2 , 0 , 4);
			System.out.println(" 문자열 : " + 문자열3 );

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
						
				
			
		
	}

}
