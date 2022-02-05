package human;

import behavior.Working;

//사람을 정의하는 클래스
public abstract class Human {

	// 무슨 일 하는지?
	public Working working;

	public void work() {
		working.work();
	}
	
	
	public void findWork(Working working) {
		this.working = working;
	}
	
}
