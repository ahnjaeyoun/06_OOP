package edu.kh.oop.cls.model.vo;

class TestVO {

// ���� ������ (default) : ���� ��Ű�� �������� import�� �������� ��Ÿ��.
	
	
// Student�� ���� ��Ű���� �ֱ� ������
// -> public, protected, (default) 3���� ���� ����

	public void ex() {
		System.out.println("���� ��Ű��");
		
		Student std = new Student(); // �л� ��ü ����

		System.out.println(std.v1);
		System.out.println(std.v2);
		System.out.println(std.v3);
		
		//System.out.println(std.v4);
		// v4�� private �̱� ������ ���� ��Ű����
		// �ٸ� Ŭ�������� ���� ���� �Ұ�
		
		
	}

	
	
}
