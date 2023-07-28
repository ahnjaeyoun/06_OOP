package edu.kh.oop.method.model.vo;

public class Member {

	// �ʵ�
	private String memberId; // ���̵�
	private String memberPw; // ��й�ȣ
	private String memberName; // �̸�
	private int memberAge; // ����
	
	// �⺻ ������
	/* �⺻������ ��Ģ: ��ȯ���� ����, Ŭ���� �̸��� ���ƾ��Ѵ� */
	public Member() { }
	
	// �Ű����� ������ (�ʵ� ��� �ʱ�ȭ �뵵)
	/*ex. �ʵ尪 4���� �Ű������� 4��!*/
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		// �����ε� ����(�Ű����� ���� �ٸ�)
		
		// ���� ���� ���� �ʵ�� �Ű� ���
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}


	// ���(getter/setter)
	/* �ڵ��ϼ�: alt + shift + s => (r)*/
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	
	public String getMemberName() {
				// get + �ʵ��
		return memberName;
	}

	// �Ű������� ���� ���� ���� memberName �ʵ忡 ����
	// (�Ű����� == ���� ���� ���� ���ϰ� �ִ� ����)
	public void setMemberName(String memberName) {
				// set + �ʵ��
		
		this.memberName = memberName;
	}

	
	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}


}






