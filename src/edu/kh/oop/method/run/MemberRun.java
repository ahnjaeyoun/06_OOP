package edu.kh.oop.method.run;

import edu.kh.oop.method.model.service.MemberService;

public class MemberRun {
	
	   public    static   void   main(String[] args) {
    // [접근제한자] [예약어]  반환형	  메서드명([매개변수]) => []대괄호 안에있는건 없을수도있다는 뜻

		MemberService service = new MemberService(); // 매개변수가 아무것도 없는애들을 기본 생성자라고 한다.
		// MemberService의 기본 생성자가 작성되어 있지 않지만 (MemberService 가보면 작성 안되어있음)
		// 문제없이 사용 가능
		
		// 왜??? 컴파일러가 코드를 번역할 때
		// 클래스 내부에 생성자가 하나도 없다면
		// 자동으로 기본 생성자를 추가해줌.
		
		// !!!!!(주의) 생성자가 하나라도 있으면 자동 생성을 안해준다!!!!!
		/* 당연한것같지만 제일 많이 하는 실수다 ~! */
		// The constructor MemberService() is undefined
		   
		service.displayMenu();
				// 메서드 호출
		
		
	}

}
