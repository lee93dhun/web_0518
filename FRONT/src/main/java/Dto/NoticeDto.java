package Dto;

public class NoticeDto {
	
	private int nno ;
	private String ntitle;
	private String ncontents;
	private String nwriter;
	private String ndate;
	private int ncount;
	private String nfile;
	
	public NoticeDto() {
	}
	// �Խù� ȣ���
	public NoticeDto(int nno, String ntitle, String ncontents, String nwriter, String ndate, int ncount, String nfile) {
		this.nno = nno;
		this.ntitle = ntitle;
		this.ncontents = ncontents;
		this.nwriter = nwriter;
		this.ndate = ndate;
		this.ncount = ncount;
		this.nfile = nfile;
	}
	// �Խù� ��Ͻ� 
	public NoticeDto(String ntitle, String ncontents, String nwriter, int ncount, String nfile) {
		this.ntitle = ntitle;
		this.ncontents = ncontents;
		this.nwriter = nwriter;
		this.ncount = ncount;
		this.nfile = nfile;
	}
	// �Խù� ������ 
	public NoticeDto(String ntitle, String ncontents, String nfile) {
		this.ntitle = ntitle;
		this.ncontents = ncontents;
		this.nfile = nfile;
	}
	
	public int getNno() {
		return nno;
	}
	public void setNno(int nno) {
		this.nno = nno;
	}
	public String getNtitle() {
		return ntitle;
	}
	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}
	public String getNcontents() {
		return ncontents;
	}
	public void setNcontents(String ncontents) {
		this.ncontents = ncontents;
	}
	public String getNwriter() {
		return nwriter;
	}
	public void setNwriter(String nwriter) {
		this.nwriter = nwriter;
	}
	public String getNdate() {
		return ndate;
	}
	public void setNdate(String ndate) {
		this.ndate = ndate;
	}
	public int getNcount() {
		return ncount;
	}
	public void setNcount(int ncount) {
		this.ncount = ncount;
	}
	public String getNfile() {
		return nfile;
	}
	public void setNfile(String nfile) {
		this.nfile = nfile;
	}
	
	
	
	
	
	
	

}
