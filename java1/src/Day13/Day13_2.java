package Day13;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Day13_2 {
	
	// ���� Ŭ���� ���� 
	// ���� : ����Ʈ�� ������ ��� ���Ͽ� ���� / ������ �о�ͼ� ����Ʈ�� ���� 	
	
	public static ArrayList<user>userlist = new ArrayList<>();
		// public : ����������[��� ���� ����]
			// static : �޸� �켱�Ҵ� [ ���α׷� ����� �ʱ�ȭ]
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		
		// ���� �ҷ����� 
		userlist = FileUtil.readfile( new File("c:/java/","userlist.txt") );
		
		while(true) {
			user temp = new user();
			temp.signup();
		}
		
		
		
		
	}

}
