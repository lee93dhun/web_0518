package Day08;

import java.util.Scanner;

public class �Խ��� {
	Scanner scan = new Scanner(System.in);
	// �ʵ�
		// int ��ȣ;  // => ����Ʈ ��� ���� => ����Ʈ �ε���
		String ����;
		String ����;
		String �ۼ���;
		int ��ȸ��;
	// ������ : �������� �̸��� Ŭ������� �����ϰ� ����
		// 1. �������
		public �Խ���() {		
		}
		// 2. ��� �ʵ带 �޴� ������ 
		public �Խ���( String ���� , String ���� , String �ۼ��� , int ��ȸ�� ) {

			this.���� = ����;  // �μ��� ���� ��ȣ�� ����Ŭ������ ��ȣ�� �־��ֱ� 
			this.���� = ����;
			this.�ۼ��� = �ۼ���;
			this.��ȸ�� = ��ȸ��;
		}
	// �޼ҵ� 
		// 1. �Խù����
		public void �Խù����() {
			System.out.println("----->�Խù� ��� ");
			System.out.print("���� : "); String ���� = scan.next();
			System.out.print("���� : "); String ���� = scan.next();
			System.out.print("�ۼ��� : "); String �ۼ��� = scan.next();	
			// ��ü ���� : �Է°��� �������� �μ��� �־��ֱ� 
				// �Խù� ��ȣ : ����Ʈ�� ����� �� ��ü���� +1
			�Խ��� temp = new �Խ���( ����, ����, �ۼ���, 0);
			// ���� �Խù� �������ִ� ����Ʈ�� ���� 
			Day08_2.�Խù����.add(temp);
		}
		// 2. �Խù� ��� 
		public void �Խù����() {
			System.out.println(this.����+"\t\t\t"+this.�ۼ���+"\t"+this.��ȸ��);
		}
		// 2. �Խù����� 
		public void �Խù�����( int ��ȣ ) { // int ���� ������ int�� �ޱ� 
			System.out.println("-----> ���� ������ ");
			Day08_2.�Խù����.remove(��ȣ);
			System.out.println("-----> �Խù� ���� �Ϸ�");
		}
		// 3. �Խù���ȸ�� ����
		public void �Խù���ȸ��() {
			this.��ȸ��++; // 1 ���� 
		}
		// 4. �ش� �Խù� �󼼺��� 
		public void �Խù�����( int ��ȣ ) { // �μ� �ޱ� 
			�Խ��� temp = Day08_2.�Խù����.get(��ȣ); // 1�� �Խù� => 0�� �ε��� �������� 
			temp.�Խù���ȸ��(); // �Խù� ��ȸ�� ����
			System.out.println("------> �Խù� �������� ");
			System.out.println(" ���� : "+ temp.���� +"    ��ȸ�� : "+ temp.��ȸ��);
			System.out.println(" ���� " + temp.����);
		}

}
