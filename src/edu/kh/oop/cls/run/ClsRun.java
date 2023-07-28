package edu.kh.oop.cls.run;

import edu.kh.oop.cls.model.service.ClsService;

public class ClsRun {
	/*jvm은 처음에 static에있는 main을 찾아가서 호출함*/
	public static void main(String[] args) {
		
		ClsService service = new ClsService(); // 매개변수가 아무것도 없는애들을 기본 생성자라고 한다.
		// ClsService의 기본 생성자가 작성되어 있지 않지만 (ClsService 가보면 작성 안되어있음)
		// 문제없이 사용 가능
		
		// 왜??? 컴파일러가 코드를 번역할 때
		// 클래스 내부에 생성자가 하나도 없다면
		// 자동으로 기본 생성자를 추가해줌.
		
//		service.ex1();
//		service.ex2(); // static 확인 예제 호출
		
//		service.ex3(); // 생성자 예제
		service.ex4(); // 매개변수 생성자 예제
	}
}
