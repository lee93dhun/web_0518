package Day15;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ȸ�� {
	
	String id;
	String password;
	String name;
	String email;
	String phone;
	
	public ȸ��() {}
	
	public ȸ��(String id, String password, String name, String email, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	// ȸ������ �޼ҵ� 
	public void ȸ������() {
		// 1. �Է¹ޱ� 
		System.out.println("======== ȸ������ =========");
		System.out.println("���̵� : "); String id = Day15_1.scanner.next();
		System.out.println("�н����� : "); String password = Day15_1.scanner.next();
		System.out.println("�̸� : "); String name = Day15_1.scanner.next();
		System.out.println("�̸��� : "); String email = Day15_1.scanner.next();
		System.out.println("����ó : "); String phone = Day15_1.scanner.next();
		// 2. ��ü ����� 
		ȸ�� temp = new ȸ��(id, password, name, email, phone);
		// 3. ��ü�� ����Ʈ�� �����ϱ� 
		Day15_1.ȸ�����.add(temp);
		// 4. ȸ�����Լ����� ������ ȸ������ ���� ������ 
		��������(email , "1" , "0");
	}
	// ��й�ȣã�� �޼ҵ� 
	public void �н�����ã��() {
		//1.�Է¹ޱ�
		System.out.println("======== �н�����ã�� =========");
		System.out.println("���̵� : "); String id = Day15_1.scanner.next();
		System.out.println("�̸��� : "); String email = Day15_1.scanner.next();
		//2.�ش� ���̵�� �̸��� ã�� 
		for( ȸ�� temp : Day15_1.ȸ����� ) {
			// for ����ƮȰ�� : ����Ʈ�� ��ü �� ��ŭ �ϳ��� temp ��ü ���� 
			if( temp.id.equals(id) && temp.email.equals(email) ) {
				
				��������( email , "2" , temp.password );
				
				System.out.println("----> �̸��Ϸ� �н����� �����߽��ϴ�.");
				return;
			}
		}
		System.out.println("----> ������ ȸ�������� �����ϴ� ");
	}
	// ���̵�ã�� �޼ҵ� 
	public void ���̵�ã��() {
		//1.�Է¹ޱ�
		System.out.println("======== �н�����ã�� =========");
		System.out.println("�̸� : "); String name = Day15_1.scanner.next();
		System.out.println("�̸��� : "); String email = Day15_1.scanner.next();
		// 2. �̸��� �̸��� ������ ȸ�� ã�� [ ��� ȸ�� �˻� ]
		for( ȸ�� temp : Day15_1.ȸ�����) {
			if(temp.name.equals(name) && temp.email.equals(email)) {
				
				��������( email , "3" , temp.id );
				System.out.println("----> �̸��Ϸ� ���̵� �����߽��ϴ�.");
				return;
			}
		}
		System.out.println("----> ������ ȸ�������� �����ϴ� ");
		
	}
	
	
// �������� �޼ҵ� 
	public void ��������( String email , String type , String re) {
		// SMTP : ���� ���� ���� ��������[�Ծ�]
		// 1. ���� 
		String host = "smtp.naver.com"; // ���̹� : smtp.nver.com // ���� : smtp.gmail.com
		String user ="���� ���̵�@~~~.com";
		String password = "���� ��й�ȣ";
		
		Properties properties = new Properties();
			// ���� Ŭ���� 
		properties.put("mail.smtp.host", host);
				// .put( Ű , �� ) => �ѽ� 
		properties.put("mail.smtp.port", 587 ); // ���̹� : 587
		properties.put("mail.smtp.auth", "true");
		
		// 2. ���� Ȯ�� [ ������ ȸ�� => ���� ]
		Session session = Session.getDefaultInstance(properties , new Authenticator() {
			
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});
		// 3. ���� �ۼ� 
		try {
			MimeMessage message = new MimeMessage( session );
			message.setFrom( new InternetAddress(user)); // ������ ��� 
			message.addRecipient(Message.RecipientType.TO , new InternetAddress( email ) ); // �޴� ��� 
			
			if( type.equals("1")) {
				message.setSubject( "���� ȯ���մϴ�"); // ���� ���� 
				message.setText("�پ��� �̺�Ʈ ����"); // ���� ����
			}else if( type.equals("2")) {
				message.setSubject( "ȸ������ �н�����"); // ���� ���� 
				message.setText("ȸ������ �н����� : "+re); // ���� ����
			}else {
				message.setSubject( "ȸ������ ���̵�"); // ���� ���� 
				message.setText("ȸ������ ���̵� : "+re); // ���� ����
			}
			// ���� ���� 
			Transport.send(message);
		}
		catch (Exception e) {}
	}
}


















