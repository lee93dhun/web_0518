package Day02;

public class �ڽ� <�Ű�Ŭ����> {

	private String name;
	private �Ű�Ŭ����[] ���;
	
	public �ڽ�( String name , int �ο��� ) {
		this.name = name;
		��� = (�Ű�Ŭ����[])new Object[�ο���];
			// (�ڷ���/Ŭ����) ����/��ü   : ��������ȯ 
	}
	public void add( �Ű�Ŭ���� �Ű���ü) {
		for( int i = 0 ; i<���.length ; i++ ) {
			if( ���[i] == null) { // �迭�� ��������� 
				���[i] = �Ű���ü; break; // ��ü �ֱ� => �ݺ��� �� 
			}
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public �Ű�Ŭ����[] get���() {
		return ���;
	}
	public void set���(�Ű�Ŭ����[] ���) {
		this.��� = ���;
	}
	
	

}
