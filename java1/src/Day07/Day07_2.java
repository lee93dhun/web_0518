package Day07;

import java.util.Scanner;

public class Day07_2 {
	
	public static void main(String[] args) {

	// ȸ���� ���α׷� [ ȸ������ , �α��� ] 
		// 1. 2���� �迭 [ �ִ� 100�� ]  
		// 2. �޴� [ ���ѷ��� ]
			// 1. ȸ������
				// 1. ���̵�� ��й�ȣ �Է¹޾� �迭�� ���� 
			// 2. �α��� 
				// 1. ���̵�� ��й�ȣ �Է¹޾� �迭�� �����ϸ� �α��� ���� 
			// 3. ���� 
				// �ݺ��� ���� 
		
		Scanner scan = new Scanner(System.in);
		//�Է°��� ���� => ���� => ������ ���� ���� => �迭
		String[][] ȸ����� = new String[100][2];
		
		while(true ) {
			System.out.println(" === ȸ���� ���α׷� === ");
			System.out.println("1.ȸ������ 2.�α��� 3.����"); int ���� = scan.nextInt();
			
			if( ����==1 ) { // ȸ������ 
				System.out.println("--->ȸ������ ���� ");
				System.out.print(" ���̵� : "); String ���̵� = scan.next();
				
				int ����ġ = 0; 
					// �̹� �����ϴ� ���̵� ������ �ߺ����� 
					for( int i =0 ; i<ȸ�����.length ; i++ ) {
						
						if( ȸ�����[i][0] !=null ) {
							// �Է��� ���̵� �����ϸ� 
							if( ȸ�����[i][0].equals(���̵�) ) {
								System.out.println("--> �̹� �����ϴ� ���̵� �Դϴ�");
								����ġ = 1;
								break;
							}
						}
					}
				
				if( ����ġ == 0 ) { //
					
					System.out.print(" �н����� : "); String ��й�ȣ = scan.next();
					// �Է¹��� ���� ���� => �迭�� ���[null]�� ���� 
					for( int i =0 ;  i < ȸ�����.length ; i++ ) {
						
						if( ȸ�����[i][0] == null ) { // !!! �ش� ���� null �̸�
							ȸ�����[i][0] = ���̵�; // ù��° ���� ���̵� �ֱ� 
							ȸ�����[i][1] = ��й�ȣ; // �ι�° ���� ��й�ȣ �ֱ� 
							System.out.println("--->ȸ������ �Ϸ� ");
							break; // !!!! : ȸ������ ���������� for�� ���� 
						}
					}
				}
			}
			if( ����==2 ) { // �α��� : �Է°��� ������[�迭] �� �� 
				
				System.out.println("--->�α��� ���� ");
				System.out.print(" �α��� ���̵� : "); String ���̵� = scan.next();
				System.out.print(" �α��� �н����� : "); String ��й�ȣ = scan.next();
				
				// �Է°��� �迭�� �� 
				for( int i = 0 ; i<ȸ�����.length ; i++  ) {
					
					if( ȸ�����[i][0] != null ) { // �࿡ ȸ���� �����Ұ�쿡�� �˻� 
	
						if( ȸ�����[i][0].equals(���̵�) && ȸ�����[i][1].equals(��й�ȣ) ) {
							System.out.println("--->�α��� ���� ");
						
							while( true ) { // �α��� ������ �ش��ϴ� ���ѷ���
								
								// ��� ȸ�� ���̵� / ��й�ȣ ���
								System.out.println(" === ȸ�� ��� === ");
								System.out.println("���̵�\t\t��й�ȣ ");
								for( int j = 0 ; j<ȸ�����.length ; j++) {
									if( ȸ�����[j][0] !=null)
										System.out.println(ȸ�����[j][0]+"\t\t"+ȸ�����[j][1]);
								}
								
								System.out.println("1.ȸ��Ż�� 2.�н����庯�� 3.�α׾ƿ�"); int ����2= scan.nextInt();
								if( ����2==1 ) {
									
									// ȸ��Ż�� => �迭���� �����͸� null ���� 
									ȸ�����[i][0] = null; // ���� �α��� �� ���� ���̵� = [i] [0]
									ȸ�����[i][1] = null; // ���� �α��� �� ���� ��й�ȣ = [i] [1]
									
										// Ż���� ȸ�� ���� ȸ���� ��ĭ�� ���� 
										for( int h = i ; h<99 ; h++ ) {
					
											if( ȸ�����[h+1][0] !=null ) { // ���� ȸ���� null �ƴϸ� 
												ȸ�����[h][0] = ȸ�����[h+1][0]; // ��ȸ���� ��ĭ ������ �̵�
												ȸ�����[h][1] = ȸ�����[h+1][0]; // ��ȸ���� ��ĭ ������ �̵� 
											}else {
												ȸ�����[h][0] = null; // ������ ȸ�� �̵��� ������ȸ�� null �� ���� 
												ȸ�����[h][1] = null; // ������ ȸ�� �̵��� ������ȸ�� null �� ���� 
												break; 
											}
										}
									System.out.println("---> ȸ�� Ż�� ����");
									break;
								}
								if( ���� == 2) {
									System.out.println("---> �н����� ���� : "); 
									String �����й�ȣ = scan.next();
									ȸ�����[i][1] = �����й�ȣ; 
									System.out.println("---> �н����� ����Ϸ� --->�α׾ƿ�");
									break;
								}
								if(����2==3) { System.out.println("--->�α׾ƿ�"); break;}
							}
							break;
						}
					}else {
						System.out.println("--->������ ȸ�������� �����ϴ�. ");
						break;
					}
				}

			}
			if( ����==3 ) { System.out.println("--->�̿����ּż� �����մϴ�"); break; }
			
		} // while �� 
		
		
	
		
	}
}
