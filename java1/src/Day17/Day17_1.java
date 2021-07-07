package Day17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day17_1 {
	
	
	public static void main(String[] args) {
		
		// �÷��� �����ӿ�ũ : �ڷᱸ�� [ ������ ���� ���� ]
		
		// Stack Ŭ���� : LIFO
				// ��) : ctrl+z : �ǵ�����
				// �Ա�/�ⱸ ���� => ���� ���߿� ���� �޸𸮰� ���� ���� ����
					// .push( ��ü )  == .add( ��ü )
					// .isEmpty() : ��� ��� �ִ��� Ȯ�� T / F
					// .pop() : ����
		// Queue Ŭ���� : FIFO
				// ��) : �ټ����
				// �Ա�/�ⱸ ���� => ���� ���� ���� �޸𸮰� ���� ���� ����
					// .offer( ��ü )  == .add( ��ü )
		
		Stack< ���� > �������� = new Stack<>();
			// <  > : ���׸� 
		��������.push( new ����(100) );
		��������.push( new ����(200) );
		��������.push( new ����(300) );
		System.out.println("���������� ������ : " + ��������.size());
		
		// for( int i = 0 ; i<��������.size ; i++ ) {   }
		for( ���� temp : �������� ) {
			System.out.println("���� �ݾ�: "+temp.����);
		}
		
		while( !��������.isEmpty() ) { // ! isEmpty()
			���� temp = ��������.pop() ;
			System.out.println(" ���� ���� : " + temp.���� );
		}
		
		Queue<����> ��������2 = new LinkedList<>();		
		
		��������2.offer( new ����(100) );
		��������2.offer( new ����(200) );
		��������2.offer( new ����(300) );
		
		System.out.println(" ��������2 : " + ��������2.size());
		
		for( ���� temp : ��������2 ) {
			System.out.println("���� �ݾ� : "+temp.����);
		}
		
		while( !��������2.isEmpty() ) {
			���� temp = ��������2.poll();
			System.out.println(" ���� �ݾ� : "+temp.����);
		}	
		
		
		
	}
}
