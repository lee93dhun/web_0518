package Day09;

import java.util.Random;

public class ĳ���� {
	
	//�ʵ� [ ���� ���� ]
	String �г���;	// ���ڴ� 2����Ʈ 
	int ����;		// 4����Ʈ 
	int HP;			// 4����Ʈ 
	int power;		// 4����Ʈ 
	//������ : Ŭ������� �����ϰ� ����  
	// ������� : �ʵ带 �������� 
	public ĳ����() {
	}
	// ����ʵ������ : ��� �ʵ带 ����
	public ĳ����( String �г��� , int ���� , int HP , int power) {
					// �μ�1   ,   �μ�2   , �μ�3   ,    �μ�4  : { } �ܺηκ��� ������ ������ 
		this.�г��� = �г���;
		//this.����Ŭ������ ���� = �μ� 
		this.���� = ����;
		this.HP =HP;
		this.power = power;
	}
	// �޼ҵ� : �μ� x ��ȯ x
	public void ��������() {
		System.out.println( �г��� + " �������� �߽��ϴ�");
	}
	// �޼ҵ� : �μ� o ��ȯ x
	public void ����( int power) {
		Random random = new Random();
		int rpower = random.nextInt(power)+1;
		System.out.println( rpower + " ��ŭ �����߽��ϴ� ");
	}
	// �޼ҵ� : �μ� o ��ȯ o 
	public int ����( int power ) {
		Random random = new Random();
		int rpower = random.nextInt(power)+1;
		System.out.println( rpower + " ��ŭ ���� ���߽��ϴ� ");
		return rpower;
	}
	// �޼ҵ� : �μ� x  ��ȯ o 
	public int hpȮ��() {
		return this.HP;
	}
	
	

}
