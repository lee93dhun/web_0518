package Day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Day16.Board;
import Day16.User;

public class Day15_1 {

	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<ȸ��> ȸ����� = new ArrayList<>();
	
	public static List < Map< Integer , User> > usermap = new ArrayList<>();
	public static List < Map< Integer , Board > >  Boardmap = new ArrayList<>();
	
	public static Map< String , ArrayList<Map<Integer, Object >> > supermap  = new HashMap<>();
	
	public static void main(String[] args) {
		
		
		while(true ) {
			System.out.println("========= �α��� ==========");
			System.out.println("1.ȸ������ 2.�α��� 5.����");
			System.out.println("3.��й�ȣã��[id,email] 4.���̵�ã��[name,email]");
			int ���� = scanner.nextInt();
			ȸ�� temp = new ȸ��();
			if( ���� == 1 ) { temp.ȸ������(); }
			if( ���� == 2 ) {}
			if( ���� == 3 ) { temp.�н�����ã��();}
			if( ���� == 4 ) { temp.���̵�ã��();}
	
		}
	
		
	}
		
	


}
