package Day02;

import java.util.Arrays;

public class Day02_5 {


	public static void main(String[] args) {
		코스<사람> 사람코스 = new 코스<>("일반인과정", 5  );
			사람코스.add( new 사람("일반인") );
			사람코스.add( new 직장인("직장인") );
			사람코스.add( new 학생("학생") );
			사람코스.add( new 고등학생("고등학생") );
		코스<직장인> 직장인코스 = new 코스<>("직장인과정" , 5 )	;
//			직장인코스.add( new 사람("일반인") );
				직장인코스.add( new 직장인("직장인") );
//			직장인코스.add( new 학생("학생") );
//			직장인코스.add( new 고등학생("고등학생") );
		코스<학생> 학생코스 = new 코스<>("학생과정", 5);
//			학생코스.add( new 사람("일반인") );
//			학생코스.add( new 직장인("직장인") );
				학생코스.add( new 학생("학생") );
				학생코스.add( new 고등학생("고등학생") );
		코스<고등학생> 고등학생코스 = new 코스<>("고등학생과정" , 5 );
//			고등학생코스.add( new 사람("일반인") );
//			고등학생코스.add( new 직장인("직장인") );
//			고등학생코스.add( new 학생("학생") );
				고등학생코스.add( new 고등학생("고등학생") );
		
		// 코스<?> : 모든 클래스가 가능 
		코스등록(사람코스);
		코스등록(직장인코스);
		코스등록(학생코스);
		코스등록(고등학생코스); System.out.println();
		
		// 코스< ? extends 클래스 >  : 해당클래스와 상속받은 클래스만 가능 
//		학생코스등록(사람코스);
//		학생코스등록(직장인코스);
		학생코스등록(학생코스);
		학생코스등록(고등학생코스); System.out.println();
		
		// 코스< ? super 클래스 > : 해당클래스와 슈퍼클래스만 가능 
		직장인코스등록(사람코스);
		직장인코스등록(직장인코스);
//		직장인코스등록(학생코스);
//		직장인코스등록(고등학생코스); System.out.println();	
	}
	//  학생 목록  // ? : 와일드카드 
	public static void 코스등록( 코스<?> course ) {
		System.out.println( course.getName() + "수강생 : " +
						Arrays.toString( course.get목록() ));
	}
	
	public static void 학생코스등록( 코스<? extends 학생> course ) {
		System.out.println( course.getName() + "수강생 : " +
				Arrays.toString( course.get목록() ));
	}
	public static void 직장인코스등록( 코스<? super 직장인> course) {
		System.out.println( course.getName() + "수강생 : " +
				Arrays.toString( course.get목록() ));
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
