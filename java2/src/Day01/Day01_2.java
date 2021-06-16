package Day01;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Day01_2 {
	
	public static void main(String[] args) {
		
		//  문자 추출 .charAt()
		String 문자열4 = "자바 프로그래밍";
		System.out.println( 문자열4.charAt(0) );
		System.out.println( 문자열4.charAt(1) );
		System.out.println( 문자열4.charAt(2) );
		System.out.println( 문자열4.charAt(3) );
		
		String 주민등록번호 = "880420-1587452";
		char 남여판별 = 주민등록번호.charAt(7);
		System.out.println( 남여판별 );
		
		switch ( 남여판별 ) { // switch : 논리x
		//		  (변수/데이터) 
			case '1' :   // 변수가 '1' 이면 
			case '3' :	 // 변수가 '3' 이면 
				System.out.println(" 남자 입니다 ");
				break; // switch 탈출 
			case '2' :
			case '4' :
				System.out.println(" 여자 입니다 ");
				break; 
		}
		// 문자열 비교  .equals() 
			// 기본자료형[int, float 등 ] 은 비교 연산자를 사용가능 
		
		String 이름1 = new String("유재석"); // 객체 생성 
		// 클래스명 객체명 = new 생성자명() ;
				// 클래스명 == 생성자명 
				// new : 객체 생성시 메모리 할당 
		String 이름2 = "유재석";
		
		// 문자열은 == 비교연산자를 사용할수 없다 
		if( 이름1 == 이름2 ) System.out.println(" 두명의 이름은 동일하다1 ");
		// 문자열은 equals 사용하여 비교 가능 
		if( 이름1.equals(이름2) ) System.out.println(" 두명의 이름은 동일하다2 ");
		
		// 1.  ==  연산자는 주소값을 이용한 비교 
		// 2. equals 메소드는 내용 자체를 비교 
		
		
		// getBytes : 문자열 => 바이트열 변환 
			// 인코딩 : 1. EUC_KR  	, 	2. UTF-8 
					//   한글:2바이트		//한글:3바이트
		String 문자열1 = "안녕하세요";
		
		// 1. EUC-KR : String 기본값
		byte[] 바이트배열 = 문자열1.getBytes();
		System.out.println( 바이트배열.length );
		String 변환1 = new String(바이트배열);
		System.out.println( 변환1 ); 
		//
		try {
			byte[] EUC_KR = 문자열1.getBytes("EUC-KR");
			System.out.println(EUC_KR.length);
			String 변환2 = new String(EUC_KR , "EUC-KR");
			System.out.println(변환2);
			
			byte[] UTF_8 = 문자열1.getBytes("UTF-8");
			System.out.println( UTF_8.length );
			String 변환3 = new String( UTF_8 , "UTF-8" );
			System.out.println( 변환3 );
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// indexOf() : 문자 찾기 
		String 문자열2 = "자바 프로그래밍";
		
		int location = 문자열2.indexOf("프로그래밍");
					// 문자열2.indexof("검색어");
						// 찾은 문자의 인덱스 위치
		System.out.println( location );
		
		Scanner scanner = new Scanner(System.in);
		String 검색어 = scanner.next();
		
		if( 문자열2.indexOf(검색어) != -1 ) {
			// 인덱스 반환 => -1 : 인덱스가 없다
			System.out.println(" 해당 관련된 도서 입니다 ");
		}else {
			System.out.println(" 해당 관련된 도서가 아닙니다 ");
		}
		
		// length : 문자의 수 
		System.out.println( 문자열2.length());
		
		// replace : 문자 교체 
		String 기존문자 = "자바는 객체지향 언어 입니다 ";
		String 교체문자 = 기존문자.replace("자바", "java");
						// 문자열.replace("기존문자" , "새로운문자" )
		System.out.println( 교체문자 );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
