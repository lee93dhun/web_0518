package Day14;

import java.net.InetAddress;

public class Day14_1 {
	
	// ��Ʈ��ũ ���� 
		// 1. ��Ʈ��ũ = ���ͳ�[ pc <----> pc ]
		// 2. ip = ���ͳ��ּ� = ���ּ�
			// 128 . 0 . 192 . 2 => 4ĭ���� ����[ . ���� ]  0~255������ ����
		// 3. ������ �ּ� [ DNS ] 
			// IP�ּ� ---> ���� [ www.naver.com ]
	
			//  ��pc	 ---- ��û ----->  ���̹� ����pc
			//		<--- ������ ----
		// pc ip Ȯ�� 
			// 1. ���۹�ư => cmd => ipconfig
		// pc port[�ܺηκ��� ������ ��] Ȯ�� 
			// 1. netstat 
		
	public static void main(String[] args) {
		try { // .getLocalHost() ���� �߻� ~ 
			
			// java���� ip �ּ� Ȯ�� 
			InetAddress address = InetAddress.getLocalHost();	
										// Local : ���� [ �� pc ] 
			System.out.println("���� pc�� �̸� : " +  address.getHostName());
			System.out.println("���� pc�� ip�ּ� : " +  address.getHostAddress());
			
			// ���̹� ȸ���� ip�ּ� ���� 
			InetAddress address2 = InetAddress.getByName("www.naver.com");
			System.out.println("���̹� ����pc �� �̸� : " + address2.getHostName() );
			System.out.println("���̹� ����pc �� ip�ּ� : " + address2.getHostAddress() );
			
			// ip�ּҰ� ������ �ϰ�� 
			InetAddress[] addresses = InetAddress.getAllByName("www.naver.com");
			for( InetAddress address3 : addresses ) {
				System.out.println("���̹� ����pc �� �̸� : " + address3.getHostName() );
				System.out.println("���̹� ����pc �� ip�ּ� : " + address3.getHostAddress() );
			}
			// ���� ȸ���� ip�ּ� ���� 
			InetAddress address4 = InetAddress.getByName("www.google.com");
			System.out.println("���� ����pc �� �̸� : " + address4.getHostName() );
			System.out.println("���� ����pc �� ip�ּ� : " + address4.getHostAddress() );
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	
	
	
	
	
	
	
	
	
}
