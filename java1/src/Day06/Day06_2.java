package Day06;

public class Day06_2 {
	
	public static void main(String[] args) {
		
		// Day01 : ���
		// Day02 : �Է�
		// Day03 : ���� / �ڷ���
		// Day04 : ������ / ���
		// Day05 : �ݺ��� 
		
		// �迭 : Ư������[�ε���] ���� ������� ����� ���� 
			// ������ ������ ���ÿ� �����ϱ� ���ؼ�
			// ���� -> �޸��Ҵ�
			// �迭 -> ������ ���� -> ������ �޸��Ҵ�
			// �ε��� : ������ �迭�� ����Ǵ� ���� 
				// **** 0������ ~~~
		
		int ����1 ; // 4����Ʈ ����
		int ����2 ; // 4����Ʈ ����
		int ����3 ; // 4����Ʈ ����
		
		// �迭 ���� 
		int[] �迭���� = new int[3]; // int*3 => 12����Ʈ �迭 
		// �迭 ȣ�� 
		System.out.println( �迭����[0] ); // �迭ȣ��
		System.out.println( �迭����[1] );
		System.out.println( �迭����[2] );
		//System.out.println( �迭����[3] ); // �ش� �ε��� ����

		// ������ 
		�迭����[0] = 10;
		�迭����[1] = 20;
		�迭����[2] = 30;
		System.out.println( �迭���� ); // �迭�� �ּҰ� 
		System.out.println( �迭����.length ); // �迭�Ǳ���
		System.out.println( �迭����.toString() ); // �迭�� �ּҰ� 
		System.out.println( �迭����[0] );
		
		// 1���� �迭 int[] �迭�� = new int[]
		// 2���� �迭 int[][] �迭�� = new int[��][��]
		
		int[][] �迭����2 = new int[2][2]; // 2�� 2�� 
		�迭����2[0][0] = 80;
		�迭����2[0][1] = 90;
		�迭����2[1][0] = 100;
		�迭����2[1][1] = 110;
		System.out.println( �迭����2.length ); // �� ���� 
		System.out.println( �迭����2[0].length); // �� ���� 
		System.out.println( �迭����2[0][0] );
		System.out.println( �迭����2[0][1] );
		System.out.println( �迭����2[1][0] );
		System.out.println( �迭����2[1][1] );
		
		
		
		
		
		
		
		
		
		
		
	}

}
