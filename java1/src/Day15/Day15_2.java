package Day15;

import java.util.ArrayList;
import java.util.List;

public class Day15_2 {
	
	
	public static void main(String[] args) {
		
		// �÷��� �����ӿ�ũ : �޸� ���� Ŭ���� ����
			// �÷��� : ����
			// �����ӿ�ũ : �̸� ������� ���α׷�
		// 1. List �÷��� 
			// 1. ArrayList , 2. Vector , 3.LinkedList
				// 1. �迭�� ������ : �迭[�����޸�] / list[�����޸�]
					// �迭 : int[] �迭�� = new int[10] => 10�� int�� �޸� �켱 �Ҵ� 
				// 2. �ε��� ��� : ����Ǵ� ���� [0:����~~ ]
				// 3. �߰�,������ : �ε��� �ڵ� ���� 
				// 4. ���� ���Ǵ� �޼ҵ� 
					// 1. ����Ʈ��.add("��ü��")
					// 2. ����Ʈ��.get(�ε�����ȣ)
					// 3. ����Ʈ��.remove(�ε�����ȣ)
					// 4. ����Ʈ��.size()
					// 5. ����Ʈ��.clear() 
				// 5.  ArrayList vs Vector : ����ȭx:���Ͻ�����  /  ����ȭo:��Ƽ������
				// 6.  ArrayList vs LinkedList : �˻����� / ����,���� ����
		
		// ��1) ArrayList Ŭ���� 
			// 1. ���� 
			List< String > list = new ArrayList<>();
			ArrayList< String> list2 = new ArrayList<>();
			// �������̽�/Ŭ������ < ����Ʈ�� ���� Ŭ������ > ����Ʈ�� = new ArrayList<��������>();
			
			// 2. �޼ҵ�
				// 1. ����Ʈ�� ��ü �߰��ϱ� 
				list.add("java"); // ����Ʈ�� ��ü �ֱ� 
				//list.add(123); // ����Ʈ�� ����� Ŭ������ �ֱ� ���� 
				list.add("python");
				list.add("database");
				list.add("c++");
				// 2. ����Ʈ�� ��ü ȣ���ϱ� 
				System.out.println( list.get(0) );
				// 3. ����Ʈ�� ��ü �����ϱ� 
				list.remove(0); // ������ �ε��� �ڷ� ��ĭ�� �����
				System.out.println(list.get(0) );
				// 4. ����Ʈ�� ��ü�� 
				System.out.println( list.size() );
				// 5. �ݺ��� Ȱ��1
				for( int i = 0 ; i<list.size() ; i++ ) {
					System.err.println(  list.get(i)  );
				}
				// 6. �ݺ��� Ȱ��2
				for( String temp : list ) {
					System.out.println( temp );
				}
				// 7. ��ü ��� ���� 
				list.clear();
		// 2. Set �÷��� 
		// 3. Map

	}
}
