package building;

import human.Subscriber;

public interface Newspaper {

	//신문을 구독하다
	public void subscribe(Subscriber subscriber);
	
	//구독 탈퇴하다
	public void quit(Subscriber subscriber);
	
	//신문을 배달하다
	public void deliver();

}
