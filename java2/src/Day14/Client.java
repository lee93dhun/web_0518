package Day14;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			while(true) {
				// 1. ���� ����� 
				Socket socket = new Socket();
				// 2. �������� �����ϱ� [ ���������� bind �� ip�ּ� , port��ȣ ]
				socket.connect( new InetSocketAddress("localhost",5001));
					// ����.connect( ip�ּ� , port ) 
					System.out.println("[���� ����]");
					
				// 3. ������ �����ϱ� [ ������ ��Ʈ�� �̿� ] 
					// ��Ʈ�� : �ܺ���ġ�� ������ [ ���� : ����Ʈ ]
				String �޽��� = null;
				byte[] ����Ʈ = null;
				
				System.out.println(" ������ ���� �޽��� �Է� : ");
				�޽��� = scanner.next(); 
					// String ---- > ����Ʈ 
				����Ʈ = �޽���.getBytes(); // ����Ʈ�� ��ȯ 
				// ������ ��½�Ʈ�� ��������
				OutputStream ������ = socket.getOutputStream();
				// ����
				������.write(����Ʈ);
				System.out.println("[�޽��� ���� ����]");
				
				// 4. ������ �ޱ� 
				InputStream �ޱ� = socket.getInputStream();
				�ޱ�.read(����Ʈ);
				�޽��� = new String(����Ʈ);
				System.out.println("[ Ŭ���̾�Ʈ �޽��� �ޱ� ���� ] : "+�޽���);
				
				
					
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
