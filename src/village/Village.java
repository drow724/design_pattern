package village;

import building.BillysNewspaper;
import human.Human;
import human.Subscriber;
import people.James;

public class Village {

	public static void main(String[] args) {

		// 마을에 '빌리네 신문회사'라는 신문사가 설립되었습니다.
		BillysNewspaper newspaper = new BillysNewspaper();

		// '빌리네 신문회사'구독자인 james도 살고있습니다.
		Human james = new James(newspaper);

		// '빌리네 신문회사'는 새로운 소식을 취재합니다.
		newspaper.coverning("새누리당", "강호동", "디자인패턴");
		System.out.println(james.toString());
		
		newspaper.coverning("자유한국당", "유재석", "스프링 프레임워크");
		System.out.println(james.toString());
		
		newspaper.coverning("국민의힘", "신동엽", "코딩테스트");
		System.out.println(james.toString());
		
		// 구독 요금이 미납된 james를 구독최소 시킵니다.
		newspaper.quit((Subscriber) james);

		// '빌리네 신문회사'는 새로운 소식을 취재합니다.
		newspaper.coverning("더불어민주당", "이휘재", "자바");
		System.out.println(james.toString());
		
	}

}
