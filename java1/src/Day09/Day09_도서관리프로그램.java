package Day09;

import java.util.ArrayList;
import java.util.Scanner;

public class Day09_�����������α׷� {
	
	// 1.Ŭ���� ���� => 2.��ü ���� => 3.��ü����[ DB , ���� , �÷��� , �迭 �� ] => 4. CRUD
		// 1. ȸ�� ���� 
			// �ʵ� :  ���̵�[�ĺ���=�ߺ�X] , ��й�ȣ , ���� , �ּ�
			// ������ : �ʼ�X => ���� 
			// �޼ҵ� : ȸ������ , �α��� , ���̵�ã�� , ��й�ȣã�� , ��������� , ȸ������ ��
		// 2. ���� ���� 
			// �ʵ� : ISBN[�ĺ���=�ߺ�X] , ������ , ���� , �뿩����
			// ������ : �ʼ�X => ���� 
			// �޼ҵ� : ������� , ������� , �������� , �������� , �뿩 , �ݳ� ��
	
	// ��ü ���� �÷��� => List �÷���
	public static ArrayList< ȸ�� > ȸ����� = new ArrayList<>();
		// static : �޸� �����Ҵ� : main�޼ҵ� ������ �켱�Ҵ� => ��ü ���α׷� ����� �ʱ�ȭ
			// ��ü ���α׷��� ����[���Ǵ�] �ִ� ����/�޼ҵ� �Ҵ�
	public static ArrayList< ���� > ������� = new ArrayList<>();

	public static Scanner scan = new Scanner(System.in);
	
	
	// main������ �޼ҵ� 
	public static void main(String[] args) {
		// ���α׷� ���� 
		���α׷��۵�(); // ���� Ŭ������ �޼ҵ� ȣ�� : �μ�x 
	}

	// �޼ҵ� 
	public static void ���α׷��۵�() {
		while(true) {
			System.out.println("===���� ���� ���α׷�===");
			System.out.println("1.�α��� 2.ȸ������ 3.���̵�ã�� 4.��й�ȣã�� 5.����");
			System.out.print("���� : "); int ���� = scan.nextInt();
			
			if( ���� == 1 ) {
				ȸ�� temp = new ȸ��(); // �ӽ� ��ü
				temp.�α���();
			}
			else if( ���� == 2 ) {
				ȸ�� temp = new ȸ��(); // �ӽ� ��ü
				temp.ȸ������();
			}
			else if( ���� == 3 ) {
				ȸ�� temp = new ȸ��(); // �ӽ� ��ü
				temp.���̵�ã��();
			}
			else if( ���� == 4 ) {
				ȸ�� temp = new ȸ��(); // �ӽ� ��ü
				temp.��й�ȣã��();
			}
			else if( ���� == 5 ) { 
				System.out.println( "----> ���α׷� ���� �մϴ� "); 
				break;
			}
			else { System.out.println("----> �˼� ���� ��ȣ �Դϴ�");} 
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
} //  Ŭ���� �� 



