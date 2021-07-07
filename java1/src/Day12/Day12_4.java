package Day12;

public class Day12_4 {
	
	public static void main(String[] args) {
		
		
		// ����ó�� : ���� �߻��ÿ� ó�� �ڵ� 
			// 1. �Ϲ����� ������ �ڵ忡�� ó�� 
			// 2. ����ġ ���� ���� �߻���[���α׷�����] => ����ó�� => �����߻��ÿ��� ���α׷� ����ȭ
				// 1. �ڵ�� ������ ���°��
			// 3. ���� 
				// try{  �����߻� ���� �ڵ�  }
				// catch( ����Ŭ���� ��ü�� ){  �����߻��� ��ü �ڵ�  } 
				// finally{ ������ ����Ǵ� �ڵ� }
			// 4. ����Ŭ���� 
				// 1. ���� ������ �˰� �ִ°�� : �ش� ����Ŭ���� ��� 
					// NullPointerException
					// NumberFormatException
					// ArrayIndexOutOfBoundsException 
					// ��� 
				// 2. ���� ������ �پ��ϰų� �𸣴°�� :  Exception Ŭ���� ��� 
					// Exception : ��� Exception ó�� �Ҽ� ���� [ ����Ŭ���� ]
			// 5. ���� ������ [ ���� ���ѱ�� ]
				// 1. ������ �̵��Ͽ� �Ѱ����� ó�� 
				// 2. ���������� ��ȯ�ڷ��� �޼ҵ��( �μ� ) throws Exception { �����ڵ� }
			// 6. ���� ����� 
				// throw new Exception("�����̸�");
		
		// 1. ������ null �� ��� ��½� 
		try {  // �����߻� ���� �ڵ� => �����߻��� catch�� �̵�  // => ������ ������� try ��� ���� 
			String data = null;
			System.out.println( data.toString() ); // toString() : ��ü ���� ��ȯ 
		}
		catch( NullPointerException e ) { // try���� ���� �߻��� catch �� ó�� 
			System.out.println("���ܹ߻� : " + e);
		}
		
		// 2. �迭 ���� 
		try {
			String[] ���ڹ迭 = new String[2]; // string ��ü�� 2�� �����Ҽ� �ִ� �迭 
			���ڹ迭[0] = "��ȣ��";
			���ڹ迭[1] = "�ŵ���";
			���ڹ迭[3] = "������ "; // ���� �߻� : �迭�� ũ�Ⱑ ���� 
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻� : " + e);
		}
		
		// 3. ���� => ���� ���� ����  // ���� => ���� ���� �Ұ���
		try {
			String data1 = "100"; // ���ڿ� 
			String data2 = "a100"; // ���ڿ�
			
			// ���ڿ� => ���ڿ� ��ȯ [ Integer.parseInt( ���ڿ� ) ] 
			System.out.println( Integer.parseInt(data1) ); // "100" -> 100 ����
			System.out.println( Integer.parseInt(data2) ); // ���� �߻� : "a100" -> a100 �Ұ���
		
		}catch (NumberFormatException e) {
			System.out.println("���ܹ߻� : " + e);
		}
		
		// 4. ���� ����ó�� 
		try {
			// 1. 
			String data = null;
			System.out.println( data.toString() ); // toString() : ��ü ���� ��ȯ 
			// 2.
			String[] ���ڹ迭 = new String[2]; // string ��ü�� 2�� �����Ҽ� �ִ� �迭 
			���ڹ迭[0] = "��ȣ��";
			���ڹ迭[1] = "�ŵ���";
			���ڹ迭[3] = "������ "; // ���� �߻� : �迭�� ũ�Ⱑ ���� 
			// 3.
			String data1 = "100"; // ���ڿ� 
			String data2 = "a100"; // ���ڿ�
			System.out.println( Integer.parseInt(data1) ); // "100" -> 100 ����
			System.out.println( Integer.parseInt(data2) ); // ���� �߻� : "a100" -> a100 �Ұ���
		}
		catch (NullPointerException | ArrayIndexOutOfBoundsException | NumberFormatException e ) {
			System.out.println("���� �߻� : "+ e);
		}
		catch( Exception e2 ) {
			System.out.println("���� �߻� : " + e2);
		}
		finally {
			System.out.println("�ڵ� ����");
		}
		
		// 5. ���� ���ѱ�� 
			// ���ܹ߻��� ȣ���ߴ� ������ ���� ������ 
		try {
			Day12_5.���ܴ�����();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
