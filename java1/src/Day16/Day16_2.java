package Day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day16_2 {
	
	public static void main(String[] args) {
	
		// Map �÷��� 
		// 1. HashMap : ����ȭX // ���� ������
			// 1. map.put( Ű , �� ) => Ű �� �ߺ��Ұ�
			// 2. map.get( Ű ) => Ű �����ϴ� �� ȣ�� 
			// 3. map.keySet() => ��� Ű ȣ�� 
		
		// 2. Hashtable : ����ȭO // ��Ƽ ������ 
		
		// 1. ���� 
		Map< String , Integer > map = new HashMap<>();
			
		map.put( "���缮" , 80 );
		map.put( "��ȣ��" , 70 );
		map.put( "�ŵ���" , 60 );
		
		System.out.println(" map ��ü�� : " + map.size() );
		System.out.println(" ��ȣ�� �˻� : "+map.get("��ȣ��") );
		map.remove("��ȣ��");
		System.out.println(" ������ map ��ü�� : " + map.size() );
		
		for( String key : map.keySet() ) {
			System.out.println( key );
			System.out.println( map.get(key) );
		}
		
		Set<String> setkey = map.keySet(); // ��� Ű ȣ�� => set ���� 
		Iterator<String> iterator = setkey.iterator(); 
		
		while( iterator.hasNext() ) {
			String key = iterator.next();
			System.out.println( key );
			System.out.println( map.get(key) );
		}
		map.clear();
		//
		Map< String , String > map2 = new Hashtable<>();
		map2.put( "qwe", "123");
		map2.put( "qwe", "1234");
		map2.put( "qwe1", "123");
		map2.put( "qwe", "123"); // Ű ���� �ߺ��� ���X // ���� �ߺ����O 
		System.out.println(" ��ü �� : "+map2.size() );
		// Map
		ArrayList< Map<String , Integer> > list = new ArrayList<>();
		Map<String, Integer> map3 = new HashMap<>();
		list.add(  map  );
		list.add( map3 );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
