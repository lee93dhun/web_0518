package Day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day16_3 {
	
	//list �÷��� => map
	public static ArrayList < Map< Integer , User> > usermap = new ArrayList<>();
	public static ArrayList < Map< Integer , Board > >  Boardmap = new ArrayList<>();
	
	// map �÷��� => list
	public static Map< String  , ArrayList< Map<Integer , User >> > supermap = new HashMap<>();
	
	// set �÷��� => map
	public static Set< Map< String , User > > set = new HashSet<>();
	
	// map �÷���  => Ű , set�÷���
	public static Map< String , Set<User> > map2 = new HashMap<>();
	
	public static void main(String[] args) {
		// Map< ȸ����ȣ , User > 
		// Map< �Խù���ȣ , Board >
			// ������ map ���� �ϱ� ���� list ���� 
				// List => map< k , v >
		supermap.put("user", usermap );
			
			Map< String , User > map = new HashMap<>();
			
			map.put("1", new User() );
			map.put("2", new User() );
		set.add( map );
		System.out.println("����� �׽�Ʈ ");
	}
	
}
