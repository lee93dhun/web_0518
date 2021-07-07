package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day17_3 {
	
	public static Queue< String > ������ = new LinkedList<String>();
	public static Queue< String > ��꿪 = new LinkedList<String>();
	public static Queue< String > ���￪ = new LinkedList<String>();
	public static Queue< String > ���ο� = new LinkedList<String>();
	
	public static ArrayList< Queue<String> > ��ö��Ȳ = new ArrayList<>();
	
	public static void main(String[] args) {
		
		// Queue
			// 1. ��ö �о�� 
			// 2. �� : ������ -> ��� -> ���� -> ����
			// 3. ������ : ��ö 3���� ��ü 
			// 4. 3�ʸ��� �ϳ��� �� �̵� 

			��ö��Ȳ.add(������); ��ö��Ȳ.add(��꿪); ��ö��Ȳ.add(���￪); ��ö��Ȳ.add(���ο�);
			
			��ö��Ȳ.get(0).offer("��ö1");
			��ö��Ȳ.get(0).offer("��ö2");
			��ö��Ȳ.get(0).offer("��ö3");
			
			Scanner scanner = new Scanner(System.in);
			
			while( true ) {
				System.out.println(" ======= ���� ��ö�� ��Ȳ ========");
				��ö����Ȳ();
				System.out.println(" ��ö ��� ��ȣ : 1.������ 2.��꿪 3.���￪ 4.���ο�");
				int ���� = scanner.nextInt();
				if( ���� == 1 ) ���������();
				if( ���� == 2 ) ��꿪���();
				if( ���� == 3 ) ���￪���();
				if( ���� == 4 ) ���ο����();
			}


	} // ���� �޼ҵ� �� 
	
	// ��ö�� ��Ȳ �޼ҵ� 
	public static void ��ö����Ȳ() {
		System.out.println(" ���� �������� ��ö �� : " + ��ö��Ȳ.get(0) );
		System.out.println(" ���� ��꿪 ��ö �� : " + ��ö��Ȳ.get(1) );
		System.out.println(" ���� ���￪ ��ö �� : " + ��ö��Ȳ.get(2) );
		System.out.println(" ���� ���ο� ��ö �� : " + ��ö��Ȳ.get(3) );
	}
	// ������ ��� �޼ҵ� 
	public static void ���������() {
		try {
			if( ��ö��Ȳ.get(0).isEmpty() ) {
				System.out.println("������� ��ö�� �����ϴ�");
				return; // �޼ҵ� ������ 
			}
			
			System.out.println(" 3�� �� ~~~ ");
			Thread.sleep(3000); // �и��� �ð� ����
				String temp = ��ö��Ȳ.get(0).poll();
				��ö��Ȳ.get(1).offer(temp);
				
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}; 
	}
	
	// ��꿪��� �޼ҵ� 
		public static void ��꿪���() {
			try {
				if( ��ö��Ȳ.get(1).isEmpty() ) {
					System.out.println("������� ��ö�� �����ϴ�");
					return; // �޼ҵ� ������ 
				}
				
				System.out.println(" 3�� �� ~~~ ");
				Thread.sleep(3000); // �и��� �ð� ����
					String temp = ��ö��Ȳ.get(1).poll();
					��ö��Ȳ.get(2).offer(temp);
					
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}; 
		}
		// ���￪��� �޼ҵ� 
		public static void ���￪���() {
			try {
				if( ��ö��Ȳ.get(2).isEmpty() ) {
					System.out.println("������� ��ö�� �����ϴ�");
					return; // �޼ҵ� ������ 
				}
				
				System.out.println(" 3�� �� ~~~ ");
				Thread.sleep(3000); // �и��� �ð� ����
					String temp = ��ö��Ȳ.get(2).poll();
					��ö��Ȳ.get(3).offer(temp);
					
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}; 
		}
		// ���ο���� �޼ҵ� 
		public static void ���ο����() {
			try {
				if( ��ö��Ȳ.get(3).isEmpty() ) {
					System.out.println("������� ��ö�� �����ϴ�");
					return; // �޼ҵ� ������ 
				}
				System.out.println(" 3�� �� ~~~ ");
				Thread.sleep(3000); // �и��� �ð� ����
					String temp = ��ö��Ȳ.get(3).poll();
					��ö��Ȳ.get(0).offer(temp);
					
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}; 
		}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
