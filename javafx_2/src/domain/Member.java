package domain;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Member {
	
	private String id;
	private String password;
	private String name;
	private String email;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String password, String name, String email) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
	}
	
	// �������� �޼ҵ� [ activation , mail ���̺귯�� �߰�  ]
	public void emailsend( String email , int type , String msg) {
						// �޴»�������ּ�	,  ���ϱ���[����,���̵�ã��,��й�ȣã��] , ���ϳ����� ���� 
		// 1. ���� 
		String host = "smtp.naver.com";
		String admin = "������ �̸���@�ּ�";
		String password = "�������̸����н�����";
		
		Properties properties = new Properties(); // java.util ��Ű�� 
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.post", 587 );
		properties.put("mail.smtp.auth", "true");
		
		// 2. ���� Ȯ�� [ ������ ȸ�� => ���� ] 
			// module-info �� ����� ���̺귯�� �߰� 
		Session session = Session.getDefaultInstance(properties , new Authenticator() {
			
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(admin, password);
			}	
		});
		// 3. ���� �ۼ�
		try {
			MimeMessage message = new MimeMessage( session );
			message.setFrom( new InternetAddress(admin) );
			message.addRecipient( Message.RecipientType.TO , new InternetAddress( email));
		
			if( type == 1 ) { } // type�� 1�̸� ȸ������ ���� ���� 
			else if( type == 2 ) { // type 2�̸� ���̵�ã�� ���� 
				message.setSubject(" NINK Ȩ������ " );
				message.setText(" ȸ������ ���̵� ã�� : " + msg);
			}
			else if( type == 3 ) {	// type 3�̸� ��й�ȣã�� ����  
				message.setSubject(" NINK Ȩ������ " );
				message.setText(" ȸ������ ��й�ȣ ã�� : " + msg);
			
			} 
		// 4. ���� ����
		Transport.send(message);
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
