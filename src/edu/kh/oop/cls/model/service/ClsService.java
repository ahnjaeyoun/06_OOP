package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;
//import edu.kh.oop.cls.model.vo.TestVO;
// The type edu.kh.oop.cls.model.vo.TestVO is not visible

public class ClsService /*extends Student*/{
						// �θ� Student�� ��� ����
	
	// !!!!!(����) �����ڰ� �ϳ��� ������ �ڵ� ������ �����ش�!!!!!
	/* �翬�ѰͰ����� ���� ���� �ϴ� �Ǽ��� ~! */
	//public ClsService(int num) {}
	// The constructor ClsService() is undefined

	public void ex1() {
		
		// Ŭ���� ���� ������ Ȯ���ϱ�
		
		Student std = new Student();
		// public class�� Student�� import ����
		
		//TestVO test = new TestVO();
		// (default) class�� TestVO�� import �Ұ� (�ٸ� ��Ű��)
		
		System.out.println("�ٸ� ��Ű��");
		
		System.out.println(std.v1);
		// �ٸ� ��Ű�������� ���� ������ public�� ���� X
		
//		System.out.println(std.v2);
//		System.out.println(std.v3);
//		System.out.println(std.v4);
		
		// ��� ���迡�� ���� ���� ����
//		System.out.println(v1);
//		System.out.println(v2); // protected ���� ���� ����
//		System.out.println(v3);
//		System.out.println(v4);
//		
	}
	
	
	public void ex2() {
		
		// static �ʵ� Ȯ�� ����
		
		// �л� ��ü 2�� ����
		Student std1 =  new Student();
		Student std2 =  new Student();
		
		// �л� ��ü�� name ����
		std1.setName("ȫ�浿");
		std2.setName("�迵��");
		
		// ���� ���
		System.out.println(std1.schoolName); // public �̱� ������ ���� ���� ����
		System.out.println(std1.getName());
		
		System.out.println(std2.schoolName); // public �̱� ������ ���� ���� ����
		System.out.println(std2.getName());
		
		// schoolName ����
		std1.schoolName = "KH����������";
		System.out.println("���� �� std1 : " + std1.schoolName); // KH����������
		System.out.println("std2 : " + std2.schoolName); // KH����б� (X) -> KH����������
		/*�޸𸮱��� ppt 8p*/
		
		
		// std3 ����
		Student std3 = new Student();
		System.out.println("std3 : " + std3.schoolName);
		
		System.out.println(std3.getName());
		
		
		// schoolName�� ������� �ߴ� ���� -> ����� �ۼ����� �ʾƼ�
		
		// *** static�� ���� �ʵ�(����)�� 'Ŭ������.������'���� �����. *** 
		Student.schoolName = "KH";
		System.out.println("Student.schoolName : " + Student.schoolName);
		
		
		/* static 
		 * 
		 * 1) ���� �޸� ���� (�Ǵ� ���� �޸� ����) �̶�� ��.
		 * 
		 *  why? ���α׷� ���� �� static�� ���� �ڵ���� ��� 
		 *  static ������ �����ǰ�, 
		 *  ���α׷��� ����� �� ���� ������� ����. (����)
		 *  �׸��� static ������ ������ ������ ��𼭵��� ������ �� �ִ�. (����)
		 * 
		 * 2) ��� ��� :  Ŭ������.������
		 * 
		 * */
	}
	
	
	public void ex3() {
		// ������ Ȯ�� �׽�Ʈ
		
		// Student ��ü�� �⺻ �����ڸ� �̿��� �����ϰ� �̸� �����ϴ� �������� s1�� ����
		/* ��ü�� ����� ���� ���赵 => Ŭ����
		 * new�� ���ؼ� heap������ ���� ��
		 * �Ҵ�� �ּҸ� �����ϱ����� �������� s1�� �ۼ��ϰ� ���Կ���
		 * ���Կ����� �ϱ����ؼ� �ڷ����� ���ƾ��ϴϱ� s1 �ڷ��� Student �ۼ�. ��!
		 * */
		Student s1 = new Student();
					   // �⺻ ������
		
		// User �⺻ �����ڸ� �̿��ؼ� ��ü ����
		User u1 = new User();
		
		// User ��ü �ʵ� �ʱ�ȭ Ȯ��
		System.out.println( u1.getUserId() );
		System.out.println( u1.getUserPw() );
		System.out.println( u1.getUserName() );
		System.out.println( u1.getUserAge() );
		System.out.println( u1.getUserGender() );
		
		
		// User �⺻ �����ڸ� �̿��ؼ� ��ü ����
		User u2 = new User();
		/* u2�� �����ϰ��ִ� ��ü ������� ���������? */
		
		System.out.println( u2.getUserId() );
		System.out.println( u2.getUserPw() );
		System.out.println( u2.getUserName() );
		System.out.println( u2.getUserAge() );
		System.out.println( u2.getUserGender() );
		
		// ������ :  u1�� �����ϰ� �ִ� User��ü��
		//           u2�� �����ϰ� �ִ� User��ü�� �ʵ� ���� ��� ������
		//           why? ���� �⺻ �����ڷ� User ��ü�� �����߱� ������...
		
		System.out.println("----------------------------------------------");
		// �ذ� ��� 1 : setter�� �̿��ؼ� ���ο� ���� ����
		
		u2.setUserId("asdf1234");
		u2.setUserPw("1q2w3e4r");
		u2.setUserName("�迵��");
		u2.setUserAge(19);
		u2.setUserGender('��');
		
		System.out.println( u2.getUserId() );
		System.out.println( u2.getUserPw() );
		System.out.println( u2.getUserName() );
		System.out.println( u2.getUserAge() );
		System.out.println( u2.getUserGender() );
		
		
		// �ذ� ��� 2 : �Ű����� �����ڸ� �̿��ؼ�
		//				 ��ü�� ���� �� �� ���� �ٸ� ������ �ʵ带 �ʱ�ȭ
		
		User u3 = new User("test3", "pass333"); // �Ű����� ������
						// ������ ���� �� ������ ���� �ۼ�(���� �� ���Ѿߵ�!)
						
						// ������ User ��ü�� �ʵ忡 "test3", "pass333" �� �ʱ�ȭ��
		
		System.out.println( u3.getUserId() ); // "test3"
		System.out.println( u3.getUserPw() ); // "pass333"
		
	}
	
	
	public void ex4() { // �Ű����� ������ ����
		
		User u1 = new User(); // �⺻ ������
		User u2 = new User("user02", "pass02"); // �Ű����� 2�� ������
		User u3 = new User("user03", "pass03", "����", 30, '��'); // �Ű����� 5�� ������
		User u4 = new User("user04", "pass04", "�躸��", 25, '��');
		User u5 = new User("user05", "pass05", "��ī��", 40, '��');
		
		System.out.printf("u1 : %s / %s / %s / %d / %c\n", 
						  u1.getUserId(), u1.getUserPw(), u1.getUserName(),
						  u1.getUserAge(), u1.getUserGender() );
		
		System.out.printf("u2 : %s / %s / %s / %d / %c\n", 
				u2.getUserId(), u2.getUserPw(), u2.getUserName(),
				u2.getUserAge(), u2.getUserGender() );
		
		System.out.printf("u3 : %s / %s / %s / %d / %c\n", 
				u3.getUserId(), u3.getUserPw(), u3.getUserName(),
				u3.getUserAge(), u3.getUserGender() );
		
		System.out.printf("u4 : %s / %s / %s / %d / %c\n", 
				u4.getUserId(), u4.getUserPw(), u4.getUserName(),
				u4.getUserAge(), u4.getUserGender() );
		
		System.out.printf("u5 : %s / %s / %s / %d / %c\n", 
				u5.getUserId(), u5.getUserPw(), u5.getUserName(),
				u5.getUserAge(), u5.getUserGender() );
		
	}
	
	
}




