package Day10;

public class VIPȸ�� extends ȸ�� {
	
	String ȸ�����;

	public VIPȸ��( String ���̵�, String ��й�ȣ , String ȸ�����) {
		super(���̵�, ��й�ȣ);
		this.ȸ����� = ȸ�����;
	}
	
	@Override
	public void ȸ������() {
		super.ȸ������();
		System.out.println( "ȸ����� : "+this.ȸ�����);
	}
}
