package village;

import behavior.OfficeJob;
import human.Human;
import people.James;

public class Village {

	public static void main(String[] args) {
		//제임스가 마을에 살고 있습니다.
		Human james = new James();
		
		//제임스는 일을 하러 갑니다.
		james.work();
		
		//제임스는 지금 하고 있는 일이 맞지 않아 다른 일을 찾습니다.
		james.findWork(new OfficeJob());
		
		//제임스는 일을 하러 갑니다.
		james.work();
	}
	
}
