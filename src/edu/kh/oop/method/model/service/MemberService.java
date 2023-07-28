package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

public class MemberService { // Ŭ����

	/* Ŭ�������� �Ӽ��� ����� �ۼ��� �մϴ�. */
	
	// �Ӽ�(�ʵ�) 
	/* �̰��� �ʵ��� ����. 
	 * �ʵ�� �⺻������ ĸ��ȭ ��Ģ�� ���ؼ� private�̶�� ���������ڸ� �� �ۼ��ؾ��մϴ�.
	 * �ʵ忡 ������ �ϳ� �ۼ��ϸ�,  Ŭ���� �ȿ��� ��𿡼��� ����� �� �ֽ��ϴ�!
	 * �츮 ���ݲ� �޼ҵ忡�ٰ� �Ź� ������ ��ĳ�ʸ� �ϳ��� �����س��� ����߾��µ�,
	 * ���� �ʵ忡�ٰ� �����ؼ� �������⼭ ��밡���ϵ��� �Ұſ���.
	 */
	private Scanner sc = new Scanner(System.in); 
	// System.in : �ڹٿ��� �⺻������ �����ص� �Է� ��ġ(Ű����)
	
	private Member memberInfo = null; // ������ ȸ���� ������ ������ ����
	private Member loginMember = null; // �α����� ȸ���� ������ ������ ����

	// ���(������, �޼���)
	// ** ���� ����� �ϳ��� �޼ҵ忡 ��� �ۼ���������, �ϳ��� ��ɸ� �����ϵ��� �ۼ�����
	/* �޼ҵ�� �޼ҵ�� �� �ϳ��� ��ɸ��� �������ִ°� ����.
	 * ��??
	 * ==> ��ɺ��� ����ȭ �س��� �ʿ��� ��ɸ��� ȣ���ؼ� �� �� �ִ�.
	 * ex) � public void today() ��� �޼ҵ尡 �ִٰ�����.
	 * today �޼ҵ忡 1.�����Դ� 2.�����ϴ� �� �Ѵ� ������.
	 * ö���� �� �޼ҵ带 ȣ���ϸ� �����԰� �����ϰ� �Ѵ� �ؾ���.
	 * �ٵ� ����� �丸�԰�ʹ�. ������ �� �޼ҵ�� �����԰�, �����ϰ� �ݵ�� �ΰ��� ����� �����ؾ���
	 * ==> �޼��� �ϳ��� �Ѱ��� �ʰ��� ����� ������ ���ʿ��� �۾��� �� �ʿ��ϰ� �ȴ�.
	 * �ذ��� ==> public void today()�� �ƴ϶� 
	 * 1. public void eat(){ �����Դ� }
	 * 2. public void work() { �����ϴ� }
	 * �̷��� �ΰ����� ������ �޼ҵ带 �����, 
	 * ö������ eat(); work(); ���񿡰� eat(); �� �Ҽ��ְ� �˴ϴ�.
	 * */
	public MemberService() { } // �⺻ ������
	// public MemberService(int a) { } /* �Ѱ��� �����ڰ� ������ MemberRun���� ������ */
	// ��?? �����ڰ� �ϳ��� �ֱ⶧���� �����Ϸ��� �⺻�����ڸ� �⺻������ ���������� ����
		
	//	***�޼��� �ۼ���***
		
	// 	[���� ������]      [�����]      ��ȯ��        �޼ҵ��([�Ű�����]) { }
	//	public		    static     �⺻�ڷ���
	//	protected       final      ������(�迭, Ŭ����)
	//	(default)      abstract       void
	//	private      static final
		
	// ** ��ȯ�� void **
	// - ��ȯ(return)�̶�? �޼��� ���� �� ȣ��η� ���ư��� ��
	// - ��ȯ �� : ���� ���鼭 ������ ��� ��
	// - ��ȯ �� : ��ȯ ���� �ڷ���
	//    -> void(�ֺ�, ����, ��ȿ��) : �������� ��(��ȯ ��)�� ����
	
	// �޴� ȭ�� ��� ���
	public void displayMenu() {
		/* �� �޼ҵ�� ��������� �����ٰ��� ����. void�̱� ������
		 * ���� ������ ���ƿ��� ������� ����.
		 * */
		
		int menuNum = 0; // �޴� ���ÿ� ����
		
		do { // �� ���� ������ �ݺ�
			
			System.out.println("===== ȸ�� ���� ���� ���α׷� v1 =====");
			System.out.println("1. ȸ�� ����");
			System.out.println("2. �α���");
			System.out.println("3. ȸ�� ���� ��ȸ");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("0. ���α׷� ����");
			
			System.out.print("�޴� �Է� >> ");
			menuNum = sc.nextInt(); // �ʵ忡 �ۼ��� Scanner sc ���
			sc.nextLine(); // �Է� ���ۿ� ���� ���� ���� ����
			
			switch(menuNum) {
			case 1 :  System.out.println(  signUp() 
					/* ���� Ŭ�������� �־ �޼ҵ� �̸��� �ۼ��ص� ȣ�� ����.
					 *  service.signUp() �̷��� �Ƚᵵ �� */
					);  break;
				// **���� Ŭ���� ���ο� �ִ� �ʵ�, �޼���� �̸��� �ҷ��� ȣ�� ����!!**
				// signUp() �޼��带 ȣ���Ͽ� ���� �� ��ȯ ���� ���� ���.
			
			case 2 :  System.out.println( login() );  break;
			case 3 :  System.out.println( selectMember() );  break;
			case 4 :  
				
				int result = updateMember(); // ȸ�� ���� ���� �޼��� ���� �� 
											 // ��ȯ�Ǵ� ����� result ������ ����
				
				if(result == -1) {
					System.out.println("�α��� �� �̿� ���ּ���.");
				
				} else if(result == 0) {
					System.out.println("ȸ�� ���� ���� ����(��й�ȣ ����ġ)");
					
				} else { // result == 1
					System.out.println("ȸ�� ������ ���� �Ǿ����ϴ�.");
					
				}
				
				break;
			
			case 0 : System.out.println("���α׷��� �����մϴ�..."); break;
			
			default : System.out.println("�߸� �Է� �ϼ̽��ϴ�. �ٽ� �Է� ���ּ���.");
			}
			
			
		}while(menuNum != 0); // menuNum�� 0�̸� �ݺ� ����
	
	}
	
	// ȸ�� ���� ���
	public String signUp() { // his method must return a result of type String
		// (��ȯ��)
		// �ش� �޼ҵ尡 ������ ȣ���� ������ ���ư� ��
		// void : ��ȯ�� ���� ����
		// String : String �ڷ��� ���� ������ ���ư���.
		
		System.out.println("\n***** ȸ�� ���� *****");
		
		System.out.print("���̵� : ");
		String memberId = sc.next(); // user01
		
		System.out.print("��й�ȣ : ");
		String memberPw = sc.next();
		
		System.out.print("��й�ȣ Ȯ�� : ");
		String memberPw2 = sc.next();
		
		System.out.print("�̸� : ");
		String memberName = sc.next();
		
		System.out.print("���� : ");
		int memberAge = sc.nextInt();
		
		
		// ��й�ȣ, ��й�ȣ Ȯ���� ��ġ�ϸ� ȸ������
		// ��ġ���� ������ ȸ������ ����
		/* String�� ���� ���Ҷ��� equals �� ����Ѵ� (== �Ұ�, ��ġ���� �ʴ´�(�ּҰ� �����ʴ�).) 
		 * equals() �� **�޼ҵ�** �Դϴ�. ��ü���� ������ ���� �� �ֵ��� �մϴ�.(����� ���� ��ü�� ��)
		 *	== �� �񱳸� ���� **������** �Դϴ�.(����� �ּҰ��� ��)
		 * */
		if( memberPw.equals(memberPw2) ) { // ��ġ�ϴ� ���
			
			// �Է� ���� ������ �̿��ؼ� Member��ü�� ������ ��
			// ������ ��ü�� �ּҸ� �ʵ忡 �ִ� memberInfo�� ����
			memberInfo = new Member(memberId, memberPw, memberName, memberAge);
			
			return "ȸ�� ���� ����!!"; 
			/*��±����� �޼ҵ带 ȣ���Ѱ��� �ѹ��� ����, return�� �̿��� ������ ���� �ۼ��մϴ� */
			
			// return : ���� �޼ҵ带 �����ϰ� ȣ���� ������ ���ư�
			
			// return ��; : ȣ���� ������ ���ư� �� ���� ������ ��.
			
		}else { // ��ġ���� �ʴ� ���
			
			return "ȸ�� ���� ����!!(��й�ȣ ����ġ)";
			
		}
		
	}
	
	// �α��� �޼���(���)
	public String login() {
		
		System.out.println("\n***** �α��� *****");
		
		// ȸ�� ������ �ߴ��� ���� Ȯ��
		// == memberInfo�� ��ü�� �����ϰ� �ִ��� Ȯ��
		
		if(memberInfo == null) { // ȸ�� ������ ���� ���� ���
			// null : �ƹ��͵� �����ϰ� ���� ����
			return "ȸ�� ���Ժ��� ���� ���ּ���.";
		}
		
		
		System.out.print("���̵� �Է� : ");
		String memberId = sc.next();
		
		System.out.print("��й�ȣ �Է� : ");
		String memberPw = sc.next();
		
		// ȸ�� ���� ���� (memberInfo�� �����ϴ� Member ��ü)����
		// ����� ���̵�, ��й�ȣ��
		// �Էµ� ���̵�, ��й�ȣ�� ������ "�α��� ����"
		// �ƴϸ� "���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�".
		
		// ���̵�, ��й�ȣ�� ��� ��ġ�� ���
		if(  memberId.equals(memberInfo.getMemberId())  && 
			 memberPw.equals( memberInfo.getMemberPw() ) ) {
			// �Է� ���� memberId��
			// memberInfo �ʵ忡�� ���� ���� Member��ü�� memberId�� ������ Ȯ��
			
			loginMember = memberInfo; 
			// ������  =   Member��ü �ּ�  ( ���� ���� )
			
			// ȸ�� ���� ������ loginMember�� �����Ͽ� 
			// � ȸ���� �α��� �ߴ����� ������ �� �ְ� ��.
			
			return loginMember.getMemberName() + "�� ȯ���մϴ�.";
		
		} else {
			
			return "���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.";
			
		}
		
	}
	
	// ȸ�� ���� ��ȸ ���
	public String selectMember() {
		
		System.out.println("***** ȸ�� ���� ��ȸ *****");
		
		// 1) �α��� ���� Ȯ�� -> �ʵ� loginMember�� �����ϴ� ��ü�� �ִ��� Ȯ��
		if(loginMember == null) { 
			// loginMember�� �����ϴ� ��ü�� ���� ���0(null)
			
			return "�α��� �� �̿� ���ּ���.";
			// return ������ ����Ǹ� �ش� �޼ҵ�� ��� ����ǰ�
			// ȣ���� ������ ���ư�
		}
		
		// 2) �α����� �Ǿ��ִ� ���
		//    ȸ�� ������ ����� ���ڿ��� ���� ��ȯ(return)
		//    (��, ��й�ȣ�� ����)
		
		String str = "�̸� : " + loginMember.getMemberName();
		//  String    edu.kh.oop.method.model.vo.Member.getMemberName()
		//  ��ȯ��                    �޼��� �ڵ� ��ġ

		str += "\n���̵� : " + loginMember.getMemberId();
		
		str += "\n���� : " + loginMember.getMemberAge() + "��";
		
		// �̸� : ������
		// ���̵� : user01
		// ���� : 25��
		
		return str;
	}
	
	// ȸ�� ���� ����(update) ���
	public int updateMember() {
		
		System.out.println("\n***** ȸ�� ���� ���� *****");
		
		// 1) �α��� ���� �Ǻ�
		//   �α����� �Ǿ����� ������ -1 ��ȯ
		if(loginMember == null) {
			return -1;
		}
		
		// 2) ������ ȸ�� ���� �Է� �ޱ�(�̸�, ����)
		System.out.print("������ �̸� �Է� : ");
		String inputName = sc.next();
		
		System.out.print("������ ���� �Է� : ");
		int inputAge = sc.nextInt();
		sc.nextLine();
		
		// 3) ��й�ȣ�� �Է� �޾Ƽ� 
		//    �α����� ȸ���� ��й�ȣ�� ��ġ���� Ȯ��
		System.out.print("��й�ȣ �Է� : ");
		String inputPw = sc.next();
		
		if( inputPw.equals( loginMember.getMemberPw()  )  ) { 
			// 4) ��� ��ȣ�� ���� ���
			// �α����� ȸ���� �̸�, ���� ������ �Է� ���� ������ ���� ��
			// 1 ��ȯ
			
			loginMember.setMemberName( inputName );
			// �Է� ���� inputName��
			// loginMember�� �����ϴ� Member��ü�� �ʵ� memberName�� ����
			loginMember.setMemberAge( inputAge );
			
			return 1;
			
		} else {
			// 5) ��� ��ȣ�� �ٸ� ��� 0 ��ȯ

			return 0;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
