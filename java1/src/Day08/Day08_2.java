package Day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Day08_2 {
	
	
	// List : �÷���(����) �����ӿ�ũ(�̸� ������� Ŭ����)
	public static ArrayList< �Խ��� > �Խù���� = new ArrayList<>();
	// main �ۿ��� �����ϱ�  => main �ۿ����� ����ϱ� ���ؼ� 
	public static Scanner scan = new Scanner(System.in);
		// static : main �����尡 �ڵ��о��ִµ� main �ۿ� ������ ������ 
			// => static : static ����� ������ ������ �ڵ� ����� ���� �޸� �Ҵ�
	
	public static void main(String[] args) {
		// �Խ��� Ŭ���� 
			// 1. �ʵ� : ����
				// 1. �Խù���ȣ , �Խù����� , �Խù����� , �Խù��ۼ��� , ��ȸ�� �� 
			// 2. ������[�ʼ�x] : ��ü������ �ʱⰪ
				// 1.������� , Ư���ʵ常 �޴� ������ , ����ʵ带 �޴� ������ ��
			// 3. �޼ҵ� : �ൿ [ �����ڵ� ] : �ݺ������� ���Ǵ� �ڵ� ����
				// 1. �Խù���� , �Խù����� , �Խù���ȸ������ ,  �Խù����� ��	
		while(true) {
			System.out.println("==== �Խ��� Ŀ�´�Ƽ ====");
			// ��� �Խù� ��� 
				System.out.println("��ȣ\t����\t\t\t�ۼ���\t��ȸ��");
				// �ݺ����� �̿��� ����Ʈ�� ��ü ��� ������ 
				for( int i = 0 ; i<�Խù����.size() ; i++ ) {	
					�Խ��� temp = �Խù����.get(i);
					System.out.print(i+"\t"); 
					temp.�Խù����();
				}
			System.out.println("1.�۾��� 2.�Խù����� 3.�Խù����� "); 
			System.out.print("���� : "); int ���� = scan.nextInt();
			
			if( ����==1) {
				�Խ��� temp = new �Խ���();
				temp.�Խù����();
			}
			if(����==2) {
				System.out.println("->�Խù���ȣ : "); int ��ȣ = scan.nextInt();
				�Խ��� temp = new �Խ���();
				temp.�Խù�����( ��ȣ ); 
				// �޼ҵ� ȣ���ϸ鼭 �μ� �ֱ� 
			}
			if(����==3) {
				System.out.println("->�������� => �Խù���ȣ : "); int ��ȣ = scan.nextInt();
				�Խ��� temp = new �Խ���();
				temp.�Խù�����( ��ȣ );
				// �޼ҵ带 ȣ���ϴµ� ��ȣ int������ ���� ���� 
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
}
