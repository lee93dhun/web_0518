package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Day17_2 {
	
	
	public static void main(String[] args) {
		
		// ���Ǳ� : stack���� : 3�� ��ǰ 
			// 1. �ݶ� ����[200,10] 2.���̴ٽ���[300,10] 3.ȯŸ����[400,10] 
			// 2. ���� [ scanner ] �Է¹ޱ� 
			// 3. ��ǰ �����ؼ� ��ǰ ����ϰ� ��ǰ ����
			// 4. �ݾ׺����ϸ� ���� x ��ǰ���� x
			// 5. �ܵ� ��� 
		
		Stack<String> �ݶ� = new Stack<>();
		Stack<String> ���̴� = new Stack<>();
		Stack<String> ȯŸ =  new Stack<>();
		// Stack ��ü => List
		List< Stack<String> > ��ǰ��� = new ArrayList<>();
		��ǰ���.add(�ݶ�);
		��ǰ���.add(���̴�);
		��ǰ���.add(ȯŸ);
		Scanner scanner = new Scanner(System.in);
		
		for( int i = 0 ; i<10 ; i++ ) {
			��ǰ���.get(0).push("�ݶ�");
			��ǰ���.get(1).push("���̴�");
			��ǰ���.get(2).push("ȯŸ");
		}
		while( true ) { // ���Ǳ� �ݺ��� 
			System.out.print(" �ݾ� :  "); int �ݾ� = scanner.nextInt();
			
			while( true ) { // ��ǰ���� �ݺ��� 
				
				System.out.println(" ���� ���� �ݾ� : "+�ݾ�);
				
				if( ��ǰ���.get(0).isEmpty() ) {
					System.out.println("1.�ݶ�[����:200  ���: ����]");
				}else {
					System.out.println("1.�ݶ�[����:200  ���: "+ ��ǰ���.get(0).size() +"]");
				}
				if( ��ǰ���.get(1).isEmpty() ) {
					System.out.println("2.���̴�[����:300  ���: ����]");
				}else {
					System.out.println("2.���̴�[����:300  ���: "+ ��ǰ���.get(0).size() +"]");
				}
				if( ��ǰ���.get(2).isEmpty() ) {
					System.out.println("3.ȯŸ[����:400  ���: ����]");
				}else {
					System.out.println("3.ȯŸ[����:400  ���: "+ ��ǰ���.get(0).size() +"]");
				}
				System.out.println("4.�ݾ׹�ȯ ");
				
				int ���� = scanner.nextInt();
				if( ����==1 ) { 
					// �ݾ׺��� ����
					if( �ݾ� < 200 ) { System.out.println("�ݾ��� �����մϴ�");}
					// ������ ���� 
					else if( ��ǰ���.get(0).isEmpty() ) {System.out.println("��� �����ϴ�");}
					// ������ 
					else { 
						System.out.println("�ݶ� ��ȯ");
						��ǰ���.get(0).pop();
						�ݾ� -= 200;
					}
				}
				if( ����==2 ) {
					// �ݾ׺��� ����
					if( �ݾ� < 300 ) { System.out.println("�ݾ��� �����մϴ�");}
					// ������ ���� 
					else if( ��ǰ���.get(1).isEmpty() ) {System.out.println("��� �����ϴ�");}
					// ������ 
					else { 
						System.out.println("���̴� ��ȯ");
						��ǰ���.get(1).pop();
						�ݾ� -= 300;
					}
				}
				if( ����==3 ) {
					// �ݾ׺��� ����
					if( �ݾ� < 400 ) { System.out.println("�ݾ��� �����մϴ�");}
					// ������ ���� 
					else if( ��ǰ���.get(2).isEmpty() ) {System.out.println("��� �����ϴ�");}
					// ������ 
					else { 
						System.out.println("ȯŸ ��ȯ");
						��ǰ���.get(2).pop();
						�ݾ� -= 400;
					}
				}
				if( ����==4 ) { System.out.println("�ܵ� ��ȯ : "+�ݾ�); break;}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}

