package Day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day13_1 {
	
	public static void main(String[] args) throws Exception {
		
		// �޸� : ������ ���� [ ���α׷� ����� �ʱ�ȭ ]
			// ���� ���� : ���� , DB , Ŭ���� ��
		
		// 2����[0,1] : 1��Ʈ => 8��Ʈ => 1����Ʈ => 1024����Ʈ => 1kb
		// ��Ʈ�� : ����� ��� ���� [ ����Ʈ ] 
		// ����
			// 1. ���� ���� 
			FileOutputStream outputStream = new FileOutputStream("c:/java/output.txt");
			// �������Ŭ����		��ü��[����] = new[�޸��Ҵ翬����]	������("��θ�/���ϸ�" ) : ���ξ���
			// �������Ŭ����		��ü��[����] = new[�޸��Ҵ翬����]	������("��θ�/���ϸ�" , true ) : �̾��
			// 2. ���� ���� 
			String ���� = "java�Դϴ�";
			outputStream.write( ����.getBytes() );
				// ��ü��.write( ����Ʈ���� )
					// String.getBytes() : ���ڿ� => ����Ʈ���� ��ȯ 
			// 3. �Է°� ���� 
			Scanner scan = new Scanner(System.in);
			System.out.println("���� ���� �Է� : "); String ����2 = scan.next();
			outputStream.write( ����2.getBytes() );
			
			// 4. ���� ���� �߰� [ ���� ���Ͽ� ���� �߰� ( true ) ]
			outputStream = new FileOutputStream("c:/java/output.txt" , true);
			
			// 3. �ٽ� �Է°� ���� 
			System.out.println("���� ���� �Է� : "); String ����3 = scan.next();
			outputStream.write( ����3.getBytes() );
			
			// 5. ���� �о���� 
			FileInputStream fileInputStream = new FileInputStream("c:/java/output.txt");
			byte[] ����Ʈ�迭 = new byte[1024]; // 1kb
			
			fileInputStream.read(����Ʈ�迭);
				// ��ü��.read( �迭 ) ;  �Է½�Ʈ���� �ִ� ����Ʈ �о�ͼ� �迭�� ���� 
			System.out.println( new String(����Ʈ�迭) );
							// new String(�迭��) : �ش� �迭�� ����Ʈ�� ���ڿ� ��ȯ 
			
			
			
			
	}

}
