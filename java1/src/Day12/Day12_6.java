package Day12;

import java.util.Scanner;

public class Day12_6 {
	
	
	public static void main(String[] args) {
	
		// ����1 : ȸ������
			//1. member Ŭ������ �����ؼ� �ʵ� ����
			//2. ��� �ʵ带 private ���� : ���̵� , ��й�ȣ , ���� 
			//3. ���̵� , ��й�ȣ , ����  �Է¹ޱ� 
			//4. ��ü �����Ͽ� public �޼ҵ带 ���� ���� 
			//5. pubilc �޼ҵ� �ʵ� ȣ�� 
		
		Scanner scan = new Scanner(System.in);
		
		// �Է� 
		System.out.print("���̵� �Է� :"); String ���̵� = scan.next();
		System.out.print("��й�ȣ �Է� :"); String ��й�ȣ = scan.next();
		System.out.print("���� �Է� :"); String ���� = scan.next();
		
		// �޼ҵ带 ���� ���� 
		ȸ�� ȸ�� = new ȸ��();
			//ȸ��.���̵� = ���̵�; // ���� ���� 
		ȸ��.set���̵�(���̵�); // �޼ҵ带 ���� ���� �ϱ� 
		ȸ��.set��й�ȣ(��й�ȣ);
		ȸ��.set����(����);

		// �޼ҵ带 ���� ȣ�� 
		System.out.println(" ȸ�����̵� : " + ȸ��.get���̵�() );
		System.out.println(" ȸ����й�ȣ : " + ȸ��.get��й�ȣ() );
		System.out.println(" ȸ������ : " + ȸ��.get����() );
		
		// ����2 : �α��� 
			// 1. ���̵�� ��й�ȣ�� �Է¹޾� �����Ѱ�� �α��� ���� ��� 
			// 2. �������� �ʴ� ��� ����ó�� �߻����� �α��� ���� ���	
		try {
			ȸ��.login( ���̵� , ��й�ȣ);
		}
		catch (Exception e) {
			System.out.println("�α��ν���");
			System.out.println("���л��� : " + e);
		}
		
	
		
	}
}
