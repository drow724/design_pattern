package people;

import behavior.Programming;
import building.BillysNewspaper;
import human.Human;
import human.Subscriber;

public class James extends Human implements Subscriber {

	//최신 프로그래밍 소식
	private String politics;
	
	private String entertainment;
	
	private String programming;
	
	private BillysNewspaper newspaper;

	public James() {
		// 제임스는 프로그래머이다.
		working = new Programming();
	}

	public James(BillysNewspaper newspaper) {
		// 제임스는 프로그래머이다
		working = new Programming();

		// 제임스는 '빌리네 신문회사' 구독자이다
		this.newspaper = newspaper;
		newspaper.subscribe(this);
	}

	//신문을 받다
	public void receive(String politics, String entertainment, String programming) {
		// 제임스는 프로그래밍 뉴스만 필요하다
		this.politics = politics;
		this.entertainment = entertainment;
		this.programming = programming;
	}

	@Override
	public String toString() {
		return "James [politics=" + politics + ", entertainment=" + entertainment + ", programming=" + programming + "]";
	}
	
}