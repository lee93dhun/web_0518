package Day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Day11_3 {
	
	// main �ۿ��� ���� : 
	public static ArrayList<����> ���¸�� = new ArrayList<>();
		// static : �޸� �켱�Ҵ� => ���α׷������ �Ҵ�/���α׷������ �ʱ�ȭ
			// ������ : ���α׷� ��ü ���Ǵ� �޸�
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		ATM atm = null ; // �������̽� ���� 
		atm = new ����();
		while(true) {
			System.out.println("1.�������� 2.�������� 3.�������� 4.����");
			System.out.print("����"); int ���� = scan.nextInt();
			if( ���� == 1 ) {
				System.out.println("----->�������� ����");
				atm = new ��������();
				atm.�޴�();
			}
			if( ���� == 2 )
			if( ���� == 3 )
			if( ���� == 4 ) { atm.����(); return; }
		}
		
	}

}
