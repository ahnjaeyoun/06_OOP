package edu.kh.oop.cls.run;

import edu.kh.oop.cls.model.service.ClsService;

public class ClsRun {
	/*jvm�� ó���� static���ִ� main�� ã�ư��� ȣ����*/
	public static void main(String[] args) {
		
		ClsService service = new ClsService(); // �Ű������� �ƹ��͵� ���¾ֵ��� �⺻ �����ڶ�� �Ѵ�.
		// ClsService�� �⺻ �����ڰ� �ۼ��Ǿ� ���� ������ (ClsService ������ �ۼ� �ȵǾ�����)
		// �������� ��� ����
		
		// ��??? �����Ϸ��� �ڵ带 ������ ��
		// Ŭ���� ���ο� �����ڰ� �ϳ��� ���ٸ�
		// �ڵ����� �⺻ �����ڸ� �߰�����.
		
//		service.ex1();
//		service.ex2(); // static Ȯ�� ���� ȣ��
		
//		service.ex3(); // ������ ����
		service.ex4(); // �Ű����� ������ ����
	}
}
