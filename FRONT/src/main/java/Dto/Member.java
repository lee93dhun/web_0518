package Dto;

public class Member {
	
	// 1. �ʵ� 
	private int mno;
	private String mid;
	private String mpassword;
	private String mname;
	private String memail;
	private String mphone;
	private String madress;
	
	
	// 2. ������
	public Member() {}
	
	// ��� �ʵ带 �޴� ������
	public Member(int mno, String mid, String mpassword, String mname, String memail, String mphone, String madress) {
		this.mno = mno;
		this.mid = mid;
		this.mpassword = mpassword;
		this.mname = mname;
		this.memail = memail;
		this.mphone = mphone;
		this.madress = madress;
	}
	// ȸ����ȣ ���� ������ [ ȸ������ ��Ʈ�� ] 
	public Member(String mid, String mpassword, String mname, String memail, String mphone, String madress) {
		this.mid = mid;
		this.mpassword = mpassword;
		this.mname = mname;
		this.memail = memail;
		this.mphone = mphone;
		this.madress = madress;
	}
	
	// 3.�޼ҵ� [ get, set ��] 
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpassword() {
		return mpassword;
	}
	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMemail() {
		return memail;
	}
	public void setMemail(String memail) {
		this.memail = memail;
	}
	public String getMphone() {
		return mphone;
	}
	public void setMphone(String mphone) {
		this.mphone = mphone;
	}
	public String getMadress() {
		return madress;
	}
	public void setMadress(String madress) {
		this.madress = madress;
	}

	

}
