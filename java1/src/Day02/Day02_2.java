package Day02;

import java.util.Scanner;

public class Day02_2 {

	public static void main(String[] args) {
		
		// ����1 : 2���� �̸��� 1����~ 3���� ������ ������ �Է� �޾� ��� 
			//		System.out.println("===========�⼮��============");
			//		System.out.println("����\t1����\t2����\t3����");
			//		System.out.println("���缮\t�⼮\t�Ἦ\t�⼮");
			//		System.out.println("��ȣ��\t�Ἦ\t�⼮\t�⼮");
			//		System.out.println("============================");
			//	

		// �Է¹޾� => ������ ���� => ������ ��� 
		// 1. �Է���ġ ��ü �����
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° �л��� : ");
		String �л���1 = scan.next();
		System.out.print("ù��° �� 1���� ��¿��� : ");
		String ����1_1 = scan.next();
		System.out.print("ù��° �� 1���� ��¿��� : ");
		String ����2_1 = scan.next();
		System.out.print("ù��° �� 1���� ��¿��� : ");
		String ����3_1 = scan.next();
		
		System.out.print("�ι�° �л��� : ");
		String �л���2 = scan.next();
		System.out.print("�ι�° �� 1���� ��¿��� : ");
		String ����1_2 = scan.next();
		System.out.print("�ι�° �� 1���� ��¿��� : ");
		String ����2_2 = scan.next();
		System.out.print("�ι�° �� 1���� ��¿��� : ");
		String ����3_2 = scan.next();
		
		System.out.println("===========�⼮��============");
		System.out.println("����\t1����\t2����\t3����");
		System.out.println(�л���1+"\t"+����1_1+"\t"+����2_1+"\t"+����3_1);
		System.out.println(�л���2+"\t"+����1_2+"\t"+����2_2+"\t"+����3_2);
		System.out.println("============================");

		
	}

}
