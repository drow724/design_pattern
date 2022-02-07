package law;

public class TrafficLaw extends IndividualLaw {

	public TrafficLaw(Law law) {
		super(law);
	}

	public String enactment() {
		return "교통 규칙을 추가합니다.";
	}

	@Override
	public String enforcement() {
		return super.enforcement() + enactment();
	}
}