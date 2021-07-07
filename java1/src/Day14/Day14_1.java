package Day14;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day14_1 {
	
	public static void main(String[] args) {

		// �������� API Ŭ���� 
			// API : �̸� �ۼ��� ���α׷�[Ŭ����]
		
		// ��¥ ���� Ŭ���� 
			// 1. date Ŭ���� : �ý��۳�¥ / �ð� 
			// 2. SimpleDateFormat Ŭ���� : ��¥����[���] Ŭ���� 
			// 3. Calendar : �޷�Ŭ���� 
				// .get( �ʵ� )
		// ��1 )  ���� ��¥ 
			Date date = new Date(); // ��¥ ��ü
			System.out.println( "��¥ ��ü : " + date);
			System.out.println( "��¥ ��ü ���� : "+date.toString() );
		
		// ��2 ) ��¥ ���� [ ��� ]
			SimpleDateFormat dateFormat = new SimpleDateFormat("yy�� MM�� dd�� hh�� mm�� ss��");
			System.out.println( "��¥ ���� ���� : " + dateFormat.format(date) ); // date ��ü�� ���� �ֱ� 
		
		// ��3 ) �޷� 
			Calendar calendar = Calendar.getInstance(); // ���� �޷� 
			System.out.println( calendar );
			
			System.out.println("���� : "+ calendar.get( calendar.YEAR ) );
			System.out.println("�� : " + ( calendar.get(calendar.MONTH) +1 ) ); // 1��:0	2��:1   3��:2 
			System.out.println("��[������] : "+ calendar.get( calendar.DAY_OF_YEAR)); // ������ �ϼ� 
			System.out.println("��[�ִ���] : "+ calendar.get( calendar.DAY_OF_WEEK)); // �ִ��� �ϼ� [ �� : 1 / ��:2 / ȭ:3 ~~~ ��:7 ]
			System.out.println("��[������] : "+ calendar.get( calendar.DAY_OF_MONTH)); // ������ �ϼ� 
			
			// ���� : ���� => �ѱ� 
			int ���� = calendar.get(calendar.DAY_OF_WEEK);
			if(���� == 1 ) System.out.println("�Ͽ���");
			if(���� == 2 ) System.out.println("������");
			if(���� == 3 ) System.out.println("ȭ����");
			if(���� == 4 ) System.out.println("������");
			if(���� == 5 ) System.out.println("�����");
			if(���� == 6 ) System.out.println("�ݿ���");
			if(���� == 7 ) System.out.println("�����");
			
			
		// ��4 ) �ð� 
			System.out.println("����[0]/����[1] : "+ calendar.get(calendar.AM_PM) );
			
			int ampm = calendar.get( calendar.AM_PM );
			if( ampm == 1 ) System.out.println("���� ����");
			else System.out.println("���� ����");
			
			System.out.println("���� �� : "+calendar.get( calendar.HOUR ));
			System.out.println("���� �� : "+calendar.get( calendar.MINUTE));
			System.out.println("���� �� : "+calendar.get( calendar.SECOND));
			
		// ��5 ) 
			LocalDate ���糯¥  = LocalDate.now();
				System.out.println(" ���� ��¥ : "+ ���糯¥ );
			LocalDate ����ڳ�¥ = LocalDate.of( 2024 , 6, 10);
				System.out.println(" ����� ��¥ : "+����ڳ�¥);
			
			LocalTime ����ð� = LocalTime.now();
				System.out.println(" ���� �ð� : "+����ð� );
			LocalTime ����ڽð� = LocalTime.of( 6 , 30 , 58);
				System.out.println(" ����� �ð� : "+����ڽð�);
			
			LocalDateTime ���糯¥�ð� = LocalDateTime.now();
				System.out.println(" ���糯¥�ð� : "+���糯¥�ð�);
			LocalDateTime ����ڳ�¥�ð� = LocalDateTime.of(2021 ,  1 , 1 , 9 , 30 , 30 );
				System.out.println(" ����� ��¥�ð� : "+����ڳ�¥�ð�);
				
		// ��6 ) �����ð� 
			ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
				System.out.println(" �������� �� : " + zonedDateTime);
			ZonedDateTime newyork = zonedDateTime.now(ZoneId.of("America/New_York"));
				System.out.println(" ���� �ð� : "+newyork);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

}
