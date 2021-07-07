package domain;

public class Board {
	
	// �ʵ� => ���� / ��ü 
	private int bno;		// �Խù���ȣ
	private String btitle;	// �Խù�����
	private String bcontents;	// �Խù�����
	private String bwriter;	// �Խù� �ۼ���
	private String bdate; // �Խù� �ۼ��� 
	private int bcount; // �Խù� ��ȸ�� 
	
	// ������1 : ������� 
	public Board() {}
	// ������2 : ��� �ʵ带 �޴� ������ [ db ȣ��� ]
	public Board(int bno, String btitle, String bcontents, String bwriter, String bdate, int bcount) {
		this.bno = bno;
		this.btitle = btitle;
		this.bcontents = bcontents;
		this.bwriter = bwriter;
		this.bdate = bdate;
		this.bcount = bcount;
	}
	// ������3 : �Խù� ��ȣ[bno]�� ������ ���� [ db ���Կ� ] 
	public Board( String btitle, String bcontents, String bwriter, String bdate, int bcount) {
		this.btitle = btitle;
		this.bcontents = bcontents;
		this.bwriter = bwriter;
		this.bdate = bdate;
		this.bcount = bcount;
	}

	// get , set : �ʵ忡 ����/ȣ�� ����
	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcontents() {
		return bcontents;
	}

	public void setBcontents(String bcontents) {
		this.bcontents = bcontents;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public int getBcount() {
		return bcount;
	}

	public void setBcount(int bcount) {
		this.bcount = bcount;
	}
	
	
	
	
	
	

}
