package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;

public class MemberRun {
	
	   public    static   void   main(String[] args) {
    // [����������] [�����]  ��ȯ��	  �޼����([�Ű�����]) => []���ȣ �ȿ��ִ°� ���������ִٴ� ��

		MemberService service = new MemberService(); // �Ű������� �ƹ��͵� ���¾ֵ��� �⺻ �����ڶ�� �Ѵ�.
		// MemberService�� �⺻ �����ڰ� �ۼ��Ǿ� ���� ������ (MemberService ������ �ۼ� �ȵǾ�����)
		// �������� ��� ����
		
		// ��??? �����Ϸ��� �ڵ带 ������ ��
		// Ŭ���� ���ο� �����ڰ� �ϳ��� ���ٸ�
		// �ڵ����� �⺻ �����ڸ� �߰�����.
		
		// !!!!!(����) �����ڰ� �ϳ��� ������ �ڵ� ������ �����ش�!!!!!
		/* �翬�ѰͰ����� ���� ���� �ϴ� �Ǽ��� ~! */
		// The constructor MemberService() is undefined
		   
		service.displayMenu();
				// �޼��� ȣ��
		
		
	}

}
