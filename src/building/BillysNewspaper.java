package building;

import java.util.ArrayList;
import java.util.List;

import human.Subscriber;

//신문사(Newspaper) 클래스를 정의한다.
public class BillysNewspaper implements Newspaper {

	// 구독자 목록
	private List<Subscriber> subscribers;
	// 정치 뉴스
	private String politics;
	// 연예 뉴스
	private String entertainment;
	// 프로그래밍 뉴스
	private String programming;

	// 빌리네 신문회사가 생성될 때 구독자 목록을 초기화
	public BillysNewspaper() {
		subscribers = new ArrayList<Subscriber>();
	}

	// 빌리네 신문회사를 마을사람이 구독할 때
	@Override
	public void subscribe(Subscriber subscriber) {
		// 목록에 새로운 구독자를 추가한다.
		subscribers.add(subscriber);
	}

	// 빌리네 신문회사를 구독 취소할 때
	@Override
	public void quit(Subscriber subscriber) {
		// 구독자 목록에서 구독 취소자를 삭제한다.
		subscribers.remove(subscriber);
	}

	// 빌리네 신문회사가 뉴스를 배부할 때
	public void deliverNews() {
		// 신문을 배달하는 메소드 실행
		deliver();
	}

	// 신문을 배달하는 메소드
	public void deliver() {
		for (Subscriber subscriber : subscribers)
			// 구독자 목록에 있는 구독자들에게 정치, 연예, 프로그래밍 뉴스를 배부함
			subscriber.receive(politics, entertainment, programming);
	}

	// 새로운 소식을 취재하는 메소드(setter에 해당)
	public void coverning(String politics, String entertainment, String programming) {
		this.politics = politics;
		this.entertainment = entertainment;
		this.programming = programming;
		// 취재가 끝나고 새로운 소식을 바로 배부함
		deliverNews();
	}

	public String getPolitics() {
		return politics;
	}

	public String getEntertainment() {
		return entertainment;
	}

	public String getProgramming() {
		return programming;
	}

}