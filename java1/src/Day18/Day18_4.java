package Day18;

public class Day18_4 {
	
	public static void main(String[] args) {
	
		Thread ��ȭ���� = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5 ; i++ ) {
					System.out.println("��ȭ������");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		Thread ���ǽ��� = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5 ; i++ ) {
					System.out.println("���ǽ�����");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		Thread ���Ͻ��� = new Thread( new Runnable() {
			@Override
			public void run() {
				for( int i = 0 ; i<5 ; i++ ) {
					System.out.println("���Ͻ�����");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		��ȭ����.start();
		���ǽ���.start();
		���Ͻ���.start();
		System.out.println(" ---------> ���� ������ �� ");
		

	}
}
