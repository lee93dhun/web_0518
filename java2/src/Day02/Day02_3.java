package Day02;

public class Day02_3 {
	
	// ���׸�
	
	public static void main(String[] args) {
	
		// ���׸� : < >
			// 1. ���� ����Ǵ� �ڷ��� ����Ҷ�
			// 2. ���׸� ���� �Ű�Ŭ������ ����Ŭ������ ��� => ����Ŭ���� ��� ���� 
		
		box ���� = new box();
		����.setObject("����ڽ�"); // ����ڽ� �ְ� 
		String name = (String)����.getObject(); // ����ڽ� ���� 
		System.out.println( name );
		
		����.setObject( new Apple() );
		Apple apple = (Apple)����.getObject();
		System.out.println( apple);
		
		//////////////////////////////////////////////
		box2<String> ����2= new box2<>();
		����2.set("����ڽ�");
		String name2 = ����2.get();
		System.out.println( name2 );
		
		box2<Integer> ����3 = new box2<>();
		����3.set( 10 );
		int �� = ����3.get();
		System.out.println( �� );
		
		box2<Apple> ����4 = new box2<Apple>();
		����4.set( new Apple() );
		System.out.println( ����4.get() );
		
		///////////////////////////////////////////////
		
		// ��Ƽ ���׸�
		
		��ǰ< �ڷ����� , String > ��ǰ1 = new ��ǰ<>();
		��ǰ1.setKind(new �ڷ�����());
		��ǰ1.setModel("����Ʈ�ڷ�����");
		
		System.out.println(" ��ǰ1 : "  + ��ǰ1.getKind() + ��ǰ1.getModel() );
		
		��ǰ<�ڵ��� , String > ��ǰ2 = new ��ǰ<>();
		��ǰ2.setKind(new �ڵ���());
		��ǰ2.setModel("�����ڵ���");
		
		System.out.println(" ��ǰ2 : " + ��ǰ2.getKind() + ��ǰ2.getModel() );
		
		
		

		
		

		
		
	}
}
