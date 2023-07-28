package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : Ư�� ���(����Ͻ� ����)�� �����ϴ� Ŭ����
public class AbstractionService {
	// �ش� Ŭ������ ��ü�� �Ǹ� �Ʒ� ���� ����� ������ �� �ִ�.
	
	public void ex1() {
		
		// ���� ��ü �����
		
		People p1 = new People(); 
		// People p1 : People ��ü�� �ּҸ� �����Ͽ� �����ϴ� ���� p1
		// new People() : ���ο� People ��ü Heap ������ ����
		
		// *** Ŭ���� �̸��� �ڷ��� ó�� ���Ǿ���!
		// == �׷��� Ŭ������ "����� ���� �ڷ���" �̶�� �Ѵ�! ***
		
		People p2 = new People();
		
		
		// ������� ��ü�� �߻�ȭ�� ����Ǿ� �־� ������ �� �� ����
		// -> �Ӽ�(������)�� �߰��Ͽ� �������� �� �� �ְ� ��(��üȭ)
		
		//p1.name = "ȫ�浿"; // The field People.name is not visible
		// ���� ���� ��� 
		
		p1.setName("ȫ�浿"); // setter�� �̿��� ���� ���� ���
		
		//p1.age = 25;
		p1.setAge(25);
		
//		p1.gender = '��';
		p1.setGender('��');
		
//		p1.phone = "010-1234-1234";
		p1.setPhone("010-1234-1234");
		
//		p1.pNo = "980303-1234567";
		p1.setpNo("980303-1234567");
		
//		p1.address = "����� �߱� ���빮�� 120 ���Ϻ��� 2�� A������ �Ǿ��ڸ�";
		p1.setAddress("����� �߱� ���빮�� 120 ���Ϻ��� 2�� A������ �Ǿ��ڸ�");
		
		
		System.out.println("p1�� name : " + p1.getName() );
		System.out.println("p1�� age : " + p1.getAge());
		System.out.println("p1�� gender : " + p1.getGender());
		System.out.println("p1�� phone : " + p1.getPhone());
		System.out.println("p1�� pNo : " + p1.getpNo());
		System.out.println("p1�� address : " + p1.getAddress());
		
		
	
		System.out.println("===================================");
		
		/*
		p2.name = "�鵿��";
		p2.age = 33;
		p2.gender = '��';
		p2.pNo = "900116-1234567";
		p2.phone = "010-2247-1339";
		p2.address = "����� �߱� ���빮�� 120 ���Ϻ��� 2�� A������ �Ǿ��ڸ�";
		
		System.out.println("p2�� name : " + p2.name);
		System.out.println("p2�� age : " + p2.age);
		System.out.println("p2�� gender : " + p2.gender);
		System.out.println("p2�� phone : " + p2.phone);
		System.out.println("p2�� pNo : " + p2.pNo);
		System.out.println("p2�� address : " + p2.address);
		*/
		
		p1.tax();
		p1.vote();
		p2.tax();
		p2.vote();
	}
	
	
	
	
	
}
