package Day18;

import java.awt.Toolkit;

public class Day18_3 {

	public static void main(String[] args) {

		
		// ������ : �ڵ带 �о��ִ� ��Ȱ 
			// main �޼ҵ忡 : main ������ ���� 
		// ��Ƽ������ : ���� �ڵ带 ���� ó�� 
			// �ڵ� ����ó�� 
				// ��ǻ�� ���� => ����ó�� X => ������� ó�� 
		
			// ��Ƽ ������ ���� 
			// 1. implements Runnable => run �޼ҵ� @Override
			// 2. extends Thread => run �޼ҵ� @Override
			// 3. new Thread( new Runnable() { run �޼ҵ� @Override } );
		
			// ��Ƽ ������ ���� 
			// 1. �������.start() : start() => �ش� ������ run
		
			
		
		// ����1) ���� ������ 
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0 ; i<5 ; i++ ) {
			
			toolkit.beep(); // ������ �Ҹ� 
			try {
				Thread.sleep(1000);  // ������ �Ͻ����� 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("------- ����1 �� ");
		
		// ����2 ) ��Ƽ ������ [ �������̽� ] 
		Runnable �Ҹ� = new �Ҹ�������();
		Thread ��Ƽ������1 = new Thread( �Ҹ� );
		
		��Ƽ������1.start(); // => �ش� ������ run �޼ҵ� ȣ�� 
		
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("------- ����2 �� ");
		
		// ����3 ) ��Ƽ ������  [ Ŭ���� ] 
		Thread ��Ƽ������2 = new �Ҹ�������2();
		��Ƽ������2.start();
		
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		System.out.println("------- ����3 �� ");
		
		// ����4 ) 
		Thread ��Ƽ������3 = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5 ; i++ ) {
					toolkit.beep(); // ������ �Ҹ� 
					try {
						Thread.sleep(1000);  // ������ �Ͻ����� 
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}			
				}
			}
		}); // ; 
		
		��Ƽ������3.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
