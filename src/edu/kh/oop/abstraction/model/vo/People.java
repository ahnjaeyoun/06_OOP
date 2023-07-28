package edu.kh.oop.abstraction.model.vo;

// VO(Value Object) : �� ����� ��ü�� ����� ���� Ŭ������ ��Ƶδ� ��Ű��

public class People { // ����(���) Ŭ����
	
	// Ŭ������? ��ü�� Ư��(�Ӽ�, ���)�� ������ ��
	// == ��ü�� ����� ���� ���赵
	
	// ĸ��ȭ(Encapsulation)
	// - �����Ϳ� ����� �ϳ��� ��� �����ϴ� ���
	// - �������� �������� ������ ���� �ϴ� ���� ��Ģ�̴�.
	//   -> ���� ������ ���ϱ� ������ 
	//      Ŭ���� ���ο� ���� ���� ����� �����ϴ� ����� �ۼ��صд�.
	
	
	
	// �Ӽ� == �� == data
	// ���� �����ϱ� ���� ���� ���� 
	// -> �����̶�� ���������� �������ִ� �Ӽ��� �ۼ�(�߻�ȭ)
	//   �̸�, ����, �ֹι�ȣ, �ּ�, ��ȭ��ȣ, ����
	/* public ���� ó�� �����ϰ��� ĸ��ȭ�Ҷ� private���� ����*/
	private String name;
	private char gender;
	private String pNo; //  "220303-3456789"
	private String address;
	private String phone;
	private int age;
	// double bitCoin; // �������� �ƴϹǷ� ����
	
	// *** ������ ���� ���� ���� ***
	// public(������) -> private(������, ��������) ����
	
	
	
	// ��� == �ൿ == method
	
	public void tax() { 
		System.out.println("������ ���ϴ�.");
	}
	
	public void vote() {
		System.out.println("��ǥ�� �մϴ�.(�� �ϼ���)");
	}
	
	
	// ĸ��ȭ���� ����� ���� ���� ���(getter / setter)
	public void setName(String name) { // setter
		// �ܺηκ��� ���� ���� name��
		// ���� ��ü�� �Ӽ� �� name ( == this.name )�� ����
		
		this.name = name;
	}
	
	public String getName() { // getter
		// ���� ��ü�� �Ӽ� �� name�� ȣ���� ������ ��ȯ(return)
		return name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	// alt + shift + s  �Ǵ� ��� �޴� Source
	// -> Generate Getters and Setters... Ŭ��
	// -> select All  -> generate
	
	
	
	
	
	
	
	
	
}
