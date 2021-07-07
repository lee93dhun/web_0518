package Day14;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Day14_4 {
	

	public static void main(String[] args) {	
		// �̸��� api :
			// ���� ������ ��������[�Ծ�] : SMTP
			// �ٿ�ε� : 
		// java���� ���� ������ [ ���̹� ] 		
		String host = "smtp.naver.com";  // ���� ȸ�� ȣ��Ʈ�� [ �ش� ����Ʈ������ Ȯ�� ]  
		String user = "���ξ��̵�";			// ������ ���̵� 
		String password = "�����н�����"; 	// ������ ��й�ȣ
		
		Properties properties = new Properties(); // ���� 
		
		properties.put("mail.smtp.host", host); // 
		properties.put("mail.smtp.port", 587 ); // port : ����ȸ�� smtp port
		properties.put("mail.smtp.auth", "true"); // ���� �˻� 
		
		// ���� Ȯ�� 
		Session session = Session.getDefaultInstance(properties , new Authenticator() {
			// java.mail
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});
		try {
			// ���� �ۼ� 
			MimeMessage message = new MimeMessage( session ); 
			message.setFrom( new InternetAddress(user)); // ������ ��� 
			message.addRecipient( Message.RecipientType.TO , new InternetAddress("�޴»�� �̸���") ); // �޴� ��� 
			message.setSubject("java���� ���Ϻ�����"); // ���� ���� 
			message.setText("�ȳ��ϼ���"); // ���� ����
		
			Transport.send(message);  // ���� ���� 
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
