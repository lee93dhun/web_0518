package Day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Day16_1 {
	
	public static void main(String[] args) {
		
		
		// �÷��� �����ӿ�ũ 
			// 1. List �÷��� : ����[�ε���] �ִ� ����  
				// 1. ArrayList Ŭ���� : ����ȭX : �˻����� 
				// 2. Vector Ŭ���� : ����ȭO
				// 3. LickedList Ŭ���� : ����/���� ����
		
			// 2. Set �÷��� : ������ ���� ���� // �ߺ���� X
				// 1. HashSet Ŭ���� 
					// Iterator �������̽� �̿��� ��� ���� 
		
			// 3. Map �÷��� : Ű,�� => �ѽ�
				
		
		// 1. ����
		List<User> list = new Vector<>();
			// �������̽� : �߻�޼ҵ�[ �������� �ʴ� �޼ҵ� ] : Ŭ���� �޸��Ҵ� �ʿ�
				// �������̽� ȥ�ڼ� �Ҽ��ִ� ��� X
		Vector<User> list2 = new Vector<>();
			// < > ���׸� :  �ش� Ŭ������ Ŭ���� �ֱ� 
		// 2. �޼ҵ�
		User user = new User(); // ��ü ���� 
		list.add( user );
				// <Ŭ����>�� ��ü 
		list.add( new User() ); // �ߺ���� 
		
		list.remove(0);	// ù��° ��ü ���� 
		System.out.println( list.size() ); // ����Ʈ�� ��ü�� 
		
		for( User temp : list ) {
					// list�� ��ü�� �ϳ��� temp ����
			System.out.println( temp );
		}
		
		//
		List< String > list3 = new ArrayList<String>();
		List< String > list4 = new LinkedList<>();	
		
		Long ����;
		Long ��;
		
		���� = System.nanoTime(); // ���� �ð�[����] �޼ҵ� 
		for( int i = 0 ; i<10000 ; i++ ) {
			list3.add( 0 , String.valueOf(i));
							// String.valueOf(����) => ���� 
		}
		�� = System.nanoTime();
		System.out.println(" arraylist 10000�� ���� �ɸ��ð� : "  + (��-����) +"ns" );
		
		���� = System.nanoTime(); // ���� �ð�[����] �޼ҵ� 
		for( int i = 0 ; i<10000 ; i++ ) {
			list4.add( 0 , String.valueOf(i));
							// String.valueOf(����) => ���� 
		}
		�� = System.nanoTime();
		System.out.println(" LinkedList 10000�� ���� �ɸ��ð�: "  + (��-����) +"ns" );
		
		
		// HashSet Ŭ���� 
		//1.���� 
		Set<String > set = new HashSet<>();
		HashSet<String > set2 = new HashSet<>();
		
		//2. �޼ҵ� 
		set.add("java");
		set.add("java"); // �ߺ�����  
		set.add("c");
		set.add("database");
		System.out.println(" set�� ��ü�� : "+ set.size());
		set.remove("c"); // ��ü ���� 
		System.out.println(" set�� ��ü�� : "+ set.size());
		
		for( String temp : set ) {
			System.out.println( temp );
		}
		
		// get ???? -----> Iterator �������̽� 
		Iterator<String> iterator = set.iterator();
			// Iterator : ���� ���� �÷��ǿ� ��� ��ü ��ȸ �������̽� 
				// null ���� ���� next() �޼ҵ�� �������� �̵� 
		while( iterator.hasNext() ) {
					// hasNext() : ���� ��Ұ� �ִ��� ���� Ȯ�� T / F
			String temp = iterator.next(); // ���� ��� ȣ�� 
			System.out.println( temp );
		}
		set.clear();
		
		
		
		
		
		
		
		
		
		
		
	}

}
